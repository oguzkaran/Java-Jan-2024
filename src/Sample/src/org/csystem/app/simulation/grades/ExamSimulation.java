package org.csystem.app.simulation.grades;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    private final String m_lectureName;
    private Exam m_exam;

    private static void drawHistogram(Classroom classroom, int maxGrade)
    {
        int [] data = classroom.getHistogramData(maxGrade);
        ArrayUtil.print(data);
        ArrayUtil.drawHistogram(data, 20, '-');
    }

    private static void setGrades(Classroom classroom)
    {
        Random random = new Random();
        int n = classroom.getNumberOfStudents();

        for (int i = 0; i < n; ++i) {
            String firstName = StringUtil.generateRandomTextEN(random, random.nextInt(5, 11));
            String lastName = StringUtil.generateRandomTextEN(random, random.nextInt(5, 11));

            classroom.setGrade(i, new GradeInfo("%s %s".formatted(firstName, lastName), random.nextInt(11)));
        }
    }

    private static Exam createExam(String lectureName, int nClasses, Scanner kb)
    {
        Exam exam = new Exam(lectureName, nClasses);

        for (int i = 0; i < nClasses; ++i) {
            System.out.printf("Input number of students of classroom %d:", i + 1);
            Classroom classroom = new Classroom(Integer.parseInt(kb.nextLine()));

            setGrades(classroom);
            exam.setClassroom(i, classroom);
        }

        return exam;
    }

    private void printReport()
    {
        int nClasses = m_exam.getNumberOfClassrooms();
        System.out.printf("Grades of lecture %s:%n", m_exam.getLectureName());

        for (int i = 0; i < nClasses; ++i) {
            int nStudents = m_exam.getNumberOfStudents(i);
            System.out.printf("Classroom %d -> ", i + 1);
            for (int k = 0; k < nStudents; ++k)
                System.out.printf("%s ", m_exam.getGradeInfo(i, k).toString());

            System.out.printf("Average:%f%n", m_exam.getAverage(i));
        }

        System.out.printf("School Average:%f%n", m_exam.getAverage());
    }

    private void drawHistogram()
    {
        int nClasses = m_exam.getNumberOfClassrooms();

        for (int i = 0; i < nClasses; ++i) {
            System.out.printf("Data of classroom %d%n", i + 1);
            drawHistogram(m_exam.getClassroom(i), m_exam.getMaxGrade());
        }

        System.out.printf("Histogram of %s lecture:%n", m_exam.getLectureName());
        int [] data = m_exam.getHistogramData();

        ArrayUtil.print(data);
        ArrayUtil.drawHistogram(data, 20, '-');
    }

    public ExamSimulation(String lectureName)
    {
        m_lectureName = lectureName;
    }

    public void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input number of classrooms:");
        int n = Integer.parseInt(kb.nextLine());

        m_exam = createExam(m_lectureName, n, kb);
        m_exam.calculate();
        printReport();
        System.out.println("Histogram:");
        drawHistogram();
    }
}

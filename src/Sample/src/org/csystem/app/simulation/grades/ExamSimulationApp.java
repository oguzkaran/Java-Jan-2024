package org.csystem.app.simulation.grades;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulationApp {
    private static void setGrades(Classroom classroom)
    {
        Random random = new Random();
        int n = classroom.getNumberOfStudents();

        for (int i = 0; i < n; ++i) {
            String firstName = StringUtil.generateRandomTextTR(random, random.nextInt(5, 11));
            String lastName = StringUtil.generateRandomTextTR(random, random.nextInt(5, 11));

            classroom.setGrade(i, new GradeInfo("%s %s".formatted(firstName, lastName), random.nextInt(11)));
        }
    }

    private static Exam createExam(String lectureName, int nClasses, Scanner kb)
    {
        Exam exam = new Exam(lectureName, nClasses);

        for (int i = 0; i < nClasses; ++i) {
            System.out.printf("%d. şube öğrenci sayısını giriniz:", i + 1);
            Classroom classroom = new Classroom(Integer.parseInt(kb.nextLine()));

            setGrades(classroom);
            exam.setClassroom(i, classroom);
        }

        return exam;
    }

    private static void printReport(Exam exam)
    {
        int nClasses = exam.getNumberOfClassrooms();
        System.out.printf("%s dersi notları:%n", exam.getLectureName());

        for (int i = 0; i < nClasses; ++i) {
            int nStudents = exam.getNumberOfStudents(i);
            System.out.printf("%d. şube -> ", i + 1);
            for (int k = 0; k < nStudents; ++k)
                System.out.printf("%s ", exam.getGradeInfo(i, k).toString());

            System.out.printf("Ortalama:%f%n", exam.getAverage(i));
        }

        System.out.printf("Okul Ortalaması:%f%n", exam.getAverage());
    }

    private static void drawHistogram(Classroom classroom, int maxGrade)
    {
        int [] data = classroom.getHistogramData(maxGrade);
        ArrayUtil.print(data);
        ArrayUtil.drawHistogram(data, 20, '-');
    }

    private static void drawHistogram(Exam exam)
    {
        int nClasses = exam.getNumberOfClassrooms();

        for (int i = 0; i < nClasses; ++i) {
            System.out.printf("%d. şube histogram verisi:%n", i + 1);
            drawHistogram(exam.getClassroom(i), exam.getMaxGrade());
        }

        System.out.printf("%s dersi okul histogramı:%n", exam.getLectureName());
        int [] data = exam.getHistogramData();

        ArrayUtil.print(data);
        ArrayUtil.drawHistogram(data, 20, '-');
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);

        System.out.print("Ders adını giriniz:");
        String lectureName = kb.nextLine();

        System.out.print("Şube sayısını giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        Exam exam = createExam(lectureName, n, kb);

        exam.calculate();

        printReport(exam);
        System.out.println("Histogram:");
        drawHistogram(exam);
    }

    public static void main(String[] args)
    {
        run();
    }
}

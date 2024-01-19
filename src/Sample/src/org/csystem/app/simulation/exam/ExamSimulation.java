package org.csystem.app.simulation.exam;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ExamSimulation {
    private String m_lectureName;
    private int [][] m_grades;
    private double [] m_averages;
    private int [] m_maxGrades;
    private int [] m_minGrades;
    private double m_average;
    private int m_maxGrade;
    private int m_minGrade;

    private int calculateAndGetSumGrades(int i)
    {
        m_maxGrades[i] = m_grades[i][0];
        m_minGrades[i] = m_grades[i][0];
        int sumGrades = 0;

        for (int k = 0; k < m_grades[i].length; ++k) {
            m_maxGrades[i] = Math.max(m_maxGrades[i], m_grades[i][k]);
            m_minGrades[i] = Math.min(m_minGrades[i], m_grades[i][k]);
            m_maxGrade = Math.max(m_maxGrades[i], m_maxGrade);
            m_minGrade = Math.min(m_minGrades[i], m_minGrade);
            sumGrades += m_grades[i][k];
        }

        return sumGrades;
    }

    private void fillGrades()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Şube sayısını giriniz:");
        int n = Integer.parseInt(kb.nextLine());

        m_grades = new int[n][];
        m_averages = new double[n];
        m_maxGrades = new int[n];
        m_minGrades = new int[n];

        for (int i = 0; i < m_grades.length; ++i) {
            System.out.printf("%d.şube öğrenci sayısını giriniz:", i + 1);
            m_grades[i] = ArrayUtil.generateRandomArray(r, Integer.parseInt(kb.nextLine()), 0, 101);
        }
    }

    private void doSimulation()
    {
        int totalGrades = 0;
        int nStudents = 0;
        m_maxGrade = 0;
        m_minGrade = 100;

        for (int i = 0; i < m_grades.length; ++i) {
            nStudents += m_grades[i].length;
            int sumGrades = calculateAndGetSumGrades(i);

            m_averages[i] = (double) sumGrades / m_grades[i].length;
            totalGrades += sumGrades;
        }

        m_average = (double) totalGrades / nStudents;
    }

    public ExamSimulation(String name)
    {
        m_lectureName = name;
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public void setLectureName(String lectureName)
    {
        m_lectureName = lectureName;
    }

    public int getGrade(int i, int k)
    {
        return m_grades[i][k];
    }

    public double getAverage(int i)
    {
        return m_averages[i];
    }

    public double getAverage()
    {
        return m_average;
    }

    public int getMaxGrade(int i)
    {
        return m_maxGrades[i];
    }

    public int getMaxGrade()
    {
        return m_maxGrade;
    }

    public int getMinGrade(int i)
    {
        return m_minGrades[i];
    }

    public int getMinGrade()
    {
        return m_minGrade;
    }

    public void run()
    {
        fillGrades();
        doSimulation();
    }

    public void printReport()
    {
        System.out.println("#################################################################");
        printGrades();
        for (int i = 0; i < m_averages.length; ++i)
            System.out.printf("%d.şube:Ortalama:%f, En yüksek not:%d, En düşük not:%d%n", i + 1, m_averages[i],
                    m_maxGrades[i], m_minGrades[i]);
        System.out.printf("Okul Ortalaması:%f%n", m_average);
        System.out.printf("En yüksek not:%d%n", m_maxGrade);
        System.out.printf("En düşük not:%d%n", m_minGrade);
        System.out.println("#################################################################");
    }

    public void printGrades()
    {
        System.out.println("-----------------------------------------------------------------");

        System.out.printf("%s dersi notları:%n", m_lectureName);
        for (int i = 0; i < m_grades.length; ++i) {
            System.out.printf("%d.şube:", i + 1);
            ArrayUtil.print(m_grades[i]);
        }

        System.out.println("-----------------------------------------------------------------");
    }
}

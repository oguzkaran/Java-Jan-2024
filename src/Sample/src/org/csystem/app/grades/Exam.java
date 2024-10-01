package org.csystem.app.grades;

public class Exam {
    public String lectureName;
    public int [][] grades;
    public double [] averages;
    public double average;

    public Exam(String name, int nClasses)
    {
        lectureName = name;
        grades = new int[nClasses][];
    }

    public int getNumberOfClasses()
    {
        return grades.length;
    }

    public int getNumberOfStudents(int i)
    {
        return grades[i].length;
    }

    public void setNumberOfStudents(int i, int n)
    {
        grades[i] = new int[n];
    }

    public void setGrade(int i, int k, int grade)
    {
        grades[i][k] = grade;
    }

    public void calculate()
    {

    }
    //...
}

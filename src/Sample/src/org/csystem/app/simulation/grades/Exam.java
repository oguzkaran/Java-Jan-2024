package org.csystem.app.simulation.grades;

public class Exam {
    private String m_lectureName;
    private final Classroom [] m_classrooms;
    private final double [] m_averages;
    private double m_average;
    private final int m_maxGrade;

    public Exam(String lectureName, int nClasses)
    {
        m_lectureName = lectureName;
        m_classrooms = new Classroom[nClasses];
        m_averages = new double[nClasses];
        m_maxGrade = 10;
    }

    public Exam(String lectureName, int nClasses, int maxGrade)
    {
        m_lectureName = lectureName;
        m_classrooms = new Classroom[nClasses];
        m_averages = new double[nClasses];
        m_maxGrade = maxGrade;
    }

    public String getLectureName()
    {
        return m_lectureName;
    }

    public void setLectureName(String lectureName)
    {
        m_lectureName = lectureName;
    }

    public Classroom getClassroom(int i)
    {
        return m_classrooms[i];
    }

    public double getGrade(int i, int k)
    {
        return getGradeInfo(i, k).getGrade();
    }

    public GradeInfo getGradeInfo(int i, int k)
    {
        return m_classrooms[i].getGradeInfo(k);
    }

    public int getNumberOfClassrooms()
    {
        return m_classrooms.length;
    }

    public int getNumberOfStudents(int i)
    {
        return m_classrooms[i].getNumberOfStudents();
    }

    public void setClassroom(int i, Classroom classroom)
    {
        m_classrooms[i] = classroom;
    }

    public void setGrade(int i, int k, GradeInfo gradeInfo)
    {
        m_classrooms[i].setGrade(k, gradeInfo);
    }

    public double getAverage(int i)
    {
        return m_averages[i];
    }

    public double getAverage()
    {
        return m_average;
    }

    public int getMaxGrade()
    {
        return m_maxGrade;
    }

    public int [] getHistogramData()
    {
        int [] data = new int[m_maxGrade + 1];

        for (Classroom classroom : m_classrooms) {
            int nStudents = classroom.getNumberOfStudents();

            for (int i = 0; i < nStudents; ++i)
                ++data[classroom.getGradeInfo(i).getGrade()];
        }

        return data;
    }
    //...

    public void calculate()
    {
        int totalNumberOfStudents = 0;
        int totalGrades = 0;

        for (int i = 0; i < m_classrooms.length; ++i) {
            int totalClassNumberOfStudents = m_classrooms[i].getNumberOfStudents();
            int totalClassroomGrades = 0;

            for (int k = 0; k < totalClassNumberOfStudents; ++k) {
                GradeInfo gradeInfo = m_classrooms[i].getGradeInfo(k);

                totalClassroomGrades += gradeInfo.getGrade();
            }

            m_averages[i] = (double) totalClassroomGrades / totalClassNumberOfStudents;
            totalGrades += totalClassroomGrades;
            totalNumberOfStudents += totalClassNumberOfStudents;
        }

        m_average = (double) totalGrades / totalNumberOfStudents;
    }
    //...
}

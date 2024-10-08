package org.csystem.app.school;

public class GradeInfo {
    public String number;
    public String name;
    public String birthDate;
    public String lectureName;
    public int midtermGrade;
    public int finalGrade;

    //...
    public double getGrade()
    {
        return 0.4 * midtermGrade + 0.6 * finalGrade;
    }
    //...
}

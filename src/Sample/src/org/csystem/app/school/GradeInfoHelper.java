package org.csystem.app.school;

import static java.lang.Integer.parseInt;
import static org.csystem.app.datetime.DateUtil.getDateStrTR;

public class GradeInfoHelper {
    public static GradeInfo parse(String s)
    {
        String [] info = s.split("[:]+");

        //...

        String [] birthDateInfo = info[2].split("[/]+");
        GradeInfo gradeInfo = new GradeInfo();

        gradeInfo.number = info[0];
        gradeInfo.name = info[1];
        gradeInfo.birthDate = getDateStrTR(parseInt(birthDateInfo[0]), parseInt(birthDateInfo[1]), parseInt(birthDateInfo[2]));
        gradeInfo.lectureName = info[3];
        gradeInfo.midtermGrade = parseInt(info[4]);
        gradeInfo.finalGrade = parseInt(info[5]);

        return gradeInfo;
    }

    public static void printReport(GradeInfo gradeInfo)
    {
        double grade = gradeInfo.getGrade();

        System.out.printf("Student Number:%s%n", gradeInfo.number);
        System.out.printf("Fullname:%s%n", gradeInfo.name);
        System.out.printf("Birth Date:%s%n", gradeInfo.birthDate);
        System.out.printf("Lecture Name:%s%n", gradeInfo.lectureName);
        System.out.printf("Midterm grade:%d%n", gradeInfo.midtermGrade);
        System.out.printf("Final grade:%d%n", gradeInfo.finalGrade);
        System.out.printf("Grade:%.1f%n", grade);
        System.out.printf("Status:%s%n", grade > 50 ? "Success" : "Fail");
    }
}

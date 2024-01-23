package _05_class._02_static;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private String student_ID;
    private int grade;
    static int totalStudents = 0;

    public String getName() { return name; }
    public String getStudent_ID() { return student_ID; }
    public int getGrade() { return grade; }

    public void setName(String name) {this.name = name;}
    public void setStudent_ID(String student_ID) {this.student_ID = student_ID;}
    public void setGrade(int grade) {this.grade = grade;}

    public Student(String name, String student_ID, int grade) {
        this.name = name;
        this.student_ID = student_ID;
        this.grade = grade;
        totalStudents++;
    }

    static void displayInfo(Student s) {
        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + s.getName());
        System.out.println("학번: " + s.getStudent_ID());
        System.out.println("학년: " + s.getGrade());
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("이름, 학번, 학년 순으로 정보를 입력해주세요. break 입력시 학생 정보가 출력됩니다.");
            String name = sc.next();
            if (name.equals("break")) break;
            String student_ID = sc.next();
            int grade = sc.nextInt();

            Student student = new Student(name, student_ID, grade);
            students.add(student);
        }

        for (Student s:students) {
            Student.displayInfo(s);
        }
        System.out.println("총 학생 수는 " + Student.totalStudents + "명 입니다.");
        sc.close();
    }
}

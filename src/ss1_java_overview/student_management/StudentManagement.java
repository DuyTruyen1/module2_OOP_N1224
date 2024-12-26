package ss1_java_overview.student_management;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien: ");
        int n = input.nextInt();

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student();
        for (int i = 1; i <= n; i++) {
            System.out.printf("---------Nhap vao thong tin sinh vien thu %d-------\n\n", i);
            student = new Student();
            student.inputStudent();
            students.add(student);
        }

        for (int i = 1; i <= n; i++) {
            System.out.printf("-----------Thong tin sinh vien thu %d-----------\n\n", i);
            students.get(i - 1).outputStudent();
        }
    }
}

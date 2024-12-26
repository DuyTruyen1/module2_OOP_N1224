package ss1_java_overview.student_management;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    double score;

    Student() {
    }

    Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }



    void inputStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào id: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vào tên: ");
        name = sc.nextLine();

        System.out.print("Nhập vào điểm: ");
        score = Double.parseDouble(sc.nextLine());
    }



    void outputStudent() {
        System.out.println("id: " + id);
        System.out.println("name: " + name);
        System.out.println("score: " + score);
    }
}


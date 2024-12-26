package ss2_contructor.coordinates_and_distances;

import java.util.Scanner;

public class Point {
    double x;
    double y;

    void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập toạ độ X: ");
        x = sc.nextDouble();

        System.out.println("Nhập toạ độ Y: ");
        y = sc.nextDouble();
    }

    double khoangCach(Point n){
        return Math.sqrt(Math.pow(n.x - x, 2) + Math.pow(n.y - y, 2));
    }
}

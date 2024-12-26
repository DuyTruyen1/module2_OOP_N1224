package ss1_java_overview.coordinates_and_distances;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();

        System.out.println("Nhập toa độ điểm thứ nhất: ");
        point1.nhap();
        System.out.println("Nhập toạ độ điểm thứ hai: ");
        point2.nhap();

        double distance = point1.khoangCach(point2);

        System.out.println("Khoảng cách giữa hai điểm là : " + distance);
    }
}

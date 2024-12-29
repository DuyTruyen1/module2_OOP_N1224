package ss3_static.student;

public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student(1,"truyền",9.2);
        Student s2 = new Student(2,"truyền",9.3);
        Student s3 = new Student(3,"truyền",9.4);

        System.out.println("So luong sinh vien: " + Student.getCount());


    }
}

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class SimpleStudentCollection {

    public static void main(String[] args) {

        Collection<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        students.add(new Student(id, name));

        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s.id + " " + s.name);
        }
        System.out.print("Enter name to update: ");
        String updateName = sc.nextLine();

        for (Student s : students) {
            if (s.name.equals(updateName)) {
                System.out.print("Enter new ID: ");
                s.id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter new name: ");
                s.name = sc.nextLine();
            }
        }
        System.out.println("After Update:");
        for (Student s : students) {
            System.out.println(s.id + " " + s.name);
        }
        System.out.print("Enter name to remove: ");
        String removeName = sc.nextLine();

        Student removeStudent = null;
        for (Student s : students) {
            if (s.name.equals(removeName)) {
                removeStudent = s;
            }
        }

        if (removeStudent != null) {
            students.remove(removeStudent);
        }
        System.out.println("After Remove:");
        for (Student s : students) {
            System.out.println(s.id + " " + s.name);
        }

        sc.close();
    }
}

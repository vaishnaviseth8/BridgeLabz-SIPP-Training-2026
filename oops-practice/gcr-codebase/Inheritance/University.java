class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class Student extends Person {
    final String studentId;
    protected double gpa;

    Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() +
                ", Student{studentId='" + studentId + "', gpa=" + gpa + "}";
    }
}

class GradStudent extends Student {
    private String thesis;

    GradStudent(String name, int age, String studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() +
                ", GradStudent{thesis='" + thesis + "'}";
    }
}

public class Main {
    public static void main(String[] args) {
        GradStudent gs = new GradStudent(
                "Rahul", 24, "S101", 9.1, "Artificial Intelligence");

        System.out.println(gs);

        Student s = gs;
        Person p = gs;

        System.out.println("GradStudent IS-A Student: " + (s instanceof Student));
        System.out.println("Student IS-A Person: " + (p instanceof Person));
    }
}
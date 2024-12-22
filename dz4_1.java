// Абстрактный класс Student
abstract class Student {
    protected String fullName;
    protected int course;
    protected double lastExamGrade;

    public Student(String fullName, int course, double lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    public abstract void writeExam();
}

// Класс IUStudent
class IUStudent extends Student {
    public IUStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " из Института управления пишет экзамен.");
    }
}

// Класс MathStudent
class MathStudent extends Student {
    public MathStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(fullName + " из математического факультета пишет экзамен.");
    }
}

public class dz3_1 {
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Иванов Иван Иванович", 2, 4.5);
        Student mathStudent = new MathStudent("Петров Петр Петрович", 3, 5.0);

        iuStudent.writeExam();
        mathStudent.writeExam();
    }
}

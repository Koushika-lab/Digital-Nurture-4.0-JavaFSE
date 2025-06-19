public class Student {
    private String name; private int id; private double grade;
    public Student(int id, String name, double grade) {
        this.id = id; this.name = name; this.grade = grade;
    }
    public String getName() { return name; }
    public int getId() { return id; }
    public double getGrade() { return grade; }
}

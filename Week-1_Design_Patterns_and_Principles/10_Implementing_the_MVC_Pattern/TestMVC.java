public class TestMVC {
    public static void main(String[] args) {
        Student s = new Student(1, "Alice", 9.1);
        StudentView v = new StudentView();
        StudentController c = new StudentController(s, v);
        c.updateView();
    }
}

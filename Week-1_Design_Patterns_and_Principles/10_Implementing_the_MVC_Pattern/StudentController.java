public class StudentController {
    private Student model; private StudentView view;
    public StudentController(Student m, StudentView v) {
        this.model = m; this.view = v;
    }
    public void updateView() {
        view.displayStudentDetails(model.getId(), model.getName(), model.getGrade());
    }
}

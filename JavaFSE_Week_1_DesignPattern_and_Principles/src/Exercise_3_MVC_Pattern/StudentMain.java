package Exercise_3_MVC_Pattern;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sudheer");
        student.setId("101");
        student.setGrade("A");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Sudheer Sivanandam");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}

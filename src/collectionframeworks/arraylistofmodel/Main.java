package collectionframeworks.arraylistofmodel;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.addStudents();
        studentService.displayStudents();
        studentService.hashMapWithStudentObject();
    }
}

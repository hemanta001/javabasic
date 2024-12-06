package collectionframeworks.arraylistofmodel;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<StudentModel> studentModelList = new ArrayList<>();

//    private List<List<StudentModel>> studentModelListOfList = new ArrayList<>();

    public void addStudents() {
        StudentModel firstStudent = new StudentModel();
        firstStudent.setId(1L);
        firstStudent.setName("John Doe");
        firstStudent.setRollNumber(1);
        firstStudent.setSection('A');

        studentModelList.add(firstStudent);

        studentModelList.add(new StudentModel(2L, "Harry", 2, 'B'));
        studentModelList.add(new StudentModel(3L, "Sheetal", 3, 'A'));
//        studentModelList.add(null);
    }

    public void displayStudents() {
        System.out.println("Display students with normal for loop");
        //count controlled loop
        for (int i = 0; i < studentModelList.size(); i++) {
            StudentModel studentModel = studentModelList.get(i);
            System.out.println("Student info at " + i + " index");
            System.out.println("Id: " + studentModel.getId());
            System.out.println("Name: " + studentModel.getName());
            System.out.println("RollNumber :" + studentModel.getRollNumber());
            System.out.println("Section: " + studentModel.getSection());
        }
        System.out.println("Display students with enhanced for loop");
        int i = 0;
        for (StudentModel studentModel : studentModelList) {
            System.out.println("Student info at " + i + " index");
            System.out.println("Id: " + studentModel.getId());
            System.out.println("Name: " + studentModel.getName());
            System.out.println("RollNumber :" + studentModel.getRollNumber());
            System.out.println("Section: " + studentModel.getSection());
            i++;
        }
    }
}

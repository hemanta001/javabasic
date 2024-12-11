package collectionframeworks.arraylistofmodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public void hashMapWithStudentObject() {
        Map<Integer, StudentModel> hashMapOfStudents = new HashMap<>();

        hashMapOfStudents.put(100, new StudentModel());

        hashMapOfStudents.put(101, new StudentModel(1L, "Harry", 2, 'A'));

        StudentModel studentModel = new StudentModel();
        studentModel.setId(2L);
        studentModel.setName("Tom");
        studentModel.setRollNumber(3);
        studentModel.setSection('B');
        hashMapOfStudents.put(102, studentModel);
        System.out.println("Student Map: " + hashMapOfStudents);

        StudentModel studentModelWith100Key = hashMapOfStudents.get(100);
        System.out.println("Details of student with 100 key: ");
        System.out.println("Id :"+studentModelWith100Key.getId());
        System.out.println("Name :"+studentModelWith100Key.getName());
        System.out.println("Roll No :"+studentModelWith100Key.getRollNumber());
        System.out.println("Section :"+studentModelWith100Key.getSection());

        hashMapOfStudents.remove(101);

        System.out.println("After removing student with 101 key: " + hashMapOfStudents);

        System.out.println("Iterate with student hash map");
        for (Integer key : hashMapOfStudents.keySet()) {
            System.out.println("Info of students with key " + key);
            StudentModel studentModelSample = hashMapOfStudents.get(key);
            System.out.println(studentModelSample);
            System.out.println("Id :"+studentModelSample.getId());
            System.out.println("Name :"+studentModelSample.getName());
            System.out.println("Roll No :"+studentModelSample.getRollNumber());
            System.out.println("Section :"+studentModelSample.getSection());

        }
    }
}

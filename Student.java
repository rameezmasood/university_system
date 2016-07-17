package com.company;

import java.util.Scanner;

/**
 * Created by sayla on 12/06/2016.
 */
public class Student extends University {


    private void addStudentData(String name, String gender, String qualification, int age) {
        this.addData(name, gender, qualification, age);
        System.out.println("Student added successfully.....");
        System.out.println("===============================");


    }

    private void addStudent() {
        this.collectInfo("Student");
        this.studentMenu();
    }

    private void searchStudent(String studentName) {
        this.searchData(studentName);
        this.studentMenu();
    }

    private void editStudent(int studentID) {

        this.editData(studentID, "Student");
        this.studentMenu();
    }

    private void deleteStudent(int studentID) {

        this.deleteData(studentID);
        this.studentMenu();
    }

    private void viewStudent() {
        this.viewData();
        this.studentMenu();
    }


    public void studentMenu() {
        System.out.println("");
        System.out.println("Please select an option");
        System.out.println("1. \t Add Student");
        System.out.println("2. \t View Student");
        System.out.println("3. \t Search Student");
        System.out.println("4. \t Edit Student");
        System.out.println("5. \t Delete Student");
        System.out.println("6. \t Exit");
        System.out.println("Please Enter 1 or 2 or 3 or 4 or 5 or 6");
        int option = ui.nextInt();
        switch (option) {
            case 1:
                this.addStudent();
                break;
            case 2:
                this.viewStudent();
                break;
            case 3:
                System.out.println("Please enter student name:");
                String studentName = ui.next();
                this.searchStudent(studentName);
                break;
            case 4:
                System.out.println("Please enter student id:");
                int studentID = ui.nextInt();
                this.editStudent(studentID);
                break;
            case 5:
                System.out.println("Please enter stuednt id:");
                int studentID2 = ui.nextInt();
                this.deleteStudent(studentID2);
                break;

            default:
                System.out.println("Thank you for using Student Module");
                break;


        }

    }


}

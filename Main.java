package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Saylani University\n Enter 1 for Teacher\n Enter 2 for Student");

        Scanner input = new Scanner(System.in);

        int user_input = input.nextInt();
        if(user_input == 1){
            System.out.println("This is the Teacher Management System");
            Teacher t = new Teacher();
            t.teacherMenu();
        }else if(user_input == 2){
            System.out.println("This is the Student Management System");
            Student s = new Student();
            s.studentMenu();
        }else{
            System.out.println("Invalid Option Please try again.");
        }
    }
}

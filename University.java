package com.company;

import java.util.Arrays;



import java.util.Scanner;

import static com.sun.deploy.util.ArrayUtil.*;

/**
 * Created by MT-2016 on 6/19/2016.
 */
public class University {
    private int maximum_data = 5;
    private String name[] = new String[this.maximum_data];
    private String gender[] = new String[this.maximum_data];
    private String qualification[] = new String[this.maximum_data];
    private int age[] = new int[this.maximum_data];
    private int id[] = new int[this.maximum_data];
    private int added_record = 0;
    Scanner ui = new Scanner(System.in);


    public void University() {
        System.out.println("Welcome Saylani Student..");
    }

    protected void addData(String name, String gender, String qualification, int age) {
        this.name[this.added_record] = name;
        this.gender[this.added_record] = gender;
        this.qualification[this.added_record] = qualification;
        this.age[this.added_record] = age;
        this.id[this.added_record] = this.added_record + 1;
        this.added_record++;

    }

    protected void collectInfo(String module_name) {
        if (this.added_record < this.maximum_data) {
            System.out.println("Please Enter " + module_name + " Name");
            String name = ui.next();

            System.out.println("Please Enter " + module_name + " Gender");
            String gender = ui.next();

            System.out.println("Please Enter " + module_name + " Qualification");
            String qualification = ui.next();

            System.out.println("Please Enter " + module_name + " Age");
            int age = ui.nextInt();

            this.addData(name, gender, qualification, age);
        } else {
            System.out.println("You have reached maximum length to add " + module_name + "");
        }
    }

    protected void viewData() {
        if (this.added_record > 0) {
            System.out.println("==================All Records===============");
            System.out.println("ID\t Name\t Gender\t Age\t Qualification\t ");
            System.out.println("=============================================");
            for (int i = 0; i < this.added_record; i++) {
                System.out.println(this.id[i] + "\t\t " + this.name[i] + "\t\t " + this.gender[i] + "\t\t " + this.age[i] + "\t\t " + this.qualification[i]);

            }
        } else {
            System.out.println("No teacher added yet.");
        }
    }

    protected void searchData(String searchName) {
        if (this.added_record > 0) {
            int foundRecord = 0;
            for (int i = 0; i < this.added_record; i++) {
                if (this.name[i].equalsIgnoreCase(searchName)) {
                    if (foundRecord == 0) {
                        System.out.println("======Found Results==============");
                        System.out.println("ID\t Name\t Gender\t Age\t Qualification\t ");
                        System.out.println("=================================");
                    }
                    System.out.println(this.id[i] + "\t\t " + this.name[i] + "\t\t " + this.gender[i] + "\t\t " + this.age[i] + "\t\t " + this.qualification[i]);
                    foundRecord++;

                }
            }
            if (foundRecord == 0) {
                System.out.println("No records found your search query");
            }

        } else {
            System.out.println("Please first add record then search..");
        }

    }

    protected void deleteData(int teacherID) {
        int isFoundDelete = 0;
        for (int i = 0, j = 1; i < this.added_record; i++, j++) {
            if (j == teacherID) {

                /*this.name[i] = null;
                this.gender[i] = null;
                this.qualification[i] = null;
                this.age[i] = 0;
                this.id[i] = 0;*/

                removeElt(i);


                System.out.println("===========Record has been deleted successfully...===========");
                isFoundDelete = 1;
                this.added_record--;
                //System.out.println(this.added_record);

                break;
            }
        }
        if (isFoundDelete == 0) {
            System.out.println("=======Sorry record not found. Invalid record id===========");
        }

    }
    public  void removeElt(  int remIndex )
    {
        for ( int i = remIndex ; i < this.id.length - 1 ; i++ )
        {

            this.name[i] = this.name[i+1];
            this.gender[i] = this.gender[i];
            this.qualification[i] = this.qualification[i];
            this.age[i] = this.age[i];
            this.id[i] = this.id[i];

        }
    }


    protected void editData(int teacherID, String module_name) {

        int isFoundEdit = 0;
        for (int i = 0, j = 1; i < this.added_record; i++, j++) {
            if (j == teacherID) {
                System.out.println("Please Enter " + module_name + " Name");
                String name = ui.next();

                System.out.println("Please Enter " + module_name + " Gender");
                String gender = ui.next();

                System.out.println("Please Enter " + module_name + " Qualification");
                String qualification = ui.next();

                System.out.println("Please Enter " + module_name + " Age");
                int age = ui.nextInt();

                this.name[i] = name;
                this.gender[i] = gender;
                this.qualification[i] = qualification;
                this.age[i] = age;

                System.out.println("===========Record has been updated successfully...=============");
                isFoundEdit = 1;

                break;
            }
        }
        if (isFoundEdit == 0) {
            System.out.println("==================Sorry invalid record id=====================");
        }

    }
}

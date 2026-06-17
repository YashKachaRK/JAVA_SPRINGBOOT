package com.mycompany.game;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class student {
    int id;
    String name;
    double marks;

    student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println();
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks" + marks);
        System.out.println();
    }
}

public class studentManagemnt {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<student> std = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Count Student");
            System.out.println("6. Update Student");
            System.out.println("7. Sort by marks Student");
            System.out.println("8. Sort by name Student");
            System.out.println("9. Find topper Student");
            System.out.println(". Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Id");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name");
                    String name = sc.nextLine();

                    System.out.println("Enter Marks");
                    double marks = sc.nextDouble();

                    std.add(new student(id, name, marks));
                    System.out.println("Add succesfully");
                    break;
                case 2:
                    if (std.isEmpty()) {
                        System.out.println("Please add data");
                    } else {
                        for (student s : std) {
                            s.display();
                        }
                    }
                    break;
                case 3:
                    if (std.isEmpty()) {
                        System.out.println("Please enter data");
                    } else {
                        System.out.println("Enter id");
                        int sid = sc.nextInt();

                        for (student s : std) {
                            if (s.id == sid) {
                                s.display();
                            }
                        }
                    }
                    break;

                case 4:
                    if (std.isEmpty()) {
                        System.out.println("Please enter data");
                    } else {
                        System.out.println("Enter id");
                        int sid = sc.nextInt();
                        for (student s : std) {
                            if (s.id == sid) {

                                std.remove(s);
                                break;
                            }
                        }
                    }
                    break;

                case 5:

                    System.out.println("Number of student is " + std.size());

                case 6:
                    if (std.isEmpty()) {
                        System.out.println("Please enter data");
                    } else {
                        System.out.println("Enter id");
                        int uid = sc.nextInt();
                        for (student s : std) {
                            if (s.id == uid) {

                                sc.nextLine();
                                System.out.println("Enter Name");
                                s.name = sc.nextLine();

                                System.out.println("Enter Marks");
                                s.marks = sc.nextDouble();


                            }
                        }
                    }
                    break;

                case 7:
                    if (std.isEmpty()) {
                        System.out.println("Please enter data");
                    } else {
                        std.sort((s1, s2) -> Double.compare(s2.marks, s1.marks));
                        for (student s : std) {
                            s.display();
                        }
                    }
                    break;
                case 8:
                    if (std.isEmpty()) {
                        System.out.println("Please enter data");
                    } else {
                        std.sort((s1, s2) -> s1.name.compareToIgnoreCase(s2.name));
                        for (student s : std) {
                            s.display();
                        }
                    }
                    break;

                case 9:
                    if (std.isEmpty()) {
                        System.out.println("No Students Found!");
                    } else {
                        student topper = std.getFirst();
                        for (student s : std){
                            if (s.marks > topper.marks){
                                topper  = s;
                            }

                        }
                        System.out.println("Topper: ----"  );
                        topper.display();
                    }
                    break;
                case 10:
                    System.out.println("Program close");
                    break;
            }
        }
    }
}
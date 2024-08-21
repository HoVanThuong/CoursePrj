/*
 * @ Ho Van Thuong.java    1.0
 * Copyright (c)  IUH. All rights reserved
 *
 */

package iuh.edu.fit;


/*
 * @description:
 * @author:
 * @date: 21/08/2024
 * @version: 1.0
 */

import java.util.Scanner;

public class TestCourse {
    public static void main(String[] args) {
//        Course c1 = new Course("123","Toan","KhoaCoBan",7);
//        Course c2 = new Course("102","Anh","KhoaNN",3);
//        Course c3 = new Course("123","OOP","KhoaCNTT",4);
//        Course c4 = new Course("982","CTDL&GT","KhoaCNTT",4);
//        Course c5 = new Course("898","SQL","KhoaCNTT",4);
//        Course c6 = new Course("985","Viet","KhoaNN",4);
//        Course c7 = new Course("932","Trung","KhoaNN",4);
//        Course c8 = new Course("981","My","KhoaNN",10);
//        /// add Course
//        CourseList courseList = new CourseList(8);
//        courseList.addCourse(c1);
//        courseList.addCourse(c2);
//        courseList.addCourse(c3);
//        courseList.addCourse(c4);
//        courseList.addCourse(c5);
//
//        // getCourse
//        Course temp[] = courseList.getCourses();
//        int i = 0;
//        while (temp[i] != null)
//        {
//            System.out.println(temp[i].toString());
//            i++;
//        }
//        /// Remove Course
//        courseList.removeCourse("123");
//        System.out.println("Do dai sau khi xoa 1 khoa hoc:");
//        System.out.println(courseList.getCount());
//        System.out.println("Sau khi xoa:");
//        for (Course c : courseList.getCourses())
//        {
//            if (c != null)
//              System.out.println(c.toString());
//        }
//        /// add them course
//        courseList.addCourse(c6);
//        courseList.addCourse(c7);
//        courseList.addCourse(c8);
//        // kiem tra lai
//        System.out.println("Sau khi them vao lai:");
//        for (Course c : courseList.getCourses())
//        {
//            if (c != null)
//                System.out.println(c.toString());
//        }
//        // Tim kiem bang id
//        System.out.println("Tim kiem bang ID:");
//        if(courseList.searchCourseById("981") != null)
//        {
//            System.out.println("Tim thay:");
//            System.out.println(courseList.searchCourseById("981").toString());
//        }
//        else {
//            System.out.println("Khong tim thay");
//        }
//        //Tim kiem bang ten khoa hoc
//        System.out.println("Tim kiem bang ten khoa hoc:");
//        if(courseList.searchCourse("My") != null)
//        {
//            System.out.println("Tim thay:");
//            temp = courseList.searchCourse("My");
//            for (Course c : temp)
//            {
//                if (c != null)
//                    System.out.println(c.toString());
//            }
//        }
//        else {
//            System.out.println("Khong tim thay");
//        }
//        // Tim kiem bang thong tin dua vao khoa
//        System.out.println("Tim kiem bang ten khoa:");
//        if(courseList.searchCourseByDepartment("KhoaNN") != null)
//        {
//            System.out.println("Tim thay:");
//            temp = courseList.searchCourseByDepartment("KhoaNN");
//            for (Course c : temp)
//            {
//                if (c != null)
//                    System.out.println(c.toString());
//            }
//        }
//        else {
//            System.out.println("Khong tim thay");
//        }
//        // Sap xep ( khong lam tren danh sach goc )
//        temp = courseList.sortCourse();
//        System.out.println("Sau khi sap xep:");
//        for (Course c : temp)
//        {
//            if(c != null)
//                System.out.println(c.toString());
//        }
//
//        // Tim khoa hoc co so tin chi lon nhat
//        System.out.println("Khoa hoc nhieu tin chi nhat:");
//        System.out.println(courseList.findMaxCreditCourse().toString());
//
//        // Tim khoa quan li nhieu khoa hoc nhat
//        System.out.print("Khoa quan li nhieu khoa hoc nhat:  " + courseList.findDepartmentMaxCourse());
//    }
        /// Em quen doc de :-((( ///
        /*
         * @Menu: FULL CHUC NANG
         */
        Scanner sc = new Scanner(System.in);
        int choice ;
        CourseList courseList = new CourseList(100);
        do
        {
            menu();
            System.out.print("Nhap lua chon cua ban:");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:{
                    String id, title, department;
                    int credit;
                    System.out.println("Nhap Course ID:");
                    id = sc.nextLine();
                    System.out.println("Nhap Course Title:");
                    title = sc.nextLine();
                    System.out.println("Nhap Course Department:");
                    department = sc.nextLine();
                    System.out.println("Nhap Course Credit:");
                    credit = sc.nextInt();
                    Course course = new Course(id, title, department, credit);
                    if (courseList.addCourse(course))
                    {
                        System.out.println("Course added");
                    }
                    else {
                        System.out.println("Course not added");
                    }
                };break;
                case 2:{
                    String id;
                    System.out.println("Nhap Course ID to Remove:");
                    id = sc.nextLine();
                    if (courseList.removeCourse(id))
                    {
                        System.out.println("Course removed");
                    }
                    else {
                        System.out.println("Course not removed");
                    }
                };break;
                case 3:{
                    printCourse(courseList);
                };break;
                case 4:{
                    String id;
                    System.out.println("Nhap Course ID:");
                    id = sc.nextLine();
                    if (courseList.searchCourseById(id) != null)
                    {
                        System.out.println("Course found");
                        System.out.println(String.format("%-30s %-30s %-30s %10s", "ID", "Title", "Department", "Credit"));
                        System.out.println(courseList.searchCourseById(id).toString());
                    }
                    else {
                        System.out.println("Course not found");
                    }
                };break;
                case 5:{
                    String name;
                    System.out.println("Nhap Course Name:");
                    name = sc.nextLine();
                    if (courseList.searchCourse(name) != null)
                    {
                        System.out.println("Course found");
                        Course temp[] = courseList.searchCourse(name);
                        System.out.println(String.format("%-30s %-30s %-30s %10s", "ID", "Title", "Department", "Credit"));
                        for (Course course : temp)
                        {
                            if (course != null)
                            {
                                System.out.println(course.toString());
                            }
                        }
                    }
                    else {
                        System.out.println("Course not found");
                    }
                };break;
                case 6:{
                    String department;
                    System.out.println("Nhap Course Department:");
                    department = sc.nextLine();
                    Course temp[] = courseList.searchCourseByDepartment(department);
                    if (temp != null)
                    {
                        System.out.println("Course found");
                        System.out.println(String.format("%-30s %-30s %-30s %10s", "ID", "Title", "Department", "Credit"));
                        for (Course course : temp)
                        {
                            if (course != null)
                                System.out.println(course.toString());
                        }
                    }
                    else {
                        System.out.println("Course not found");
                    }
                };break;
                case 7:{
                    Course temp[] = courseList.sortCourse();
                    courseList.setCourses(temp);
                    System.out.println("Course sorted list");
                    printCourse(courseList);
                };break;
                case 8:{
                    System.out.println("Department MAX is : " + courseList.findDepartmentMaxCourse());
                };break;
            }
        }
        while(choice > 0 && choice <= 8);
        System.out.println("Cam on ban da su dung <3 ");
    }


    public static void menu()
    {
        System.out.println("=========MENU=========");
        System.out.println("1. Add Course");
        System.out.println("2. Remove Course");
        System.out.println("3. Print Course ");
        System.out.println("4. Tim kiem bang ID");
        System.out.println("5. Tim kiem bang Course");
        System.out.println("6. Tim kiem vang Department");
        System.out.println("7. Sap xep");
        System.out.println("8. Tim Department MAX Course");
        System.out.println("0. Exit");
        System.out.println("======================");
    }

    public static void printCourse(CourseList courseList)
    {
        System.out.println(String.format("%-30s %-30s %-30s %10s", "ID", "Title", "Department", "Credit"));
        Course temp[] = courseList.getCourses();
        for (Course course : temp){
            if (course != null)
            {
                System.out.println(course.toString());
            }
        }
    }
}

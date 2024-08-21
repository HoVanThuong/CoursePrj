/*
 * @ Ho Van Thuong.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */

package iuh.edu.fit;


/*
 * @description:
 * @author:
 * @date: 21/08/2024
 * @version: 1.0
 */

import java.util.Arrays;
import java.util.HashMap;

public class CourseList {
    private Course[] courses;
    private int count = 0;


    public CourseList(int n) {
        this.courses = new Course[n];
    }

    public Course[] getCourses() {
        return this.courses;
    }

    public boolean addCourse(Course c) {
        if (c == null) {
            return false;
        }
        if (count == this.courses.length) {
            return false;
        }
        if (isExits(c))
        {
            throw new IllegalArgumentException("Khoa hoc da ton tai");
        }
        this.courses[count++] = c;
        return true;
    }

    public boolean removeCourse(String id) {
        if (id == null) {
            return false;
        }
        if (this.count == 0)
        {
            return false;
        }

        // Tim kiem
        for (int i = 0; i < count ; i++ )
        {
            if (this.courses[i].getId().equals(id) )
            {
                break;
            }
            else
            {
                if (i == this.count - 1)
                    throw new IllegalArgumentException("Khoa hoc khong ton tai");
            }
        }
       for (int i = 0; i < count; i++) {
           if (this.courses[i].getId().equals(id)) {
               for (int j = i; j < count-1; j++) {
                   {
                       this.courses[j] = this.courses[j+1];
                   }
               }
               this.courses[count-1] = null;
               count--;
               i--;
           }
       }
       return true;
    }

    public boolean isExits(Course c) {
        for (int i = 0; i < this.count; i++) {
            if (c.equals(this.courses[i])) {
                return true;
            }
        }
        return false;
    }

    public Course searchCourseById(String id)
    {
        for (int i = 0; i < this.count; i++) {
            if (this.courses[i].getId().equals(id)) {
                return this.courses[i];
            }
        }
        return null;
    }

    public Course[] searchCourse(String name) {
        CourseList c = new CourseList(this.count);
        for (int i = 0; i < this.count; i++) {
            if (this.courses[i].getTitle().equals(name)) {
                c.addCourse(this.courses[i]);
            }
        }
        return c.getCourses();
    }

    public Course[] searchCourseByDepartment(String name) {
        CourseList c = new CourseList(this.count);
        for (int i = 0; i < this.count; i++) {
            if (this.courses[i].getDepartment().equals(name)) {
               c.addCourse(this.courses[i]);
            }
        }
        return c.getCourses();
    }

    // Sap xep doi cho truc tiep
    public Course[] sortCourse()
    {
        Course[] temp = this.courses;
        for (int i = 0; i < this.count - 1; i++) {
            for (int j = i + 1; j < this.count; j++) {
                if (temp[i].getTitle().compareTo(temp[j].getTitle()) > 0) {
                    Course temp2 = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temp2;
                }
            }
        }
        return temp;
    }

    public Course findMaxCreditCourse()
    {
        if (this.count == 0)
            return null;
        Course max = this.courses[0];
        for (int i = 0; i < this.count; i++) {
            if (this.courses[i].getCredit() > max.getCredit()) {
                max = this.courses[i];
            }
        }
        return max;
    }

    public String findDepartmentMaxCourse()
    {
        Map map[] = new Map[this.count];
        for (int i = 0; i < this.count; i++) {
           map[i] = new Map("",0);
        }
        int cnt = 0;
        for (int i = 0; i < this.count; i++) {
            boolean find = false;
            for (int j = 0; j < cnt; j++)
            {
                if (this.courses[i].getDepartment().equals(map[i].getKey())) {
                    map[j].tangValue();
                    find = true;
                    break;
                }
            }
            if (!find) {
                map[cnt++].put(this.courses[i].getDepartment());
            }
        }
        int maxIdex = 0;
        for(int i = 0; i < cnt; i++)
        {
            if (map[maxIdex].getValue() < map[i].getValue())
                maxIdex = i;
        }
        return map[maxIdex].getKey();
    }

    public int getCount()
    {
        return count;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }
}


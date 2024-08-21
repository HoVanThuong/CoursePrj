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

public class Course {
    private String id;
    private String title;
    private String department;
    private int credit;

    // Constructor
    public Course() {
        this.id = "";
        this.title = "";
        this.department = "";
        this.credit = 0;
    }

    public Course(String id, String title, String department, int credit) {
        this.setId(id);
        this.setTitle(title);
        this.setDepartment(department);
        this.setCredit(credit);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null)
            throw new IllegalArgumentException("ID can not be null");
        if (id.length() < 3)
            throw new IllegalArgumentException("ID must be at least 3 characters");
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isLetter(id.charAt(i)) && !Character.isDigit(id.charAt(i))) {
                throw new IllegalArgumentException("ID must contain only letters and numbers");
            }
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null)
            throw new IllegalArgumentException("Title can not be null");
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        if (credit < 0)
            throw new IllegalArgumentException("Credit must be greater than 0");
        this.credit = credit;
    }

    public String toString() {
        return String.format("%-30s %-30s %-30s %10d", id, title, department, credit);
    }
}

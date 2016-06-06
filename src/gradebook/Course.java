/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pc_owner
 */
public class Course implements Serializable {
    private String courseName;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<AssignmentType> aTypeList = new ArrayList<AssignmentType>();
    public Course (String name) {
        courseName = name;
    }
    
    public String[] getStudentsForTable() {
        String[] ret = new String[studentList.size()];
        int i = 0;
        for (Student s : studentList) {
            ret[i] = s.getName();
            i++;
        }
        return ret;
    }
    public String[] getAssignmentTypesForTable() {
        String[] ret = new String[aTypeList.size()];
        int i = 0;
        for (AssignmentType a : aTypeList) {
            ret[i] = a.getName();
            i++;
        }
        return ret;
    }
    public ArrayList<AssignmentType> getAssignmentTypes() {
        return aTypeList;
    }
    public Student getStudent(int i) {
        return studentList.get(i);
    }
    public void addStudent(Student s) {
        studentList.add(s);
    }
    public void removeStudent(int i) {
        studentList.remove(i);
    }
    public AssignmentType getAssignmentType(int i) {
        return aTypeList.get(i);
    }
    public void addAType(AssignmentType a) {
        aTypeList.add(a);
    }
    public void removeAType(int i) {
        aTypeList.remove(i);
    }
    public String getName() {
        return courseName;
    }
    public void editName(String n) {
        courseName = n;
    }
    
    @Override
    public String toString() {
        return courseName;
    }

}

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
public class Student implements Serializable {
    private String studentName;
    private int studentAverage = 1;
    private ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
    public Student (String name) {
        studentName = name;
    }
    public String getName() {
        return studentName;
    }
    public void setName(String s) {
        studentName = s;
    }
    public void addAssignment(Assignment a) {
        assignmentList.add(a);
    }
    public void deleteAssignment(int i) {
        assignmentList.remove(i);
    }
    public Assignment getAssignment(int i) {
        return assignmentList.get(i);
    }
    public String[] getAssignmentsForTable() {
        String[] ret = new String[assignmentList.size()];
        int i = 0;
        for (Assignment a : assignmentList) {
            ret[i] = a.getName();
            i++;
        }
        return ret;
    }
    public String getAverage() {
        double average=0, possible=0;
        for (Assignment a : assignmentList) {
            average += a.getScore();
            possible += 100;
        }
        average = average / possible;
        return Double.toString(average);
    }
    
}

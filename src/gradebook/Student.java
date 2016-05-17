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
    private ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
    public Student (String name) {
        studentName = name;
    }
    
}

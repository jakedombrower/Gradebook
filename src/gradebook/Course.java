/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author pc_owner
 */
public class Course implements Serializable {
    private String courseName;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    public Course (String name) {
        courseName = name;
    }
    
    
    @Override
    public String toString() {
        return courseName;
    }

}

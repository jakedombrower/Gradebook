/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jakedombrower
 */
public class Gradebook implements Serializable {
    private ArrayList<Course> courseList = new ArrayList<Course>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Gradebook g = null;
      //Load Gradebook from serial file
      g = loadGradebook();
      GradebookFrame f = new GradebookFrame(g);
      WindowListener exitListener = new CustomWindowListener(g);
      f.addWindowListener(exitListener);
      f.setVisible(true);
      
    }

    
    
//  Accessors and Modifiers for Gradebook courses
    public void addCourse(Course c) {
        courseList.add(c);
    }
    public void removeCourse(int i) {
        courseList.remove(i);
    }
    public Course getCourse(int i) {
        return courseList.get(i);
    }
    public void printCourses() {
        for(Course c: courseList)
            System.out.println(c);
    }
    public ArrayList<Course> getCourses() {
        return courseList;
    }
    public String[] getCoursesForTable() {
        String[] ret = new String[courseList.size()];
        int i = 0;
        for (Course c : courseList) {
            ret[i] = c.toString();
            i++;
        }
        return ret;
    }
    
    
//  Serialization methods for loading and saving
    public static Gradebook loadGradebook() {
      Gradebook g = null;
      //Load Gradebook from serial file
      try
      {
         FileInputStream fileIn = new FileInputStream("gradebookdata.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         g = (Gradebook) in.readObject();
         in.close();
         fileIn.close();
         System.out.println("Gradebook successfully loaded");
         
      }catch(IOException i)
      {
         System.out.println("Valid Gradebook not found... creating empty one...");
         g = new Gradebook();
      }catch(ClassNotFoundException c)
      {
         
      }
      return g;
    }
    public void saveGradebookAndQuit() {
        try
      {
         FileOutputStream fileOut =
         new FileOutputStream("gradebookdata.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(this);
         out.close();
         fileOut.close();
         System.out.printf("Serialized Gradebook is saved in file");
         System.exit(0);
      }catch(IOException i)
      {
          i.printStackTrace();
      }
    }

    
    
    
}

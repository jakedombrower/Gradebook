/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.io.Serializable;

/**
 *
 * @author pc_owner
 */
public class Assignment implements Serializable {
    private String aName;
    private AssignmentType aType;
    private int aScore;
    public Assignment(String name, AssignmentType type, int score) {
        aName = name;
        aType = type;
        aScore = score;
    }
    public String getName() {
        return aName;
    }
    public AssignmentType getType() {
        return aType;
    }
    public int getScore() {
        return aScore;
    }
    public void setName(String n) {
        aName = n;
    }
    public void setScore(int s) {
        aScore = s;
    }
}

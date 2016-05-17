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
public class AssignmentType implements Serializable {
    private String name;
    private int weight;
    public AssignmentType(String n, int w) {
        name = n;
        weight = w;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
}

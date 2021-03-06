/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import javax.swing.*;

/**
 *
 * @author pc_owner
 */
public class CourseFrame extends javax.swing.JFrame {
    private Gradebook gradebook;
    private Course course;
    private GradebookFrame parentFrame;

    /**
     * Creates new form CourseFrame
     */
    public CourseFrame(Gradebook g, Course c, GradebookFrame gf) {
        gradebook = g;
        course = c;
        parentFrame = gf;
        initComponents();
        refreshLists();
        jLabel2.setText("Course view for: "+course.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentJList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        viewButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        assignmentJList = new javax.swing.JList<>();
        viewAButton = new javax.swing.JButton();
        deleteAButton = new javax.swing.JButton();
        newAButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        editTextButton = new javax.swing.JButton();

        setTitle("Course View");

        studentJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(studentJList);

        jLabel1.setText("Students in this course:");

        viewButton.setText("View Student");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        newButton.setText("New");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(viewButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewButton)
                    .addComponent(deleteButton)
                    .addComponent(newButton))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Students", jPanel1);

        jLabel3.setText("Assignment Categories in this course:");

        assignmentJList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(assignmentJList);

        viewAButton.setText("View Category");
        viewAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAButtonActionPerformed(evt);
            }
        });

        deleteAButton.setText("Delete");
        deleteAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAButtonActionPerformed(evt);
            }
        });

        newAButton.setText("New");
        newAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(viewAButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteAButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newAButton)))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAButton)
                    .addComponent(deleteAButton)
                    .addComponent(newAButton))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Assignment Categories", jPanel2);

        jLabel2.setText("Course View for: COURSE_NAME");

        editTextButton.setText("Edit name");
        editTextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(editTextButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(editTextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editTextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextButtonActionPerformed
        EditCourseNameFrame ef = new EditCourseNameFrame(course, this);
        ef.setVisible(true);
    }//GEN-LAST:event_editTextButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        StudentFrame sf = new StudentFrame(course.getStudent(studentJList.getSelectedIndex()), this, course);
        sf.setVisible(true);
    }//GEN-LAST:event_viewButtonActionPerformed

    private void viewAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAButtonActionPerformed
        AssignmentTypeFrame atf = new AssignmentTypeFrame(course.getAssignmentType(assignmentJList.getSelectedIndex()),this);
        atf.setVisible(true);
    }//GEN-LAST:event_viewAButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int i = studentJList.getSelectedIndex();
        if (i != -1) {
            course.removeStudent(i);
            studentJList.setListData(course.getStudentsForTable());
        } else {
           JOptionPane.showMessageDialog(new JFrame(), "Please select a Student to be deleted before clicking delete", "Error!", JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        course.addStudent(new Student("New Student"));
        studentJList.setListData(course.getStudentsForTable());
    }//GEN-LAST:event_newButtonActionPerformed

    private void newAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAButtonActionPerformed
        course.addAType(new AssignmentType("New Assignment Category",1));
        refreshLists();
    }//GEN-LAST:event_newAButtonActionPerformed

    private void deleteAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAButtonActionPerformed
        int i = assignmentJList.getSelectedIndex();
        if (i != -1) {
            course.removeAType(i);
            refreshLists();
        } else {
           JOptionPane.showMessageDialog(new JFrame(), "Please select a type to be deleted before clicking delete", "Error!", JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_deleteAButtonActionPerformed

    public void refreshName() {
        jLabel2.setText("Course View For: "+course.getName());
        parentFrame.jList1.setListData(gradebook.getCoursesForTable());
    }
    
    public void refreshLists() {
        studentJList.setListData(course.getStudentsForTable());
        assignmentJList.setListData(course.getAssignmentTypesForTable());
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JList<String> assignmentJList;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteAButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editTextButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton newAButton;
    private javax.swing.JButton newButton;
    private javax.swing.JList<String> studentJList;
    private javax.swing.JButton viewAButton;
    private javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}

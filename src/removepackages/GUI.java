/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removepackages;

import java.io.*;


/**
 *
 * @author dubielsw
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Run = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Directory = new javax.swing.JTextField();
        SetDir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Remove Packages");

        Run.setText("Run");
        Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier10 BT", 0, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 255, 51));
        jTextArea1.setRows(5);
        jTextArea1.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTextArea1);

        Directory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DirectoryActionPerformed(evt);
            }
        });

        SetDir.setText("Set Directory");
        SetDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetDirActionPerformed(evt);
            }
        });

        jLabel1.setText("Ex H:\\cs245\\RemovePackages");

        jLabel2.setText("If you want to affect packages in \"RemovePackages.jar\"s location,");

        jLabel3.setText("clear the \"Set Directory\" text area and click the \"Set Directory\" button.");

        jButton1.setText("Starts With");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setText("packages");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("For a line you want to delete, input what the line will start with. Click ");

        jLabel5.setText("the \"Starts With\" button to set the line to be deleted.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Run, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SetDir)
                                .addGap(18, 18, 18)
                                .addComponent(Directory))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Directory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetDir)
                    .addComponent(Run))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
 * When the run button is pressed the program checks for packages in any .java files.
 * @param evt 
 */
    private void RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunActionPerformed
        //clears the text box.
        jTextArea1.setText("");
        
        
        try{
        String lineToRemove = toDelete;  
        
        String target_dir; 
         
        if(dir.equals("")){
        target_dir   = ".";
        }
        else{
            target_dir = dir;
        }
        //creates array of all files in the dir
        String textfile;
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        //runs through the files looking for the keyword
            for (File textfiles : files) {
                //This sets what type of file the program looks for, it could be changed to look for other file types.
                if (textfiles.isFile() && textfiles.getName().endsWith(".java")) {
                    jTextArea1.append("Found and Checked " +textfiles.getName() + "\n");
                    //creates temp file that will be edited and then replace the original
                BufferedReader inputStream = null;
                PrintWriter pw = null;
                File tmp = File.createTempFile("tmp", "");
                try {
                    inputStream = new BufferedReader(new FileReader(textfiles));
                    
                    pw = new PrintWriter(new FileWriter(tmp));
                    String line;

                    while ((line = inputStream.readLine()) != null) {
                        
                        if (!line.trim().startsWith(lineToRemove)) {
                        //this is the writing of the file, it wont happen if the keyword is found.
                            pw.println(line);
                            pw.flush();
                          }
                        else{
                            jTextArea1.append(" Deleted \"" + line + "\" from " +textfiles.getName() + "\n");
                        }
                    }
                        pw.close();

                        inputStream.close();
                        if (!textfiles.delete()) {
                          jTextArea1.append("Could not delete file");
                          return;
                        }

                        //Rename the new file to the filename the original file had.
                        if (!tmp.renameTo(textfiles)){
                          jTextArea1.append("Could not rename file");

                      }                    
                } finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            }
        }
     }catch(Exception e){
         jTextArea1.append("file not found");
     }
    }//GEN-LAST:event_RunActionPerformed

    private void DirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DirectoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DirectoryActionPerformed
    //sets the directory and tells you which files are in that location.
    private void SetDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetDirActionPerformed
        
        dir = Directory.getText();
        jTextArea1.setText("");
        try{ 
        
        String target_dir; 
         
        if(dir.equals("")){
        target_dir   = ".";
        }
        else{
            target_dir = dir;
        }
        
        String textfile;
        File dir = new File(target_dir);
        File[] files = dir.listFiles();
        
            for (File textfiles : files) {

                if (textfiles.isFile() && textfiles.getName().endsWith(".java")) {
                    jTextArea1.append("Found " +textfiles.getName() + "\n");
            }
        }
     }catch(Exception e){
         jTextArea1.append("Files not found...");
     }
        
        
    }//GEN-LAST:event_SetDirActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        toDelete = jTextField2.getText();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    private String toDelete = "package";
    private String dir = "";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Directory;
    private javax.swing.JButton Run;
    private javax.swing.JButton SetDir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

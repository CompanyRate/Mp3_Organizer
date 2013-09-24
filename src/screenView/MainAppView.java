package screenView;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Mp3 Organizer MP3 Application to organize mp3 files in a crude way that no
 * other application has done before.
 */
public class MainAppView extends javax.swing.JFrame {

    /**
     * Creates new form MainAppView
     */
    public MainAppView() {
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

        inputLb = new javax.swing.JLabel();
        outputLb = new javax.swing.JLabel();
        AppName = new javax.swing.JLabel();
        inputDir = new javax.swing.JTextField();
        outputDir = new javax.swing.JTextField();
        processBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgCenter = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        progressDS = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        inputLb.setText("Input Directory  :");

        outputLb.setText("Input Directory  :");

        AppName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AppName.setText("Mp3 Organizer Application");

        inputDir.setText("C:\\JavaProjects\\music\\source");

        outputDir.setText("C:\\JavaProjects\\music\\destination");

        processBTN.setText("Process Files");
        processBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processBTNActionPerformed(evt);
            }
        });

        msgCenter.setColumns(20);
        msgCenter.setRows(5);
        jScrollPane1.setViewportView(msgCenter);

        jLabel1.setText("Files Processed or error message    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(progressDS, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(processBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(inputLb, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputDir, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(outputLb, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(outputDir))
                            .addComponent(AppName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AppName)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLb)
                    .addComponent(inputDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputLb)
                    .addComponent(outputDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(processBTN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(progressDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void processBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processBTNActionPerformed
        // once user presses process button get user's directory information
        // and other information needed to process 
        String input = inputDir.getText();
        String output = outputDir.getText();

        //check directory 
        boolean inputCk = DirectoryFileFunctions.DirectoryCheck.dirCheck(input);
        boolean outputCk = DirectoryFileFunctions.DirectoryCheck.dirCheck(output);


        // Check directories to make sure they are different 
        if (inputCk && outputCk) {
            msgCenter.setText("Direcotry passes");
            //directory are valid check to see if they are different then process
            boolean diff = DirectoryFileFunctions.DirectoryCheck.compareDir(input, output);
            if (diff) {
                //directories are different and exist 
                try {
                    List<File> FileList = DirectoryFileFunctions.DirectoryCheck.fileList(input);

                    int cnt = 1;
          
                    for (File file : FileList) {
                      //Process file 
                      String fileLocation = file.toString();         
                      Mp3_orgProcess.ProcessFiles.ProcessFiles(fileLocation, output, cnt);
                      cnt = cnt + 1;
                    }

                } catch (IOException ex) {
                    msgCenter.setText("There was a problem with a file");
                    Logger.getLogger(MainAppView.class.getName()).log(Level.SEVERE, null, ex);
                }


            } else {
                // There was a problem 
                msgCenter.setText("There was a problem your directories appear to be the same");
            }


        } else {
            msgCenter.setText("There was a problem your directories appear to be the same");
        }

        //Mp3_orgProcess.ProcessFiles.ProcessFiles(inputDir, outputDir);

        //end of program
    }//GEN-LAST:event_processBTNActionPerformed

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
            java.util.logging.Logger.getLogger(MainAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAppView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAppView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AppName;
    private javax.swing.JTextField inputDir;
    private javax.swing.JLabel inputLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea msgCenter;
    private javax.swing.JTextField outputDir;
    private javax.swing.JLabel outputLb;
    private javax.swing.JButton processBTN;
    private javax.swing.JProgressBar progressDS;
    // End of variables declaration//GEN-END:variables
}

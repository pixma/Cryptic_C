/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ServerOP.java
 *
 * Created on 18 Feb, 2012, 2:11:19 AM
 */
package outputserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
//import java.lang.t
/**
 *
 * @author rajiv
 */
public class ServerOP extends javax.swing.JFrame  {

       public Timer coutdown;
        protected FileWriter fstream;
    protected BufferedWriter out;
    protected BufferedReader br;
    protected File tosave;
    protected String file;
    protected String logname;
    
    /** Creates new form ServerOP */
    public ServerOP() {
            initComponents();
         try{   coutdown= new Timer(1000,timer);
            
           
            
          //  selRnd.addActionListener(this);
         }catch(Exception e){
             System.out.println(e.getMessage());
             
                
         }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        op = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        logName = new javax.swing.JTextField();
        start = new javax.swing.JButton();
        stop = new javax.swing.JButton();
        newlog = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cryptic-C");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24));
        jLabel1.setText("OutPut Server");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        op.setBackground(new java.awt.Color(244, 253, 202));
        op.setColumns(20);
        op.setEditable(false);
        op.setFont(new java.awt.Font("Ubuntu", 1, 14));
        op.setForeground(new java.awt.Color(0, 72, 255));
        op.setRows(5);
        jScrollPane1.setViewportView(op);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 942, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        jLabel2.setText("Enter_Log_Name:-");

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        newlog.setText("New_Log");
        newlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newlogActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addComponent(logName, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(newlog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 799, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(stop)
                    .addComponent(jLabel2)
                    .addComponent(logName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newlog)
                    .addComponent(exit)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        try {
            if(tosave == null){
                JOptionPane.showConfirmDialog(null, "Nothing in Log Area. Cannot Quit Now."); return;
            }
            fstream = new FileWriter(tosave);
        out = new BufferedWriter(fstream);
        out.write(op.getText());
        out.close();
        System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(ServerOP.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_exitActionPerformed

private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
                    
                       file=logName.getText();
                       logname="./rsltlog/"+file+".log";
                     tosave=new File(logname);
                     op.setText("**************************************\nLog for "+file+"\n**************************************\n");
                     
                    coutdown.start();
                    start.setEnabled(false);
                    // TODO add your handling code here:
}//GEN-LAST:event_startActionPerformed

private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        try {
            fstream = new FileWriter(tosave);
                  out = new BufferedWriter(fstream);
                  out.write(op.getText());
                  out.close();
                  coutdown.stop();
        } catch (IOException ex) {
            Logger.getLogger(ServerOP.class.getName()).log(Level.SEVERE, null, ex);
        }
       
}//GEN-LAST:event_stopActionPerformed

private void newlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newlogActionPerformed
        try {
            fstream = new FileWriter(tosave);
            out = new BufferedWriter(fstream);
            out.write(op.getText());
            out.close();
            coutdown.stop();
            op.setText(null);
            logName.setText(null);
            start.setEnabled(true);
            
        } catch (IOException ex) {
            Logger.getLogger(ServerOP.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
}//GEN-LAST:event_newlogActionPerformed
            // String capitalizedSentence;
            ActionListener timer = new ActionListener() {
     int min= 0;
     int sec = 1;
      
    public void actionPerformed(ActionEvent evt) {
        
        
         
                try {
                       fstream = new FileWriter(tosave);
                       out = new BufferedWriter(fstream);
                       out.write(op.getText());
                       out.close();
                } catch (IOException ex) {
                    Logger.getLogger(ServerOP.class.getName()).log(Level.SEVERE, null, ex);
                }
                
         
           
    }
  
  };
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            
            ServerSocket welcomeSocket  = new ServerSocket(6789);
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
                java.util.logging.Logger.getLogger(ServerOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ServerOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ServerOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ServerOP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>
              java.awt.EventQueue.invokeLater(new Runnable() {
                    
               
                public void run() {
                    new ServerOP().setVisible(true);
                }
            });
           
              
              
              while (true){
                   new MultiClient(welcomeSocket.accept()).start();
               }
              
              
              
              
              
              
        }catch (Exception ex) {
            Logger.getLogger(ServerOP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField logName;
    private javax.swing.JButton newlog;
    public static javax.swing.JTextArea op;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables

   // @Override
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icmf;

import java.awt.CardLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author deepak
 */
public class Main_Panel extends javax.swing.JPanel {

    /**
     * Creates new form Customer_Details
     */
    public Main_Panel() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(104, 121, 249));
        setMaximumSize(new java.awt.Dimension(590, 513));
        setMinimumSize(new java.awt.Dimension(590, 513));
        setPreferredSize(new java.awt.Dimension(590, 513));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        jButton1.setText("Customer Entry");
        jButton1.setMaximumSize(new java.awt.Dimension(125, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(125, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(125, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Input/Update System Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Session Log Directory");
        jButton3.setMaximumSize(new java.awt.Dimension(198, 30));
        jButton3.setMinimumSize(new java.awt.Dimension(198, 30));
        jButton3.setPreferredSize(new java.awt.Dimension(198, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("View System Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Today's Sales");
        jButton5.setMaximumSize(new java.awt.Dimension(147, 30));
        jButton5.setMinimumSize(new java.awt.Dimension(147, 30));
        jButton5.setPreferredSize(new java.awt.Dimension(147, 30));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("View Customer Information");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Arial",Font.BOLD,15));
        jLabel1.setText("WELCOME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton6)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        system_Details1.initialize_parameters(B);
        CardLayout cardLayout = (CardLayout) jButton1.getParent().getParent().getLayout();
        cardLayout.show(jButton1.getParent().getParent(), "card7");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        view_System_details1.initialize_parameters();
        CardLayout cardLayout = (CardLayout) jButton1.getParent().getParent().getLayout();
        cardLayout.show(jButton1.getParent().getParent(), "card8");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
		FileInputStream fi = new FileInputStream(new File("Customer_Info_File.dat"));
		ObjectInputStream oi = new ObjectInputStream(fi);

		customer_info1=(icmf.Customer_info) oi.readObject();
                oi.close();
		fi.close();

            } catch (FileNotFoundException e) {
		java.lang.System.out.println("File not found");
            }catch (IOException e) {
		java.lang.System.out.println("Error initializing stream");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        customer_Information1.jTextArea1.setText(customer_info1.toString());
        CardLayout cardLayout = (CardLayout) jButton1.getParent().getParent().getLayout();
        cardLayout.show(jButton1.getParent().getParent(), "card6");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        customer.name="";
        customer.Age=0;
        customer.Sex="";
        customer.Mobile_No="";
        customer.Email_Address="";
        customer.Address="";
        customer.System="";
        customer.Printer="";
        customer.Xerox="";
        customer.duration=0;
        customer.no_print=0;
        customer.no_xerox=0;
        customer.System_TNO="None";
        customer.System_waiting_time=0;
        customer.Printer_TNO="None";
        customer.Xerox_TNO="None";
        customer.System_cost=0;
        customer.Printer_cost=0;
        customer.Xerox_cost=0;
        customer.Total_cost=0;
        CardLayout cardLayout = (CardLayout) jButton1.getParent().getParent().getLayout();
        cardLayout.show(jButton1.getParent().getParent(), "card3");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        icmf.Sales sales=new icmf.Sales();
        try {
		FileInputStream fi = new FileInputStream(new File("Sales_Info_File.dat"));
		ObjectInputStream oi = new ObjectInputStream(fi);

		Sales1=(icmf.Sales) oi.readObject();
                oi.close();
		fi.close();

            } catch (FileNotFoundException e) {
		java.lang.System.out.println("File not found");
            }catch (IOException e) {
		java.lang.System.out.println("Error initializing stream");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Main_Panel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        if(!Sales1.check()){
                try {
                    FileOutputStream f1 = new FileOutputStream(new File("Sales_Info_File.dat"));
                    ObjectOutputStream o = new ObjectOutputStream(f1);
                    o.writeObject(sales);
                    o.close();
                    f1.close();
                    } catch (FileNotFoundException e) {
                       java.lang.System.out.println("File not found");
                    } catch (IOException e) {
                      java.lang.System.out.println("Error initializing stream");
                    }
                Sales1=sales;
            }
        
        
        todays_Sales1.jLabel18.setText(Integer.toString(Sales1.no_Browsing_s));
        todays_Sales1.jLabel20.setText(Integer.toString(Sales1.no_acaedmic_s));
        todays_Sales1.jLabel19.setText(Integer.toString(Sales1. no_gaming_s));
        todays_Sales1.jLabel21.setText(Integer.toString(Sales1.no_color_printer_s));
        todays_Sales1.jLabel22.setText(Integer.toString(Sales1.no_plain_printer_s));
        todays_Sales1.jLabel23.setText(Integer.toString(Sales1.no_black_xerox_s));
        todays_Sales1.jLabel24.setText(Integer.toString(Sales1.no_color_xerox_s));
        todays_Sales1.jLabel12.setText(Integer.toString(Sales1.total));
        
        CardLayout cardLayout = (CardLayout) jButton1.getParent().getParent().getLayout();
        cardLayout.show(jButton1.getParent().getParent(), "card9");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) jButton1.getParent().getParent().getLayout();
        cardLayout.show(jButton1.getParent().getParent(), "card10");
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //Custom Coded Functions
    
    public void initialize_parameters(icmf.System_Details system_Details1,icmf.View_System_details view_System_details1,icmf.Customer_Information customer_Information1,icmf.Customer_info customer_info1,icmf.Todays_Sales todays_Sales1,icmf.System system,icmf.Customer_Requirements customer_Requirements1,icmf.Customer customer){
        
        this.system_Details1=system_Details1;
        this.view_System_details1=view_System_details1;
        this.customer_Information1 =customer_Information1;
        this.customer_info1=customer_info1;
        this.todays_Sales1=todays_Sales1;
        this.system=system;
        this.customer_Requirements1=customer_Requirements1;
        this.customer=customer;
        B=new javax.swing.JButton[5];
        B[0]=jButton1;
        B[1]=jButton3;
        B[2]=jButton4;
        B[3]=jButton5;
        B[4]=jButton6;

    }
    
    //End of Custom Coded Functions
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    // Variables declaration - Custom Code
    public icmf.System_Details system_Details1;
    public icmf.View_System_details view_System_details1;
    public icmf.Customer_Information customer_Information1;
    public icmf.Customer_info customer_info1;
    public icmf.Sales Sales1;
    public icmf.Todays_Sales todays_Sales1;
    public icmf.System system;
    public javax.swing.JButton [] B;
    public icmf.Customer_Requirements customer_Requirements1;
    public icmf.Customer customer;
    // End of variables declaration 
}

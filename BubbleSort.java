/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daapro;

import AppPackage.AnimationClass;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Dilhan
 */
public class BubbleSort extends javax.swing.JPanel implements Runnable{
      AnimationClass ac = new AnimationClass();
    Thread t1;
    int Array[];
    JButton[] JB_array;
    
    public BubbleSort() {
        initComponents();
          t1=new Thread (this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_1 = new javax.swing.JTextField();
        txt_2 = new javax.swing.JTextField();
        txt_3 = new javax.swing.JTextField();
        txt_4 = new javax.swing.JTextField();
        txt_5 = new javax.swing.JTextField();
        txt_6 = new javax.swing.JTextField();
        txt_7 = new javax.swing.JTextField();
        txt_8 = new javax.swing.JTextField();
        btn_Sort = new javax.swing.JButton();
        btn_Stop = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        txt_1.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        txt_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_1ActionPerformed(evt);
            }
        });

        txt_2.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        txt_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_2ActionPerformed(evt);
            }
        });

        txt_3.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        txt_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_3ActionPerformed(evt);
            }
        });

        txt_4.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        txt_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_4ActionPerformed(evt);
            }
        });

        txt_5.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        txt_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_5ActionPerformed(evt);
            }
        });

        txt_6.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        txt_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_6ActionPerformed(evt);
            }
        });

        txt_7.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        txt_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_7ActionPerformed(evt);
            }
        });

        txt_8.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        txt_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_8ActionPerformed(evt);
            }
        });

        btn_Sort.setBackground(new java.awt.Color(153, 255, 153));
        btn_Sort.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        btn_Sort.setText("Sort");
        btn_Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SortActionPerformed(evt);
            }
        });

        btn_Stop.setBackground(new java.awt.Color(255, 102, 102));
        btn_Stop.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        btn_Stop.setText("Stop");
        btn_Stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_StopActionPerformed(evt);
            }
        });

        btn_Clear.setBackground(new java.awt.Color(102, 153, 255));
        btn_Clear.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jLabel1.setText("Creation By Thusith Kumarage");

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jLabel2.setText("SLIIT");

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 3, 24)); // NOI18N
        jLabel3.setText("BubbleSort Simulator");

        jLabel4.setFont(new java.awt.Font("Traditional Arabic", 3, 12)); // NOI18N
        jLabel4.setText("Enter 8 Numbers");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(245, 245, 245)
                            .addComponent(txt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(txt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(btn_Sort, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(172, 172, 172)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(304, 304, 304)
                            .addComponent(txt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(629, 629, 629)
                            .addComponent(btn_Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(629, 629, 629)
                            .addComponent(btn_Clear))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(380, 380, 380)
                            .addComponent(txt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(228, 228, 228)
                            .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(76, 76, 76)
                            .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(228, 228, 228)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(btn_Sort, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txt_5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(82, 82, 82)
                            .addComponent(btn_Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(100, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_1ActionPerformed
        txt_2.grabFocus();
    }//GEN-LAST:event_txt_1ActionPerformed

    private void txt_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_2ActionPerformed
        txt_3.grabFocus();
    }//GEN-LAST:event_txt_2ActionPerformed

    private void txt_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_3ActionPerformed
        txt_4.grabFocus();
    }//GEN-LAST:event_txt_3ActionPerformed

    private void txt_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_4ActionPerformed
        txt_5.grabFocus();
    }//GEN-LAST:event_txt_4ActionPerformed

    private void txt_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_5ActionPerformed
        txt_6.grabFocus();
    }//GEN-LAST:event_txt_5ActionPerformed

    private void txt_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_6ActionPerformed
        txt_7.grabFocus();
    }//GEN-LAST:event_txt_6ActionPerformed

    private void txt_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_7ActionPerformed
        txt_8.grabFocus();
    }//GEN-LAST:event_txt_7ActionPerformed

    private void txt_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_8ActionPerformed
        txt_1.grabFocus();
    }//GEN-LAST:event_txt_8ActionPerformed

    private void btn_SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SortActionPerformed
        Array = new int[8];
        if (txt_1.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Insert a Number", "Warning", 2);
            txt_1.grabFocus();
        } else if (txt_2.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Insert a Number", "Warning", 2);
            txt_2.grabFocus();
        } else if (txt_3.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Insert a Number", "Warning", 2);
            txt_3.grabFocus();
        } else if (txt_4.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Insert a Number", "Warning", 2);
            txt_4.grabFocus();

        } else if (txt_5.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Insert a Number", "Warning", 2);
            txt_5.grabFocus();
        } else if (txt_6.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Insert a Number", "Warning", 2);
            txt_6.grabFocus();
        } else if (txt_7.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Insert a Number", "Warning", 2);
            txt_7.grabFocus();
        } else if (txt_8.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null, "Insert a Number", "Warning", 2);
            txt_8.grabFocus();
        } else {

            Array[0] = Integer.parseInt(txt_1.getText());
            Array[1] = Integer.parseInt(txt_2.getText());
            Array[2] = Integer.parseInt(txt_3.getText());
            Array[3] = Integer.parseInt(txt_4.getText());
            Array[4] = Integer.parseInt(txt_5.getText());
            Array[5] = Integer.parseInt(txt_6.getText());
            Array[6] = Integer.parseInt(txt_7.getText());
            Array[7] = Integer.parseInt(txt_8.getText());

            btn_1.setText(txt_1.getText());
            btn_2.setText(txt_2.getText());
            btn_3.setText(txt_3.getText());
            btn_4.setText(txt_4.getText());
            btn_5.setText(txt_5.getText());
            btn_6.setText(txt_6.getText());
            btn_7.setText(txt_7.getText());
            btn_8.setText(txt_8.getText());

        }
        JB_array = new JButton[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8};

        t1.start();
    }//GEN-LAST:event_btn_SortActionPerformed

    private void btn_StopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_StopActionPerformed
        t1.stop();
    }//GEN-LAST:event_btn_StopActionPerformed

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        txt_1.setText("");
        txt_2.setText("");
        txt_3.setText("");
        txt_4.setText("");
        txt_5.setText("");
        txt_6.setText("");
        txt_7.setText("");
        txt_8.setText("");

        btn_1.setLocation(JB_array[0].getBounds().x, JB_array[0].getBounds().y);
        btn_2.setLocation(JB_array[1].getBounds().x, JB_array[1].getBounds().y);
        btn_3.setLocation(JB_array[2].getBounds().x, JB_array[2].getBounds().y);
        btn_4.setLocation(JB_array[3].getBounds().x, JB_array[3].getBounds().y);
        btn_5.setLocation(JB_array[4].getBounds().x, JB_array[4].getBounds().y);
        btn_6.setLocation(JB_array[5].getBounds().x, JB_array[5].getBounds().y);
        btn_7.setLocation(JB_array[6].getBounds().x, JB_array[6].getBounds().y);
        btn_8.setLocation(JB_array[7].getBounds().x, JB_array[7].getBounds().y);

        JB_array = new JButton[]{btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8};

        btn_1.setText("");
        btn_2.setText("");
        btn_3.setText("");
        btn_4.setText("");
        btn_5.setText("");
        btn_6.setText("");
        btn_7.setText("");
        btn_8.setText("");
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed

    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed

    }//GEN-LAST:event_btn_1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Sort;
    private javax.swing.JButton btn_Stop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_1;
    private javax.swing.JTextField txt_2;
    private javax.swing.JTextField txt_3;
    private javax.swing.JTextField txt_4;
    private javax.swing.JTextField txt_5;
    private javax.swing.JTextField txt_6;
    private javax.swing.JTextField txt_7;
    private javax.swing.JTextField txt_8;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        //int Array[]={5,4,3,2,1};

        int temp;
        for (int i = 0; i < Array.length - 1; i++) {

            for (int j = 1; j < Array.length - i; j++) {
                if (Array[j - 1] > Array[j]) {

                    temp = Array[j - 1];
                    Array[j - 1] = Array[j];
                    Array[j] = temp;

                    JB_array[j].setBackground(Color.pink);
                    JB_array[j - 1].setBackground(Color.pink);

                    ac.jButtonXRight(JB_array[j - 1].getBounds().x, JB_array[j].getBounds().x, 40, 2, JB_array[j - 1]);
                    ac.jButtonXLeft(JB_array[j].getBounds().x, JB_array[j - 1].getBounds().x, 40, 2, JB_array[j]);

                    JButton temp2 = JB_array[j - 1];
                    JB_array[j - 1] = JB_array[j];
                    JB_array[j] = temp2;

                    try {

                        Thread.sleep(3000);

                    } catch (InterruptedException ex) {

                    }

                }
                JB_array[j].setBackground(null);
                JB_array[j - 1].setBackground(null);

            }
            JB_array[7 - i].setBackground(Color.green);

        }
        JB_array[0].setBackground(Color.green);
        JOptionPane.showMessageDialog(null, "Bubblesort Successfully Completed", "Success", JOptionPane.INFORMATION_MESSAGE);

    }
}

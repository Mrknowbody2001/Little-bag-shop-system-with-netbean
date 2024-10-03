/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package assignmentexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author NGC
 */
public class CasheirUI extends javax.swing.JFrame {

    /**
     * Creates new form CasheirUI
     */
    public CasheirUI() {
        initComponents();
        addBagPannel.setVisible(false);
        viewBagpannel.setVisible(false);
        searchBagPannel.setVisible(false);
    }
    private void clearData(){
        bagNameBox.setText(null);
        categoryBox1.setSelectedItem(null);
        bagQtyBox.setText(null);
        PriceBox.setText(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        addBagPannel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PriceBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bagQtyBox = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bagNameBox = new javax.swing.JTextField();
        addnewBagBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        categoryBox1 = new javax.swing.JComboBox<>();
        viewBagpannel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bagTable = new javax.swing.JTable();
        viewBagButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        searchBagPannel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bagTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        categoryBox2 = new javax.swing.JComboBox<>();
        seaarchBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        addBagimenu = new javax.swing.JMenuItem();
        searchBagMenu = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bag Name");

        jLabel2.setText("Bag Category");

        PriceBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Bag Qty");

        jLabel4.setText("Bag Price");

        addnewBagBtn.setText("Add New Bag");
        addnewBagBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnewBagBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Add new Bag");

        categoryBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tote Bag", "Shoulder Bag ", "Bagpack", " " }));

        javax.swing.GroupLayout addBagPannelLayout = new javax.swing.GroupLayout(addBagPannel);
        addBagPannel.setLayout(addBagPannelLayout);
        addBagPannelLayout.setHorizontalGroup(
            addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBagPannelLayout.createSequentialGroup()
                .addGroup(addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBagPannelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(281, 281, 281)
                        .addComponent(addnewBagBtn)
                        .addGap(223, 223, 223)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(addBagPannelLayout.createSequentialGroup()
                        .addGroup(addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addBagPannelLayout.createSequentialGroup()
                                .addGap(183, 183, 183)
                                .addComponent(jLabel11))
                            .addGroup(addBagPannelLayout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1)
                                .addGap(30, 30, 30)
                                .addGroup(addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addBagPannelLayout.createSequentialGroup()
                                        .addComponent(bagNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bagQtyBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addBagPannelLayout.createSequentialGroup()
                                        .addComponent(categoryBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PriceBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addBagPannelLayout.setVerticalGroup(
            addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addBagPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bagNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(bagQtyBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(categoryBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(PriceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(addBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addBagPannelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(addBagPannelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addnewBagBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        bagTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bag Name", "Bag Category", "Bag Qty", "Bag Price"
            }
        ));
        jScrollPane1.setViewportView(bagTable);

        viewBagButton.setText("View Bag");
        viewBagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBagButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("View Bag");

        javax.swing.GroupLayout viewBagpannelLayout = new javax.swing.GroupLayout(viewBagpannel);
        viewBagpannel.setLayout(viewBagpannelLayout);
        viewBagpannelLayout.setHorizontalGroup(
            viewBagpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewBagpannelLayout.createSequentialGroup()
                .addGroup(viewBagpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(viewBagpannelLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewBagButton))
                    .addGroup(viewBagpannelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        viewBagpannelLayout.setVerticalGroup(
            viewBagpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewBagpannelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(viewBagpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(viewBagButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        bagTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bag Name", "Bag Category", "Bag Prise", "Bag Qty"
            }
        ));
        jScrollPane2.setViewportView(bagTable2);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Search Bag");

        categoryBox2.setBackground(new java.awt.Color(204, 204, 204));
        categoryBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tote Bag", "Shoulder Bag", "Bagpack" }));
        categoryBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBox2ActionPerformed(evt);
            }
        });

        seaarchBtn.setText("Search");
        seaarchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seaarchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchBagPannelLayout = new javax.swing.GroupLayout(searchBagPannel);
        searchBagPannel.setLayout(searchBagPannelLayout);
        searchBagPannelLayout.setHorizontalGroup(
            searchBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchBagPannelLayout.createSequentialGroup()
                .addGroup(searchBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchBagPannelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchBagPannelLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel13))
                    .addGroup(searchBagPannelLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(categoryBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seaarchBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchBagPannelLayout.setVerticalGroup(
            searchBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchBagPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchBagPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seaarchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jMenu3.setText("Item Management");

        addBagimenu.setText("Add Bag");
        addBagimenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBagimenuActionPerformed(evt);
            }
        });
        jMenu3.add(addBagimenu);

        searchBagMenu.setText("View Bag");
        searchBagMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBagMenuActionPerformed(evt);
            }
        });
        jMenu3.add(searchBagMenu);

        jMenuItem3.setText("Search Bag");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(viewBagpannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(187, 187, 187)
                            .addComponent(addBagPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(184, 184, 184)
                            .addComponent(searchBagPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(213, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(viewBagpannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(addBagPannel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(334, 334, 334)
                    .addComponent(searchBagPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(14, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PriceBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceBoxActionPerformed

    private void addnewBagBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnewBagBtnActionPerformed
        Bag newBag = new Bag();

        // Check if any field is empty
        if(bagNameBox.getText().equals("") ||
            bagQtyBox.getText().equals("") ||
            categoryBox1.getSelectedItem()== null ||
            PriceBox.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Fill all fields");
        }
        else {
            // Parse the input values
            int bagQty = Integer.parseInt(bagQtyBox.getText());
            double bPrice = Double.parseDouble(PriceBox.getText());

            // Set the parsed values to the Bags object
            newBag.setBagQty(bagQty);  // SetBagID should accept int
            newBag.setbName(bagNameBox.getText());
            newBag.setbCategory(categoryBox1.getSelectedItem().toString());
            //  newBag.SetBagCat(bagCategory);
            newBag.setbPrice(bPrice);  // SetBagPrice should accept double

            // Perform the logic to add the bag
            BagAddLogic bAl = new BagAddLogic();
            bAl.AddNewBag(newBag);
            clearData();
        }

    }//GEN-LAST:event_addnewBagBtnActionPerformed

    private void viewBagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBagButtonActionPerformed
        // Assuming you have a JTable named bagsTable and a DefaultTableModel named tableModel
        String filePath = "E:\\icbt assignment\\sem2\\sem 2.2\\oop\\AssignmentExample\\bags.txt";
        File file = new File(filePath);

        DefaultTableModel model = (DefaultTableModel) bagTable.getModel();  // Initialize model

        model.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader(file)))  {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.trim().split(",");
                model.addRow(dataRow);
            }

        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewBagButtonActionPerformed

    private void categoryBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryBox2ActionPerformed

    private void seaarchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seaarchBtnActionPerformed
        // TODO add your handling code here:
        String filePath = "E:\\icbt assignment\\sem2\\sem 2.2\\oop\\AssignmentExample\\bags.txt";
        File file = new File(filePath);

        DefaultTableModel model = (DefaultTableModel) bagTable2.getModel();  // Initialize model
        model.setRowCount(0);  // Clear the table before displaying new data

        // Get the selected category from the combo box
        String selectedCategory = categoryBox2.getSelectedItem().toString().trim();

        // Check if the selected category is blank
        if (selectedCategory.isEmpty()) {
            // Show an error message if no category is selected
            JOptionPane.showMessageDialog(null, "Please select a bag category.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(",");  // Split by comma to get array elements

                if (dataRow.length > 1) {  // Ensure there are enough elements in the array
                    String bagCategory = dataRow[1].trim();  // Bag category is in the third column (index 2)

                    // Check if the category matches the selected category
                    if (bagCategory.equalsIgnoreCase(selectedCategory)) {
                        model.addRow(dataRow);  // Add row if the category matches
                    }
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_seaarchBtnActionPerformed

    private void addBagimenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBagimenuActionPerformed
 addBagPannel.setVisible(true);
        viewBagpannel.setVisible(false);
        searchBagPannel.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_addBagimenuActionPerformed

    private void searchBagMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBagMenuActionPerformed
            // TODO add your handling code here:
            addBagPannel.setVisible(false);
        viewBagpannel.setVisible(true);
        searchBagPannel.setVisible(false);
    }//GEN-LAST:event_searchBagMenuActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here
         addBagPannel.setVisible(false);
        
        viewBagpannel.setVisible(false);
        searchBagPannel.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(CasheirUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CasheirUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CasheirUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CasheirUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CasheirUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PriceBox;
    private javax.swing.JPanel addBagPannel;
    private javax.swing.JMenuItem addBagimenu;
    private javax.swing.JButton addnewBagBtn;
    private javax.swing.JTextField bagNameBox;
    private javax.swing.JTextField bagQtyBox;
    private javax.swing.JTable bagTable;
    private javax.swing.JTable bagTable2;
    private javax.swing.JComboBox<String> categoryBox1;
    private javax.swing.JComboBox<String> categoryBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton seaarchBtn;
    private javax.swing.JMenuItem searchBagMenu;
    private javax.swing.JPanel searchBagPannel;
    private javax.swing.JButton viewBagButton;
    private javax.swing.JPanel viewBagpannel;
    // End of variables declaration//GEN-END:variables
}

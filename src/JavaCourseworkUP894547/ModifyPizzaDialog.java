/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP894547;

/**
 *
 * @author jools
 */
public class ModifyPizzaDialog extends javax.swing.JDialog {

    /**
     * Creates new form ModifyPizzaDialog
     */
    private Pizza pizza;
    private Order order;
    private int status;
    private int index;
    
    public ModifyPizzaDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setStatus(0);
    }
    
    public void setPizza(Pizza newPizza) {
        this.pizza = newPizza;
        update();
    }
    public Pizza getPizza() {
        return this.pizza;
    }
    
    public void setOrder(Order newOrder) {
        this.order = newOrder;
    }
    public Order getOrder() {
        return this.order;
    }
    
    public int getIndex() {
        return this.index;
    }
    public void setIndex(int newIndex) {
        this.index = newIndex;
    }

    public int getStatus() {
        return this.status;
    }
    public void setStatus(int newStatus) {
        this.status = newStatus;
    }
    private void selectPizza(int index) {
        this.order.selectPizza(index);
        setIndex(index);
    }
    
    public void update() {
        sizeComboBox.setSelectedItem(pizza.getSize());
        crustComboBox.setSelectedItem(pizza.getCrust());
        topping1ComboBox.setSelectedItem(pizza.getTopping1());
        topping2ComboBox.setSelectedItem(pizza.getTopping2());
        sauceComboBox.setSelectedItem(pizza.getSauce());
        this.pizzaInfoTextArea.setText(pizza.returnInfo());
    }
    private void nextOrder() {
        if(order.getSelectedPizza() < order.getPizzas().size()-1) {
            selectPizza(order.getSelectedPizza()+1);
            setPizza(getOrder().getPizza());
            update();
        }
    }
    private void prevOrder() {
        if(order.getSelectedPizza() > 0) {
            selectPizza(order.getSelectedPizza()-1);
            setPizza(getOrder().getPizza());
            update();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        sauceComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        pizzaInfoTextArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sizeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        crustComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        topping1ComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        topping2ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("Sauce");

        sauceComboBox.setModel(new javax.swing.DefaultComboBoxModel(Sauce.values()));
        sauceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sauceComboBoxActionPerformed(evt);
            }
        });

        pizzaInfoTextArea.setEditable(false);
        pizzaInfoTextArea.setColumns(20);
        pizzaInfoTextArea.setRows(5);
        jScrollPane1.setViewportView(pizzaInfoTextArea);

        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nextButton.setText(">");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete Pizza");
        deleteButton.setToolTipText("");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        modifyButton.setText("OK");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Size");

        sizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(Size.values()));
        sizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Crust");

        crustComboBox.setModel(new javax.swing.DefaultComboBoxModel(Crust.values()));
        crustComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crustComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Topping 1");

        topping1ComboBox.setModel(new javax.swing.DefaultComboBoxModel(Topping.values()));
        topping1ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topping1ComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Topping 2");

        topping2ComboBox.setModel(new javax.swing.DefaultComboBoxModel(Topping.values()));
        topping2ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topping2ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton)
                        .addGap(47, 47, 47)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifyButton))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sizeComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crustComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topping2ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(topping1ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sauceComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(crustComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(topping1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(topping2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sauceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(modifyButton)
                    .addComponent(nextButton)
                    .addComponent(backButton))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        prevOrder();
    }//GEN-LAST:event_backButtonActionPerformed

    private void sizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeComboBoxActionPerformed
        this.pizza.setSize(sizeComboBox.getItemAt(sizeComboBox.getSelectedIndex()));
        update();
    }//GEN-LAST:event_sizeComboBoxActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        setStatus(1);
        dispose();
    }//GEN-LAST:event_modifyButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        setStatus(2);
        dispose();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        nextOrder();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void crustComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crustComboBoxActionPerformed
        this.pizza.setCrust(crustComboBox.getItemAt(crustComboBox.getSelectedIndex()));
        update();
    }//GEN-LAST:event_crustComboBoxActionPerformed

    private void topping1ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topping1ComboBoxActionPerformed
        this.pizza.setTopping1(topping1ComboBox.getItemAt(topping1ComboBox.getSelectedIndex()));
        update();
    }//GEN-LAST:event_topping1ComboBoxActionPerformed

    private void topping2ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topping2ComboBoxActionPerformed
        this.pizza.setTopping2(topping2ComboBox.getItemAt(topping2ComboBox.getSelectedIndex()));
        update();
    }//GEN-LAST:event_topping2ComboBoxActionPerformed

    private void sauceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sauceComboBoxActionPerformed
        this.pizza.setSauce(sauceComboBox.getItemAt(sauceComboBox.getSelectedIndex()));
        update();
    }//GEN-LAST:event_sauceComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(ModifyPizzaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyPizzaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyPizzaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyPizzaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModifyPizzaDialog dialog = new ModifyPizzaDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<Crust> crustComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextArea pizzaInfoTextArea;
    private javax.swing.JComboBox<Sauce> sauceComboBox;
    private javax.swing.JComboBox<Size> sizeComboBox;
    private javax.swing.JComboBox<Topping> topping1ComboBox;
    private javax.swing.JComboBox<Topping> topping2ComboBox;
    // End of variables declaration//GEN-END:variables
}

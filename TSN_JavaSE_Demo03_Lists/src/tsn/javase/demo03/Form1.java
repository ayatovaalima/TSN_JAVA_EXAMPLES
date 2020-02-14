package tsn.javase.demo03;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Form1 extends javax.swing.JFrame {

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jSlider1 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Компоненты выбора");
        setResizable(false);
        getContentPane().setLayout(null);

        jCheckBox3.setText("Сотовый телефон");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(200, 70, 120, 23);

        jCheckBox2.setText("Ноутбук");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(200, 50, 69, 23);

        jCheckBox1.setText("Планшет");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(200, 30, 97, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "jList"));
        jPanel2.setLayout(null);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Java", "Delphi", "C++", "C#", "Assembler" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setSelectedIndex(0);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1_valueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 131, 100);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 70, 150, 130);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("jRadioButton + ButtonGroup"));
        jPanel3.setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Pascal");
        jRadioButton1.setActionCommand("1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_actionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1);
        jRadioButton1.setBounds(10, 20, 110, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Basic");
        jRadioButton2.setActionCommand("2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_actionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2);
        jRadioButton2.setBounds(10, 40, 100, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Fortran");
        jRadioButton3.setActionCommand("3");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1_actionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton3);
        jRadioButton3.setBounds(10, 60, 100, 23);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(190, 110, 180, 90);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "jCheckBox"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(180, 10, 180, 90);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("jComboBox"), "jComboBox"));
        jPanel5.setLayout(null);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ИнЕУ", "ПГУ", "МГУ" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel5.add(jComboBox2);
        jComboBox2.setBounds(10, 20, 120, 20);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(20, 10, 140, 50);

        jTextField1.setEditable(false);
        jTextField1.setText("<Выберите значение>");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 210, 150, 20);

        jScrollBar1.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        jScrollBar1.setValue(50);
        jScrollBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollBar1.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                jScrollBar1_adjustmentValueChanged(evt);
            }
        });
        getContentPane().add(jScrollBar1);
        jScrollBar1.setBounds(40, 330, 300, 20);

        jLabel2.setText("jScroolBar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 330, 60, 14);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createEtchedBorder()));
        jPanel1.setLayout(null);

        jProgressBar1.setValue(50);
        jProgressBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(10, 110, 310, 21);

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1stateChanged(evt);
            }
        });
        jPanel1.add(jSlider1);
        jSlider1.setBounds(10, 10, 320, 60);

        jLabel3.setText("jProgressBar");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(330, 110, 80, 14);

        jLabel1.setText("jSlider");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 30, 29, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 250, 420, 150);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Привет\nВсем\nЭто\nпрограмма\nна Java");
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(390, 10, 160, 120);

        jButton1.setText("Выбранная строка");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 140, 130, 23);

        jButton2.setText("Свои строки");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(410, 170, 130, 23);

        jButton3.setText("Проход по строкам");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(410, 200, 130, 23);

        jButton4.setText("Выход");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(490, 350, 65, 23);

        setSize(new java.awt.Dimension(593, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // Обработка выбора из списка jComboBox
        jTextField1.setText(jComboBox2.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jList1_valueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1_valueChanged
        // Работа с jList
        jTextField1.setText(jList1.getSelectedValue().toString());
    }//GEN-LAST:event_jList1_valueChanged

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // Работа с jCheckBox
        if (jCheckBox1.isSelected()) {
            jTextField1.setText(jCheckBox1.getText());
        }
        if (jCheckBox2.isSelected()) {
            jTextField1.setText(jCheckBox2.getText());
        }
        if (jCheckBox3.isSelected()) {
            jTextField1.setText(jCheckBox3.getText());
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jRadioButton1_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1_actionPerformed
        // Выбор значения из группы jRadioButton
        JRadioButton button = (JRadioButton) evt.getSource();
        jTextField1.setText(button.getActionCommand());
        jTextField1.setText(button.getText());
    }//GEN-LAST:event_jRadioButton1_actionPerformed

    private void jSlider1stateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1stateChanged
        // Изменение значения слайдера
        jProgressBar1.setValue(jSlider1.getValue());
    }//GEN-LAST:event_jSlider1stateChanged

    private void jScrollBar1_adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_jScrollBar1_adjustmentValueChanged
        // Изменение значения jProgressBar
        jProgressBar1.setValue(jScrollBar1.getValue());
    }//GEN-LAST:event_jScrollBar1_adjustmentValueChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Выбор строки из jTextArea
        try {
            //int line = jTextArea1.getLineCount() - 1; // Количество строк
            int line = jTextArea1.getLineOfOffset(jTextArea1.getCaret().getDot()); // Номер выбранной строки
            int start = jTextArea1.getLineStartOffset(line);
            int end = jTextArea1.getLineEndOffset(line);
            String s = jTextArea1.getText(start, end - start); // Узнаем текст выбранной строки
            jTextField1.setText(s);
            //jTextArea1.replaceRange("", start, end);
        } catch (Exception f) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Свои строки в jTextArea
        jTextArea1.setText(""); // Удалить все значения
        jTextArea1.append("Строка 1\n"); // Добавить значение и перейти на новую строку
        jTextArea1.append("Строка 2\n"); // Добавить значение и перейти на новую строку
        jTextArea1.append("Строка 3"); // Добавить значение
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Проход по строкам в jTextArea
        try {
            int line_count = jTextArea1.getLineCount() - 1; // Количество строк
            for (int i = 0; i <= line_count; i++) { // Цикл по всем строкам
                int start = jTextArea1.getLineStartOffset(i); // Определим начало строки
                int end = jTextArea1.getLineEndOffset(i); // Определим конец строки
                String s = jTextArea1.getText(start, end - start); // Узнаем текст строки
                jTextArea1.replaceRange(Integer.toString(i + 1) + ") " + s, start, end); // Изменим строку
            }
        } catch (Exception f) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Выход
        JOptionPane.showMessageDialog(null, "До свидания!", "Инфо", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

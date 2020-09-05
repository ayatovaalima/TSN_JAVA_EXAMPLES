package tsn.javase.demo05;

public class Form1 extends javax.swing.JFrame {
    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        panel2 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jFrame3 = new javax.swing.JFrame();
        panel3 = new java.awt.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jFrame2.setTitle("Form 2");
        jFrame2.setMinimumSize(new java.awt.Dimension(290, 160));
        jFrame2.setResizable(false);
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame2WindowClosing(evt);
            }
        });
        jFrame2.getContentPane().setLayout(null);
        jFrame2.setLocationRelativeTo(null);

        panel2.setBackground(new java.awt.Color(255, 255, 153));
        panel2.setLayout(null);

        jLabel2.setText("Выберите транспорт:");
        panel2.add(jLabel2);
        jLabel2.setBounds(80, 10, 170, 19);

        jButton2.setText("Назад");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        panel2.add(jButton2);
        jButton2.setBounds(20, 80, 120, 25);

        jButton3.setText("Вперед");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel2.add(jButton3);
        jButton3.setBounds(160, 80, 110, 25);

        jComboBox1.setBackground(new java.awt.Color(204, 255, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Автомобиль", "Поезд", "Самолет" }));
        jComboBox1.setBorder(new javax.swing.border.MatteBorder(null));
        panel2.add(jComboBox1);
        jComboBox1.setBounds(60, 40, 170, 25);

        jFrame2.getContentPane().add(panel2);
        panel2.setBounds(0, 0, 290, 160);

        jFrame3.setTitle("Form 3");
        jFrame3.setMinimumSize(new java.awt.Dimension(255, 210));
        jFrame3.setResizable(false);
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame3WindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosing(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);
        jFrame3.setLocationRelativeTo(null);

        panel3.setBackground(new java.awt.Color(255, 255, 153));
        panel3.setLayout(null);

        jScrollPane2.setForeground(new java.awt.Color(204, 255, 204));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 255, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane2.setViewportView(jTextArea1);

        panel3.add(jScrollPane2);
        jScrollPane2.setBounds(20, 10, 206, 120);

        jButton4.setText("Назад");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        panel3.add(jButton4);
        jButton4.setBounds(20, 140, 110, 25);

        jButton5.setText("Выход");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panel3.add(jButton5);
        jButton5.setBounds(140, 140, 90, 25);

        jFrame3.getContentPane().add(panel3);
        panel3.setBounds(0, 0, 260, 210);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form 1");
        setResizable(false);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(255, 255, 153));
        panel1.setLayout(null);

        jList1.setBackground(new java.awt.Color(153, 255, 153));
        jList1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Павлодар", "Астана", "Москва", "Нью-Йорк", "Токио", "Пекин" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectedIndex(0);
        jScrollPane1.setViewportView(jList1);

        panel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 30, 170, 120);

        jButton1.setText("Вперед");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1);
        jButton1.setBounds(20, 160, 170, 25);

        jLabel1.setText("Выберите город:");
        panel1.add(jLabel1);
        jLabel1.setBounds(40, 10, 150, 19);

        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 210, 200);

        setSize(new java.awt.Dimension(222, 234));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Переход на 2 окно
        this.setVisible(false); // Спрятать главное окно 1
        jFrame2.setVisible(true); // Показать окно 2
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Переход на главное окно 1
        jFrame2.setVisible(false); // Спрятать окно 2
        this.setVisible(true); // Показать главное окно 1
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Переход на 3 окно
        jFrame2.setVisible(false); // Спрятать окно 2
        jFrame3.setVisible(true); // Показать окно 3
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Переход на 2 окно
        jFrame3.setVisible(false); // Спрятать окно 3
        jFrame2.setVisible(true); // Показать окно 2
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // Кнопка выхода
        System.exit(0); // Выход из программы
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jFrame2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowClosing
        // Выход из программы
        System.exit(0); // Выход из программы
    }//GEN-LAST:event_jFrame2WindowClosing

    private void jFrame3WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosing
        // Выход из программы
        System.exit(0); // Выход из программы
    }//GEN-LAST:event_jFrame3WindowClosing

    private void jFrame3WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowActivated
        // Выдача результатов при открытии окна 3
        jTextArea1.setText(""); // Очистка компонента
        jTextArea1.append("Ваш выбор:" + "\n");
        jTextArea1.append("___________________" + "\n");
        jTextArea1.append("Город: " + jList1.getSelectedValue().toString() + "\n");
        jTextArea1.append("Транспорт: " + jComboBox1.getSelectedItem().toString() + "\n");
    }//GEN-LAST:event_jFrame3WindowActivated

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    // End of variables declaration//GEN-END:variables
}

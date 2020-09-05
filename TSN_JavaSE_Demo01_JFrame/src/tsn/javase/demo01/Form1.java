package tsn.javase.demo01;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Form1 extends javax.swing.JFrame {

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Простейшая программа на Java");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Расчет");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(239, 58, 150, 50);

        jLabel1.setText("a=");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 40, 19);

        jLabel2.setText("b=");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(190, 20, 30, 19);

        jLabel3.setText("c = a / b :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(14, 62, 70, 19);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(94, 20, 80, 25);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(225, 20, 100, 25);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(89, 59, 130, 25);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tsn/javase/demo01/logo.jpg"))); // NOI18N
        jLabel4.setText("Талипов С.Н. (с), ИнЕУ-ToU, 2013-2022 г. ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 110, 400, 90);

        setSize(new java.awt.Dimension(430, 251));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Вычисление выражения
        String a, b, c; // Строковые переменные
        double x, y, z; // Вещественные переменные
        a = jTextField1.getText(); // Получение значения из окна 1
        b = jTextField2.getText(); // Получение значения из окна 2
        try { // Начало защищенного блока
            x = Double.parseDouble(a); // Преобразование текстового значения в вещественное
            y = Double.parseDouble(b); // Преобразование текстового значения в вещественное
            z = x / y; // Вычисление выражения
            // Проверка на: 0/0, z/0
            if ((Double.isNaN(z) == true) || Double.isInfinite(z) == true) {
                throw new Exception("error"); // Если нет решение то генерирование ошибки
            }
            DecimalFormat df = new DecimalFormat("#0.00"); // Описание формата вещественного числа
            c = String.valueOf(df.format(z)); // Преобразование числа в строку
            jTextField3.setText(c); // Вывод ответа в окошко
        } catch (Exception ee) { // Обработчики ошибок защищенного блока
            jTextField3.setText("Неверные данные!"); // Обработка ошибки ввода или вычисления
            JOptionPane.showMessageDialog(rootPane, "Ошибка расчета данных!", "Ошибка",
                    JOptionPane.ERROR_MESSAGE);
        } // Конец защищенного блока
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

package tsn.javase.demo07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Редактор TXT-файла");
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Очистка");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 360, 110, 25);

        jButton3.setText("Сохранение в файл");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(400, 360, 190, 25);

        jEditorPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 600, 340);

        jButton4.setText("Загрузить из файла");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(20, 360, 180, 25);

        setSize(new java.awt.Dimension(631, 433));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Сохранение текста из JEditorPane в TXT-файл с помощью диалога выбора файла
        try { 
            JFileChooser fileopen = new JFileChooser(); // Создаем объект выбора файла
            int ret = fileopen.showDialog(null, "Сохранить файл"); // Вызываем диалог
            if (ret != JFileChooser.APPROVE_OPTION) { return; } // Если файл не выбран, то выход
            File FileName = fileopen.getSelectedFile(); // Получение имени файла
            
            // Считываем содержимое документа
            PlainDocument doc = (PlainDocument) jEditorPane1.getDocument();
            OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(FileName));
            String txt = doc.getText(0, doc.getLength()); // Считываем текст из jEditorPane1

            out.write(txt); // Сохраняем текст в файл

            out.close(); // Закрываем файл
        } catch (IOException | BadLocationException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Очистка данных в JEditorPane
        jEditorPane1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // Загрузка TXT-файла в JEditorPane с помощью диалога выбора файла
        try { 
            JFileChooser fileopen = new JFileChooser(); // Создаем объект выбора файла
            int ret = fileopen.showDialog(null, "Открыть файл"); // Вызываем диалог
            if (ret != JFileChooser.APPROVE_OPTION) { return; } // Если файл не выбран, то выход
            File FileName = fileopen.getSelectedFile(); // Получение имени файла

            // Открываем потоки чтения из файла
            FileInputStream stream = new FileInputStream(FileName);
            InputStreamReader reader = new InputStreamReader(stream);
            BufferedReader buffered_reader = new BufferedReader(reader);
            String txt = ""; String buf; // Инициализация переменных

            // Загрузка текста из файла
            while ((buf = buffered_reader.readLine()) != null) {
                txt += buf + "\r\n";
            }
            
            jEditorPane1.setText(txt); // Установить считанный из файла текст в jEditorPane1
            buffered_reader.close(); reader.close(); stream.close(); // Закрытие потоков чтения
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;


                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);


            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

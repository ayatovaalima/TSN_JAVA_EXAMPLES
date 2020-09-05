package tsn.javase.lab05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Form1 extends javax.swing.JFrame {

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Fam = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Gel = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_Pazdr = new javax.swing.JButton();
        jButton_Fam_Clear = new javax.swing.JButton();
        jButton_Gel_Clear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane_Pozdr = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа со строками в Java");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTextArea_Fam.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea_Fam.setColumns(20);
        jTextArea_Fam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea_Fam.setLineWrap(true);
        jTextArea_Fam.setRows(5);
        jTextArea_Fam.setText("Иванов\nПетров\nСидоров\nИваненко\nПетренко\nСидоренко\nИванченко\nПетренченко\nСидоренченко");
        jTextArea_Fam.setWrapStyleWord(true);
        jTextArea_Fam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea_Fam);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 316, 180);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea_Gel.setBackground(new java.awt.Color(255, 204, 204));
        jTextArea_Gel.setColumns(20);
        jTextArea_Gel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextArea_Gel.setLineWrap(true);
        jTextArea_Gel.setRows(5);
        jTextArea_Gel.setText("Счастья\nЗдоровья\nУспехов\nЛюбви\nУдачи\nВсех благ\nЗдоровья близким\nУдачи в бизнесе\nУдачи в учебе\nУдачи в личной жизне");
        jTextArea_Gel.setWrapStyleWord(true);
        jTextArea_Gel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(jTextArea_Gel);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(340, 30, 390, 180);

        jLabel1.setText("Список именинников:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 240, 16);

        jLabel2.setText("Перечень благ:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 10, 200, 16);

        jButton_Pazdr.setText("Поздравить");
        jButton_Pazdr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PazdrActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Pazdr);
        jButton_Pazdr.setBounds(560, 540, 170, 25);

        jButton_Fam_Clear.setText("Очистка");
        jButton_Fam_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Fam_ClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Fam_Clear);
        jButton_Fam_Clear.setBounds(191, 220, 140, 25);

        jButton_Gel_Clear.setText("Очистка");
        jButton_Gel_Clear.setToolTipText("");
        jButton_Gel_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Gel_ClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Gel_Clear);
        jButton_Gel_Clear.setBounds(591, 220, 130, 25);

        jEditorPane_Pozdr.setEditable(false);
        jEditorPane_Pozdr.setBackground(new java.awt.Color(255, 255, 153));
        jEditorPane_Pozdr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jEditorPane_Pozdr.setContentType("text/html"); // NOI18N
        jEditorPane_Pozdr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(jEditorPane_Pozdr);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(10, 260, 720, 270);

        setSize(new java.awt.Dimension(762, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_PazdrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PazdrActionPerformed
        // Нажатие кнопки поздравить
        ArrayList<String> pozdr = new ArrayList<>(); // Массив пожеланий
        ArrayList<String> fam = new ArrayList<>();   // Массив фамилий
        
        jEditorPane_Pozdr.setText(null); // Очищаем область поздравлений
        
        // Заполнение массива пожеланий
        try { // Проверка введенных пользователем пожеланий
            for (int i = 0; i < jTextArea_Gel.getLineCount(); i++) {
                int start = jTextArea_Gel.getLineStartOffset(i);
                int end = jTextArea_Gel.getLineEndOffset(i);
                // Проверяем является ли строка пустой ("==" - не работает)
                String line = jTextArea_Gel.getText(start, end - start).trim();
                if (line.equals("")) { continue; }
                // Добавление поздравления в массив
                pozdr.add(line); 
            }
        } catch (Exception ex) { JOptionPane.showMessageDialog(rootPane, "Ошибка чтения пожеланий", 
                "Ошибка данных", JOptionPane.ERROR_MESSAGE);
            return; // Выход
        }
        
        // Заполнение массива персон
        try { // Проверка введенных пользователем фамилий
            for (int i = 0; i < jTextArea_Fam.getLineCount(); i++) {
                int start = jTextArea_Fam.getLineStartOffset(i);
                int end = jTextArea_Fam.getLineEndOffset(i);
                // Проверяем является ли строка пустой (== - не работает)
                String line = jTextArea_Fam.getText(start, end - start).trim();
                if (line.equals("")) { continue; }
                fam.add(line); // добавление фамилии в массив
            }
        } catch (Exception ex) { JOptionPane.showMessageDialog(rootPane, "Ошибка чтения фамилий", 
                "Ошибка данных", JOptionPane.ERROR_MESSAGE);
            return; // Выход
        }

        // Проверка количества поздравлений
        if (fam.size() > pozdr.size()) { // Если фамилий больше чем поздравлений
            JOptionPane.showMessageDialog(rootPane, 
                    "Пожеланий на всех не хватит! Уменьшите количество фамилий.", 
                    "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder s = new StringBuilder("<p align=\"center\"><cite><b><font size=\"5\">");
        try { // ПОЗДРАВЛЯЕМ !!!
            for (int i = 0; i < fam.size(); i++) {
                // Генерируем случайное число в диапазоне от 0 до длины массива поздравлений
                int p = (int) Math.floor(Math.random() * pozdr.size()); 
                // Генерация поздравления            
                s.append("Уважаемый <font color=\"990505\">" + fam.get(i)+"</font>"
                        + "! Желаем Вам " + 
                        pozdr.get(p).toString().toLowerCase() + "!<br>");  //добавляем символ перехода на новую строку
                pozdr.remove(p); // Удаляем элемент с индексом р из массива поздравлений
            }
            
        } catch (Exception ex) { JOptionPane.showMessageDialog(rootPane, "Ошибка генерации поздравления", 
                "Ошибка чтения", JOptionPane.ERROR_MESSAGE);
        }
        s.append("<br>");
        jEditorPane_Pozdr.setText(s.toString());
    }//GEN-LAST:event_jButton_PazdrActionPerformed

    private void jButton_Fam_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Fam_ClearActionPerformed
        // Очистка списка фамилий
        jTextArea_Fam.setText(null);
    }//GEN-LAST:event_jButton_Fam_ClearActionPerformed

    private void jButton_Gel_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Gel_ClearActionPerformed
        // Очистка списка поздравлений
        jTextArea_Gel.setText(null);
    }//GEN-LAST:event_jButton_Gel_ClearActionPerformed

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
    private javax.swing.JButton jButton_Fam_Clear;
    private javax.swing.JButton jButton_Gel_Clear;
    private javax.swing.JButton jButton_Pazdr;
    private javax.swing.JEditorPane jEditorPane_Pozdr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea_Fam;
    private javax.swing.JTextArea jTextArea_Gel;
    // End of variables declaration//GEN-END:variables
}

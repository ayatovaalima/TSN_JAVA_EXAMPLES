package tsn.javase.lab08;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

//Процедура - двигатель, производит установку иконки и включение таймера, в соответствии с параметрами
public class Form1 extends javax.swing.JFrame {

    public void dvigatel(int tim) {
        Point p = jLabel_Bus.getLocation();
        switch (tim) {
            case 1: {
                p.x = 560;
                p.y = 430;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("bus0.png"))));
                jTimer1.start();
            }
            break;
            case 2: {
                p.x = 0;
                p.y = 420;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("bus3.png"))));
                jTimer2.start();
            }
            break;
            case 3: {
                p.x = 0;
                p.y = 250;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("bus3.png"))));
                jTimer3.start();
            }
            break;
            case 4: {
                p.x = 180;
                p.y = 130;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("bus3.png"))));
                jTimer4.start();
            }
            break;
            case 5: {
                p.x = 180;
                p.y = -10;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("bus1.png"))));
                jTimer5.start();
            }
            break;
            case 6: {
                p.x = 460;
                p.y = 120;
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("bus2.png"))));
                jTimer6.start();
            }
            break;
        }
        jLabel_Bus.setLocation(p);
    }
    javax.swing.Timer jTimer1 = new javax.swing.Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 1) {
                jTimer1.stop();//если это последняя остановка тогда выйти
            }
            Point p = jLabel_Bus.getLocation();
            p.x -= 10;
            jLabel_Bus.setLocation(p);
            if (p.x <= 5) {
                jTimer1.stop();
                dvigatel(2);
            }

        }
    });
    javax.swing.Timer jTimer2 = new javax.swing.Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 2) {
                jTimer2.stop();//если это последняя остановка тогда выйти
            }
            Point p = jLabel_Bus.getLocation();
            p.y -= 10;
            jLabel_Bus.setLocation(p);
            if (p.y <= 260) {
                jTimer2.stop();
                dvigatel(3);
            }

        }
    });
    javax.swing.Timer jTimer3 = new javax.swing.Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 3) {
                jTimer3.stop();//если это последняя остановка тогда выйти
            }
            Point p = jLabel_Bus.getLocation();

            if (p.x == 0 && p.y == 140) //когда автобус достигает точки 0,140 меняем картинку автобуса
            {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource(("bus1.png"))));
            }

            if (p.y <= 140) //если Y менее 140 тогда начинаем увеличивать Х
            {
                p.x += 10;
            } else {
                p.y -= 10;       // иначе продолжаем уменьшать Y до 140
            }
            jLabel_Bus.setLocation(p);

            if (p.x >= 180) //Если Х стал более 180 тогда завершаем работу этого таймера3 и включаем таймер4
            {
                jTimer3.stop();
                dvigatel(4);
            }

        }
    });
    javax.swing.Timer jTimer4 = new javax.swing.Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 4) {
                jTimer4.stop();//если это последняя остановка тогда выйти
            }
            Point p = jLabel_Bus.getLocation();
            p.y -= 10;
            jLabel_Bus.setLocation(p);

            if (p.y <= 0) {
                jTimer4.stop();
                dvigatel(5);
            }

        }
    });
    javax.swing.Timer jTimer5 = new javax.swing.Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 5) {
                jTimer5.stop();//если это последняя остановка тогда выйти
            }
            Point p = jLabel_Bus.getLocation();

            if (p.x == 460 && p.y == 0) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("bus2.png")));
            }

            if (p.x < 460) //если Х менее 400 тогда наращиваем  его
            {
                p.x += 10;
            } else {
                p.y += 10; //иначе наращиваем Y
            }
            jLabel_Bus.setLocation(p);

            if (p.y == 130) {
                jTimer5.stop();
                dvigatel(6);
            }
        }
    });
    javax.swing.Timer jTimer6 = new javax.swing.Timer(100, new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
            if (jSlider_Stop.getValue() == 6) {
                jTimer6.stop();//если это последняя остановка тогда выйти
            }
            Point p = jLabel_Bus.getLocation();

            if (p.x == 460 && p.y == 240) {
                jLabel_Bus.setIcon(new ImageIcon(Form1.class.getResource("bus0.png")));
            }

            if (p.y < 240) {
                p.y += 10;
            } else {
                p.x -= 10;
            }
            jLabel_Bus.setLocation(p);

            if (p.x < 300) {
                jTimer6.stop();
            }
        }
    });

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Bus = new javax.swing.JLabel();
        jLabel_Track = new javax.swing.JLabel();
        jButton_Start = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSlider_Start = new javax.swing.JSlider();
        jSlider_Stop = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с таймерами Swing в Java");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel_Bus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tsn/javase/lab08/bus2.png"))); // NOI18N
        getContentPane().add(jLabel_Bus);
        jLabel_Bus.setBounds(610, 320, 120, 80);

        jLabel_Track.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tsn/javase/lab08/track.png"))); // NOI18N
        getContentPane().add(jLabel_Track);
        jLabel_Track.setBounds(0, 0, 690, 519);

        jButton_Start.setText("Старт");
        jButton_Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StartActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Start);
        jButton_Start.setBounds(10, 540, 90, 40);

        jLabel2.setText("Точка начала движения");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 530, 170, 14);

        jLabel3.setText("Конечная точка движения");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 570, 190, 14);

        jSlider_Start.setMajorTickSpacing(1);
        jSlider_Start.setMaximum(6);
        jSlider_Start.setMinimum(1);
        jSlider_Start.setPaintLabels(true);
        jSlider_Start.setValue(1);
        jSlider_Start.setOpaque(false);
        getContentPane().add(jSlider_Start);
        jSlider_Start.setBounds(320, 525, 200, 39);

        jSlider_Stop.setMajorTickSpacing(1);
        jSlider_Stop.setMaximum(7);
        jSlider_Stop.setMinimum(2);
        jSlider_Stop.setPaintLabels(true);
        jSlider_Stop.setToolTipText("");
        jSlider_Stop.setValue(2);
        jSlider_Stop.setOpaque(false);
        getContentPane().add(jSlider_Stop);
        jSlider_Stop.setBounds(320, 565, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tsn/javase/lab08/bar.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 520, 740, 90);

        setSize(new java.awt.Dimension(698, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StartActionPerformed
        if (jSlider_Start.getValue() > jSlider_Stop.getValue()) {
            JOptionPane.showMessageDialog(rootPane, "Точка старта дальше точки остановки!", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
        } else {
            dvigatel(jSlider_Start.getValue());
        }

    }//GEN-LAST:event_jButton_StartActionPerformed

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
    private javax.swing.JButton jButton_Start;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Bus;
    private javax.swing.JLabel jLabel_Track;
    private javax.swing.JSlider jSlider_Start;
    private javax.swing.JSlider jSlider_Stop;
    // End of variables declaration//GEN-END:variables
}

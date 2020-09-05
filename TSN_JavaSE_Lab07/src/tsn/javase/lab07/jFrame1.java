package tsn.javase.lab07;

import javax.swing.ImageIcon;

public class jFrame1 extends javax.swing.JFrame {

    public jFrame1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(15, 32767));
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jFrame4 = new javax.swing.JFrame();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jToolBar3 = new javax.swing.JToolBar();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 0), new java.awt.Dimension(15, 32767));
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFrame5 = new javax.swing.JFrame();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jFrame2.setTitle("Детство");
        jFrame2.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame2.setMinimumSize(new java.awt.Dimension(357, 326));
        jFrame2.setResizable(false);
        jFrame2.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame2WindowClosing(evt);
            }
        });
        jFrame2.getContentPane().setLayout(null);

        jButton3.setText("Назад");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton3);
        jButton3.setBounds(30, 260, 135, 25);

        jButton4.setText("Вперед");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jButton4);
        jButton4.setBounds(190, 260, 135, 25);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Манная");
        jRadioButton1.setActionCommand("0");
        jRadioButton1.setBorder(null);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(14, 74, 120, 19);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Рисовая");
        jRadioButton2.setActionCommand("1");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(10, 100, 140, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Гороховая");
        jRadioButton3.setActionCommand("2");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(10, 130, 140, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Гречневая");
        jRadioButton4.setActionCommand("3");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(10, 160, 150, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Выберите любимую кашу:");
        jFrame2.getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 20, 320, 17);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.add(filler1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Выбрано: Манная каша");
        jToolBar1.add(jLabel6);

        jFrame2.getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 220, 400, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tsn/javase/lab07/morda0.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jFrame2.getContentPane().add(jLabel9);
        jLabel9.setBounds(210, 64, 130, 110);

        jFrame2.setLocationRelativeTo(null);

        jFrame4.setTitle("Юность");
        jFrame4.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame4.setMinimumSize(new java.awt.Dimension(357, 326));
        jFrame4.setResizable(false);
        jFrame4.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame4WindowClosing(evt);
            }
        });
        jFrame4.getContentPane().setLayout(null);

        jButton5.setText("Назад");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton5);
        jButton5.setBounds(30, 260, 135, 25);

        jButton6.setText("Вперед");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jFrame4.getContentPane().add(jButton6);
        jButton6.setBounds(210, 260, 135, 25);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Неполное среднее"},
                {"Среднее"},
                {"Среднее-специальное"},
                {"Высшее"}
            },
            new String [] {
                "Заголовок 2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setTableHeader(null);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jFrame4.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 190, 140);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Какое у вас образование:");
        jLabel4.setToolTipText("");
        jFrame4.getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 20, 310, 17);

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);
        jToolBar3.add(filler3);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Выбрано: Без образования");
        jToolBar3.add(jLabel8);

        jFrame4.getContentPane().add(jToolBar3);
        jToolBar3.setBounds(0, 230, 400, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tsn/javase/lab07/obr0.png"))); // NOI18N
        jFrame4.getContentPane().add(jLabel11);
        jLabel11.setBounds(210, 80, 140, 140);

        jFrame4.setLocationRelativeTo(null);

        jFrame3.setTitle("Отрочество");
        jFrame3.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame3.setMinimumSize(new java.awt.Dimension(357, 326));
        jFrame3.setResizable(false);
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame3WindowClosing(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);

        jButton7.setText("Назад");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton7);
        jButton7.setBounds(30, 260, 135, 25);

        jButton8.setText("Вперед");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jButton8);
        jButton8.setBounds(200, 260, 135, 25);

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Отлично");
        jCheckBox1.setActionCommand("4");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(10, 70, 130, 23);

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setText("Хорошо");
        jCheckBox2.setActionCommand("5");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(10, 100, 130, 23);

        buttonGroup2.add(jCheckBox3);
        jCheckBox3.setText("Удовлетворительно");
        jCheckBox3.setActionCommand("6");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(10, 130, 180, 23);

        buttonGroup2.add(jCheckBox4);
        jCheckBox4.setText("Неудовлетворительно");
        jCheckBox4.setActionCommand("7");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jFrame3.getContentPane().add(jCheckBox4);
        jCheckBox4.setBounds(10, 160, 190, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Как вы учились в 5 классе:");
        jFrame3.getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 20, 290, 17);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.add(filler2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Выбрано: Отлично");
        jToolBar2.add(jLabel7);

        jFrame3.getContentPane().add(jToolBar2);
        jToolBar2.setBounds(0, 220, 400, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tsn/javase/lab07/ruka3.png"))); // NOI18N
        jFrame3.getContentPane().add(jLabel10);
        jLabel10.setBounds(200, 50, 180, 150);

        jFrame3.setLocationRelativeTo(null);

        jFrame5.setTitle("Результаты");
        jFrame5.setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        jFrame5.setMinimumSize(new java.awt.Dimension(450, 326));
        jFrame5.setResizable(false);
        jFrame5.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jFrame5WindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                jFrame5WindowClosing(evt);
            }
        });
        jFrame5.getContentPane().setLayout(null);

        jButton9.setText("Назад");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton9);
        jButton9.setBounds(30, 260, 135, 25);

        jButton10.setText("ВЫХОД");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jFrame5.getContentPane().add(jButton10);
        jButton10.setBounds(260, 260, 135, 25);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Вопросы", "Ваши ответы"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        jFrame5.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 100, 410, 150);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("<html>\n<p align=\"center\">\nСпасибо что воспользовались\nнашей системой!\n</p>");
        jLabel5.setToolTipText("");
        jFrame5.getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 10, 250, 70);

        jFrame5.setLocationRelativeTo(null);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Приветствие");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>\n<p align=\"center\">\n <h1>    Вас приветствует система быстрого анкетирования!</h1>  <br> <br> <br> <h3><cite><p align=\"center\">Тема - Периоды жизни</cite></h3>\n</p> ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 330, 190);

        jButton1.setText("Начать");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 260, 135, 25);

        jButton2.setText("ВЫХОД");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 260, 135, 25);

        setSize(new java.awt.Dimension(357, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        jFrame2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(true);
        jFrame2.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
    }//GEN-LAST:event_formPropertyChange

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jFrame3.setVisible(true);
        jFrame4.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jFrame2.setVisible(true);
        jFrame3.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jFrame4.setVisible(true);
        jFrame5.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jFrame2.setVisible(false);
        jFrame3.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jFrame4.setVisible(false);
        jFrame5.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jFrame3.setVisible(false);
        jFrame4.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jFrame2WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame2WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame2WindowClosing

    private void jFrame4WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame4WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame4WindowClosing

    private void jFrame3WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame3WindowClosing

    private void jFrame5WindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowClosing
        System.exit(0);
    }//GEN-LAST:event_jFrame5WindowClosing

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jLabel6.setText("Выбрано: Манная каша");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("morda0.png")));
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jLabel6.setText("Выбрано: Рисовая каша");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("morda1.png")));
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        jLabel6.setText("Выбрано: Гороховая каша");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("morda2.png")));
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jLabel6.setText("Выбрано: Гречневая каша");
        jLabel9.setIcon(new ImageIcon(jFrame1.class.getResource("morda3.png")));
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jLabel7.setText("Выбрано: Отлично");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("ruka3.png")));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        jLabel7.setText("Выбрано: Хорошо");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("ruka2.png")));
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        jLabel7.setText("Выбрано: Удовлетворительно");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("ruka1.png")));
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        jLabel7.setText("Выбрано: Неудовлетворительно");
        jLabel10.setIcon(new ImageIcon(jFrame1.class.getResource("ruka0.png")));
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jFrame5WindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame5WindowActivated
        jTable2.setValueAt("Ваша любимая каша:", 0, 0);
        switch (buttonGroup1.getSelection().getActionCommand()) {
            case "0":
                jTable2.setValueAt("Манная", 0, 1);
                break;
            case "1":
                jTable2.setValueAt("Рисовая", 0, 1);
                break;
            case "2":
                jTable2.setValueAt("Гороховая", 0, 1);
                break;
            case "3":
                jTable2.setValueAt("Гречневая", 0, 1);
                break;
        }

        jTable2.setValueAt("Вы учились в пятом классе:", 1, 0);
        switch (buttonGroup2.getSelection().getActionCommand()) {
            case "4":
                jTable2.setValueAt("Отлично", 1, 1);
                break;
            case "5":
                jTable2.setValueAt("Хорошо", 1, 1);
                break;
            case "6":
                jTable2.setValueAt("Удовлетворительно", 1, 1);
                break;
            case "7":
                jTable2.setValueAt("Неудовлетворительно", 1, 1);
                break;
        }

        jTable2.setValueAt("Ваше образование:", 2, 0);
        switch (jTable1.getSelectedRow()) {
            case 0:
                jTable2.setValueAt("Неполное среднее", 2, 1);
                break;
            case 1:
                jTable2.setValueAt("Среднее", 2, 1);
                break;
            case 2:
                jTable2.setValueAt("Среднее-специальное", 2, 1);
                break;
            case 3:
                jTable2.setValueAt("Высшее", 2, 1);
                break;
            default:
                jTable2.setValueAt("Без образования", 2, 1);
        }
    }//GEN-LAST:event_jFrame5WindowActivated

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        switch (jTable1.getSelectedRow()) {
            case 0: {
                jLabel8.setText("Выбрано: Неполное среднее");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr1.png")));
            }
            break;
            case 1: {
                jLabel8.setText("Выбрано: Среднее");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr2.png")));
            }
            break;
            case 2: {
                jLabel8.setText("Выбрано: Среднее-специальное");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr3.png")));
            }
            break;
            case 3: {
                jLabel8.setText("Выбрано: Высшее");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr4.png")));
            }
            break;
            default: {
                jLabel8.setText("Выбрано: Без образования");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr0.png")));
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        switch (jTable1.getSelectedRow()) {
            case 0: {
                jLabel8.setText("Выбрано: Неполное среднее");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr1.png")));
            }
            break;
            case 1: {
                jLabel8.setText("Выбрано: Среднее");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr2.png")));
            }
            break;
            case 2: {
                jLabel8.setText("Выбрано: Среднее-специальное");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr3.png")));
            }
            break;
            case 3: {
                jLabel8.setText("Выбрано: Высшее");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr4.png")));
            }
            break;
            default: {
                jLabel8.setText("Выбрано: Без образования");
                jLabel11.setIcon(new ImageIcon(jFrame1.class.getResource("obr0.png")));
            }
        }
    }//GEN-LAST:event_jTable1KeyReleased

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
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrame1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JFrame jFrame5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    // End of variables declaration//GEN-END:variables
}

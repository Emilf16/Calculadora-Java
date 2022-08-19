package CalculadoraSwing;
import java.awt.Color;
import javax.swing.JFrame;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Design extends javax.swing.JFrame {
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");
    
    Float numero1;
    Float numero2;
    String signo;
    Boolean equal = false;
    
    public Design() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.darkGray);
        txtOperacion.setText("");
        txtDigito.setText("0");
        cbxTwo.setEnabled(false);
        cbxThree.setEnabled(false);
        btnShow.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDigito = new javax.swing.JLabel();
        txtOperacion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnShow = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btnSplit = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxOne = new javax.swing.JCheckBox();
        cbxThree = new javax.swing.JCheckBox();
        cbxTwo = new javax.swing.JCheckBox();
        lblTriangle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(19, 38, 67));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDigito.setFont(new java.awt.Font("Poppins", 1, 48)); // NOI18N
        txtDigito.setForeground(new java.awt.Color(255, 255, 255));
        txtDigito.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtDigito.setText("120");
        jPanel1.add(txtDigito, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 381, 79));

        txtOperacion.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(255, 255, 255));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtOperacion.setText("5 + 3 x 20");
        jPanel1.add(txtOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 378, 54));

        jPanel2.setBackground(new java.awt.Color(34, 53, 84));

        jPanel3.setBackground(new java.awt.Color(34, 53, 84));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnShow.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnShow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btnShow.setText("MOSTRAR");
        btnShow.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnShow.setBorderPainted(false);
        btnShow.setContentAreaFilled(false);
        btnShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShow.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnShow.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn3.png"))); // NOI18N
        btnShow.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn4.png"))); // NOI18N
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        jPanel3.add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 190, 60));

        btnC.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnC.setText("C");
        btnC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCMouseClicked(evt);
            }
        });
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn7.setText("7");
        btn7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn7MouseClicked(evt);
            }
        });
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn6.setText("6");
        btn6.setToolTipText("");
        btn6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
            }
        });
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn3.setText("3");
        btn3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
            }
        });
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn8.setText("8");
        btn8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8MouseClicked(evt);
            }
        });
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn5.setText("5");
        btn5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
            }
        });
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn2.setText("2");
        btn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
            }
        });
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn9.setText("9");
        btn9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn9.setBorderPainted(false);
        btn9.setContentAreaFilled(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn9MouseClicked(evt);
            }
        });
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn4.setText("4");
        btn4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
            }
        });
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn1.setText("1");
        btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btnSplit.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnSplit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnSplit.setText("÷");
        btnSplit.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSplit.setBorderPainted(false);
        btnSplit.setContentAreaFilled(false);
        btnSplit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSplit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSplit.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnSplit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnSplit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSplitMouseClicked(evt);
            }
        });
        btnSplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSplitActionPerformed(evt);
            }
        });

        btnMultiply.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnMultiply.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnMultiply.setText("×");
        btnMultiply.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMultiply.setBorderPainted(false);
        btnMultiply.setContentAreaFilled(false);
        btnMultiply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMultiply.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiply.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnMultiply.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnMultiply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplyMouseClicked(evt);
            }
        });
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnSubtract.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnSubtract.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnSubtract.setText("-");
        btnSubtract.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSubtract.setBorderPainted(false);
        btnSubtract.setContentAreaFilled(false);
        btnSubtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubtract.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSubtract.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnSubtract.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnSubtract.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSubtractMouseClicked(evt);
            }
        });
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn0.setText("0");
        btn0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn0.setBorderPainted(false);
        btn0.setContentAreaFilled(false);
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btn0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn0MouseClicked(evt);
            }
        });
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnDot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnDot.setText(".");
        btnDot.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDot.setBorderPainted(false);
        btnDot.setContentAreaFilled(false);
        btnDot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDot.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDot.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnDot.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnDot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDotMouseClicked(evt);
            }
        });
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });

        btnEqual.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnEqual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnEqual.setText("=");
        btnEqual.setToolTipText("");
        btnEqual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnEqual.setBorderPainted(false);
        btnEqual.setContentAreaFilled(false);
        btnEqual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEqual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEqual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnEqual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnEqual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEqualMouseClicked(evt);
            }
        });
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnAdd.setText("+");
        btnAdd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnAdd.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.png"))); // NOI18N
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSplit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel4.setBackground(new java.awt.Color(34, 53, 84));

        jPanel5.setBackground(new java.awt.Color(19, 38, 67));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        cbxOne.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        cbxOne.setForeground(new java.awt.Color(255, 255, 255));
        cbxOne.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbxOne.setContentAreaFilled(false);
        cbxOne.setFocusPainted(false);
        cbxOne.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxOne.setLabel("Resultado 1");
        cbxOne.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbxOneStateChanged(evt);
            }
        });
        cbxOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOneActionPerformed(evt);
            }
        });

        cbxThree.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        cbxThree.setForeground(new java.awt.Color(255, 255, 255));
        cbxThree.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbxThree.setContentAreaFilled(false);
        cbxThree.setFocusPainted(false);
        cbxThree.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxThree.setLabel("Resultado 3");
        cbxThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxThreeActionPerformed(evt);
            }
        });

        cbxTwo.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        cbxTwo.setForeground(new java.awt.Color(255, 255, 255));
        cbxTwo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbxTwo.setContentAreaFilled(false);
        cbxTwo.setFocusPainted(false);
        cbxTwo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbxTwo.setLabel("Resultado 2");
        cbxTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTwoActionPerformed(evt);
            }
        });

        lblTriangle.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        lblTriangle.setForeground(new java.awt.Color(255, 255, 255));
        lblTriangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblTriangle, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxTwo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxOne, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxThree, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxOne, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(cbxTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxThree, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       // dfgfd
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnSplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSplitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSplitActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDotActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEqualActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // Suma de 2 lados debe ser mayor al otro; CBX 3 ??????????????????? if (cbx1 + cbx2 > cbx3) true
        float lado1 = Float.parseFloat(cbxOne.getText());
        float lado2 = Float.parseFloat(cbxTwo.getText());
        float lado3 = Float.parseFloat(cbxThree.getText());
        
        if ((lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2) || (lado2 + lado3 <= lado1))
        {
            
            cbxOne.setText("Resultado 1");
            cbxTwo.setText("Resultado 2");
            cbxTwo.setEnabled(false);
            cbxThree.setText("Resultado 3");
            cbxThree.setEnabled(false);
            cbxOne.setSelected(false);
            cbxTwo.setSelected(false);
            cbxThree.setSelected(false);
            JOptionPane.showMessageDialog(null, "Con los datos ingresados no es posible la creación de un triangulo. Una propiedad de los triángulos indica que la suma de dos de sus lados debe ser mayor al tercero.");

        }
                
        else
        {
            if (cbxOne.getText().equals(cbxTwo.getText()) && cbxTwo.getText().equals(cbxThree.getText()))
            {
                lblTriangle.setText("Equilátero");
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/equilatero.png")));
            }
            else if (cbxOne.getText().equals(cbxTwo.getText()) || cbxTwo.getText().equals(cbxThree.getText()) || cbxThree.getText().equals(cbxOne.getText()))
            {
                lblTriangle.setText("Isósceles");
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/isosceles.png")));
            }
            else
            {
                lblTriangle.setText("Escaleno");
                jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/escaleno.png")));
            }
        }
    }//GEN-LAST:event_btnShowActionPerformed

    private void btnCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseClicked
        txtOperacion.setText("");
        txtDigito.setText("0");
        equal = false;
        if (btnShow.isEnabled())
        {
            cbxOne.setText("Resultado 1");
            cbxTwo.setText("Resultado 2");
            cbxTwo.setEnabled(false);
            cbxThree.setText("Resultado 3");
            cbxThree.setEnabled(false);
            cbxOne.setSelected(false);
            cbxTwo.setSelected(false);
            cbxThree.setSelected(false);
            btnShow.setEnabled(false);
        }
    }//GEN-LAST:event_btnCMouseClicked

    private void btn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn7MouseClicked
        AddNumber("7");
    }//GEN-LAST:event_btn7MouseClicked

    private void btn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8MouseClicked
        AddNumber("8");
    }//GEN-LAST:event_btn8MouseClicked

    private void btn9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn9MouseClicked
        AddNumber("9");
    }//GEN-LAST:event_btn9MouseClicked

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        AddNumber("6");
    }//GEN-LAST:event_btn6MouseClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked
        AddNumber("5");
    }//GEN-LAST:event_btn5MouseClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked
        AddNumber("4");
    }//GEN-LAST:event_btn4MouseClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked
        AddNumber("3");
    }//GEN-LAST:event_btn3MouseClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked
        AddNumber("2");
    }//GEN-LAST:event_btn2MouseClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        AddNumber("1");
    }//GEN-LAST:event_btn1MouseClicked

    private void btn0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn0MouseClicked
        AddNumber("0");
    }//GEN-LAST:event_btn0MouseClicked

    private void btnDotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDotMouseClicked
        AddNumber(".");
    }//GEN-LAST:event_btnDotMouseClicked

    private void btnSplitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSplitMouseClicked
        numero1 = Float.parseFloat(txtOperacion.getText());
        signo = "/";
        txtOperacion.setText("");
    }//GEN-LAST:event_btnSplitMouseClicked

    private void btnMultiplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplyMouseClicked
        numero1 = Float.parseFloat(txtOperacion.getText());
        signo = "*";
        txtOperacion.setText("");
    }//GEN-LAST:event_btnMultiplyMouseClicked

    private void btnSubtractMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubtractMouseClicked
        numero1 = Float.parseFloat(txtOperacion.getText());
        signo = "-";
        txtOperacion.setText("");
    }//GEN-LAST:event_btnSubtractMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        numero1 = Float.parseFloat(txtOperacion.getText());
        signo = "+";
        txtOperacion.setText("");
    }//GEN-LAST:event_btnAddMouseClicked

    
    private void btnEqualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEqualMouseClicked
        numero2 = Float.parseFloat(txtOperacion.getText());
        if (equal == false)
        {
            switch(signo)
            {
                case "+":
                    txtDigito.setText(Float.toString(numero1 + numero2));
                    equal = true;
                    break;

                case "-":
                    txtDigito.setText(Float.toString(numero1 - numero2));
                    equal = true;
                    break;
                case "*":
                    txtDigito.setText(Float.toString(numero1 * numero2));
                    equal = true;
                    break;
                case "/":
                    txtDigito.setText(Float.toString(numero1 / numero2));
                    equal = true;
                    break;
            }   
        }
        else 
        {
            switch(signo)
            {
                case "+":
                    txtDigito.setText(Float.toString(Float.parseFloat(txtDigito.getText()) + Float.parseFloat(txtOperacion.getText())));
                    equal = true;
                    break;

                case "-":
                    txtDigito.setText(Float.toString(Float.parseFloat(txtDigito.getText()) - Float.parseFloat(txtOperacion.getText())));
                    equal = true;
                    break;
                case "*":
                    txtDigito.setText(Float.toString(Float.parseFloat(txtDigito.getText()) * Float.parseFloat(txtOperacion.getText())));
                    equal = true;
                    break;
                case "/":
                    txtDigito.setText(Float.toString(Float.parseFloat(txtDigito.getText()) / Float.parseFloat(txtOperacion.getText())));
                    equal = true;
                    break;
            } 
        }
    }//GEN-LAST:event_btnEqualMouseClicked

    private void cbxOneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbxOneStateChanged

     
        
    }//GEN-LAST:event_cbxOneStateChanged

    private void cbxOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOneActionPerformed
        if (cbxOne.isSelected())
        {
            if (Float.parseFloat(txtDigito.getText()) <= 0)
            {
                JOptionPane.showMessageDialog(null, "No se puede colocar números negativos  o iguales a 0.");
                cbxOne.setSelected(false);
            }
            else
            {
                cbxOne.setText(txtDigito.getText());
                cbxTwo.setEnabled(true);
            }
        }
        else
        {
            cbxOne.setText("Resultado 1");
            cbxTwo.setEnabled(false);
        }
    }//GEN-LAST:event_cbxOneActionPerformed

    private void cbxTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTwoActionPerformed
        if (cbxTwo.isSelected())
        {
            if (Float.parseFloat(txtDigito.getText()) <= 0)
            {
                JOptionPane.showMessageDialog(null, "No se puede colocar números negativos  o iguales a 0.");
                cbxTwo.setSelected(false);
            }
            else
            {
                cbxTwo.setText(txtDigito.getText());
                cbxThree.setEnabled(true);
            }
        }
        else
        {   
            cbxTwo.setText("Resultado 2");
            cbxThree.setEnabled(false);
        }
    }//GEN-LAST:event_cbxTwoActionPerformed

    private void cbxThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxThreeActionPerformed
        if (cbxThree.isSelected())
        {
            if (Float.parseFloat(txtDigito.getText()) <= 0)
            {
                JOptionPane.showMessageDialog(null, "No se puede colocar números negativos o iguales a 0.");
                cbxThree.setSelected(false);
            } 
            else
            {
                cbxThree.setText(txtDigito.getText());
                btnShow.setEnabled(true);            
            }           
        }
        else
        {
            cbxThree.setText("Resultado 3");
        }
    }//GEN-LAST:event_cbxThreeActionPerformed

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
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Design().setVisible(true);
            }
        });
    }
    
    public void AddNumber(String number) {
        if (txtOperacion.getText() == "0")
        {
            txtOperacion.setText(number);
        }
        else
        {
            txtOperacion.setText(txtOperacion.getText() + number);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnShow;
    private javax.swing.JButton btnSplit;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JCheckBox cbxOne;
    private javax.swing.JCheckBox cbxThree;
    private javax.swing.JCheckBox cbxTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblTriangle;
    private javax.swing.JLabel txtDigito;
    private javax.swing.JLabel txtOperacion;
    // End of variables declaration//GEN-END:variables
}

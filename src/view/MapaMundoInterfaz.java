/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Territorio;

/**
 *
 * @author Notebook
 */
public class MapaMundoInterfaz  extends javax.swing.JFrame implements Observer {
    
    IniciarJuegosi ijs;
    /**
     * Creates new form MapaInterfaz
     */
    public MapaMundoInterfaz(IniciarJuegosi juego) {
        ijs=juego;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groenlandia = new javax.swing.JPanel();
        canada = new javax.swing.JPanel();
        yukon = new javax.swing.JPanel();
        alaska = new javax.swing.JPanel();
        oregon = new javax.swing.JPanel();
        labrador = new javax.swing.JPanel();
        islandia = new javax.swing.JPanel();
        terranova = new javax.swing.JPanel();
        california = new javax.swing.JPanel();
        nuevayork = new javax.swing.JPanel();
        mexico = new javax.swing.JPanel();
        colombia = new javax.swing.JPanel();
        brasil = new javax.swing.JPanel();
        peru = new javax.swing.JPanel();
        chile = new javax.swing.JPanel();
        argentina = new javax.swing.JPanel();
        uruguay = new javax.swing.JPanel();
        antartida = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        groenlandia.setBackground(new java.awt.Color(224, 184, 129));
        groenlandia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        groenlandia.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout groenlandiaLayout = new javax.swing.GroupLayout(groenlandia);
        groenlandia.setLayout(groenlandiaLayout);
        groenlandiaLayout.setHorizontalGroup(
            groenlandiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        groenlandiaLayout.setVerticalGroup(
            groenlandiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(groenlandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 40, 30));

        canada.setBackground(new java.awt.Color(224, 184, 129));
        canada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        canada.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout canadaLayout = new javax.swing.GroupLayout(canada);
        canada.setLayout(canadaLayout);
        canadaLayout.setHorizontalGroup(
            canadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        canadaLayout.setVerticalGroup(
            canadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(canada, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, 30));

        yukon.setBackground(new java.awt.Color(224, 184, 129));
        yukon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yukon.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout yukonLayout = new javax.swing.GroupLayout(yukon);
        yukon.setLayout(yukonLayout);
        yukonLayout.setHorizontalGroup(
            yukonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        yukonLayout.setVerticalGroup(
            yukonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(yukon, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 40, 30));

        alaska.setBackground(new java.awt.Color(224, 184, 129));
        alaska.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        alaska.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout alaskaLayout = new javax.swing.GroupLayout(alaska);
        alaska.setLayout(alaskaLayout);
        alaskaLayout.setHorizontalGroup(
            alaskaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        alaskaLayout.setVerticalGroup(
            alaskaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(alaska, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 40, 30));

        oregon.setBackground(new java.awt.Color(224, 184, 129));
        oregon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        oregon.setForeground(new java.awt.Color(255, 204, 0));
        oregon.setToolTipText("");
        oregon.setName(""); // NOI18N

        javax.swing.GroupLayout oregonLayout = new javax.swing.GroupLayout(oregon);
        oregon.setLayout(oregonLayout);
        oregonLayout.setHorizontalGroup(
            oregonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        oregonLayout.setVerticalGroup(
            oregonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(oregon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 40, 30));
        oregon.getAccessibleContext().setAccessibleName("");

        labrador.setBackground(new java.awt.Color(224, 184, 129));
        labrador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        labrador.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout labradorLayout = new javax.swing.GroupLayout(labrador);
        labrador.setLayout(labradorLayout);
        labradorLayout.setHorizontalGroup(
            labradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        labradorLayout.setVerticalGroup(
            labradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(labrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 40, 20));

        islandia.setBackground(new java.awt.Color(243, 217, 176));
        islandia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        islandia.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout islandiaLayout = new javax.swing.GroupLayout(islandia);
        islandia.setLayout(islandiaLayout);
        islandiaLayout.setHorizontalGroup(
            islandiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        islandiaLayout.setVerticalGroup(
            islandiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(islandia, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 30, 30));

        terranova.setBackground(new java.awt.Color(224, 184, 129));
        terranova.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        terranova.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout terranovaLayout = new javax.swing.GroupLayout(terranova);
        terranova.setLayout(terranovaLayout);
        terranovaLayout.setHorizontalGroup(
            terranovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        terranovaLayout.setVerticalGroup(
            terranovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(terranova, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 165, 30, 30));

        california.setBackground(new java.awt.Color(224, 184, 129));
        california.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        california.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout californiaLayout = new javax.swing.GroupLayout(california);
        california.setLayout(californiaLayout);
        californiaLayout.setHorizontalGroup(
            californiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        californiaLayout.setVerticalGroup(
            californiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(california, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 30, 30));

        nuevayork.setBackground(new java.awt.Color(224, 184, 129));
        nuevayork.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevayork.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout nuevayorkLayout = new javax.swing.GroupLayout(nuevayork);
        nuevayork.setLayout(nuevayorkLayout);
        nuevayorkLayout.setHorizontalGroup(
            nuevayorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        nuevayorkLayout.setVerticalGroup(
            nuevayorkLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(nuevayork, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 30, 20));

        mexico.setBackground(new java.awt.Color(224, 184, 129));
        mexico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mexico.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout mexicoLayout = new javax.swing.GroupLayout(mexico);
        mexico.setLayout(mexicoLayout);
        mexicoLayout.setHorizontalGroup(
            mexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        mexicoLayout.setVerticalGroup(
            mexicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(mexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 30, 30));

        colombia.setBackground(new java.awt.Color(155, 224, 158));
        colombia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        colombia.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout colombiaLayout = new javax.swing.GroupLayout(colombia);
        colombia.setLayout(colombiaLayout);
        colombiaLayout.setHorizontalGroup(
            colombiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        colombiaLayout.setVerticalGroup(
            colombiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(colombia, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 40, 20));

        brasil.setBackground(new java.awt.Color(155, 224, 158));
        brasil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        brasil.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout brasilLayout = new javax.swing.GroupLayout(brasil);
        brasil.setLayout(brasilLayout);
        brasilLayout.setHorizontalGroup(
            brasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        brasilLayout.setVerticalGroup(
            brasilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(brasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 40, 30));

        peru.setBackground(new java.awt.Color(155, 224, 158));
        peru.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        peru.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout peruLayout = new javax.swing.GroupLayout(peru);
        peru.setLayout(peruLayout);
        peruLayout.setHorizontalGroup(
            peruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        peruLayout.setVerticalGroup(
            peruLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(peru, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 40, 20));

        chile.setBackground(new java.awt.Color(155, 224, 158));
        chile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        chile.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout chileLayout = new javax.swing.GroupLayout(chile);
        chile.setLayout(chileLayout);
        chileLayout.setHorizontalGroup(
            chileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        chileLayout.setVerticalGroup(
            chileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(chile, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 20, 30));

        argentina.setBackground(new java.awt.Color(155, 224, 158));
        argentina.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        argentina.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout argentinaLayout = new javax.swing.GroupLayout(argentina);
        argentina.setLayout(argentinaLayout);
        argentinaLayout.setHorizontalGroup(
            argentinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        argentinaLayout.setVerticalGroup(
            argentinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(argentina, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 30, 20));

        uruguay.setBackground(new java.awt.Color(155, 224, 158));
        uruguay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uruguay.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout uruguayLayout = new javax.swing.GroupLayout(uruguay);
        uruguay.setLayout(uruguayLayout);
        uruguayLayout.setHorizontalGroup(
            uruguayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        uruguayLayout.setVerticalGroup(
            uruguayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        getContentPane().add(uruguay, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 30, 20));

        antartida.setBackground(new java.awt.Color(0, 0, 0));
        antartida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        antartida.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout antartidaLayout = new javax.swing.GroupLayout(antartida);
        antartida.setLayout(antartidaLayout);
        antartidaLayout.setHorizontalGroup(
            antartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        antartidaLayout.setVerticalGroup(
            antartidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        getContentPane().add(antartida, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 40, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 30, 20));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 30, 20));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 30, 20));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 30, 20));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 30, 20));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 30, 20));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 30, 20));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 30, 20));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 30, 20));

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 30, 20));

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 30, 20));

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 30, 20));

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 30, 20));

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 30, 20));

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 30, 20));

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 400, 30, 20));

        jButton17.setBackground(new java.awt.Color(0, 0, 0));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 30, 20));

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 30, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/combatesi/UltimoMapa Combate.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ijs.juego1.Jugando(18);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         ijs.juego1.Jugando(6);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         ijs.juego1.Jugando(7);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       ijs.juego1.Jugando(1); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ijs.juego1.Jugando(2);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         ijs.juego1.Jugando(5);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         ijs.juego1.Jugando(4);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         ijs.juego1.Jugando(3);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         ijs.juego1.Jugando(9);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
         ijs.juego1.Jugando(11);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
         ijs.juego1.Jugando(10);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
         ijs.juego1.Jugando(8);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         ijs.juego1.Jugando(12);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
         ijs.juego1.Jugando(13);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
         ijs.juego1.Jugando(16);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
         ijs.juego1.Jugando(17);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
         ijs.juego1.Jugando(15);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
         ijs.juego1.Jugando(14);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void MostrarGUI(IniciarJuegosi juego) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() { new MapaMundoInterfaz(juego).setVisible(true);}
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel alaska;
    private javax.swing.JPanel antartida;
    private javax.swing.JPanel argentina;
    private javax.swing.JPanel brasil;
    private javax.swing.JPanel california;
    private javax.swing.JPanel canada;
    private javax.swing.JPanel chile;
    private javax.swing.JPanel colombia;
    private javax.swing.JPanel groenlandia;
    private javax.swing.JPanel islandia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel labrador;
    private javax.swing.JPanel mexico;
    private javax.swing.JPanel nuevayork;
    private javax.swing.JPanel oregon;
    private javax.swing.JPanel peru;
    private javax.swing.JPanel terranova;
    private javax.swing.JPanel uruguay;
    private javax.swing.JPanel yukon;
    // End of variables declaration//GEN-END:variables
//lo que hace el update es asignarle a cada boton la info del territorio que necesite
    @Override
    public void update(ArrayList <Territorio> territorios) {

		jButton1.setText(String.valueOf(territorios.get(1).getEjercitos()));
		jButton10.setText(String.valueOf(territorios.get(10).getEjercitos()));
		jButton11.setText(String.valueOf(territorios.get(11).getEjercitos()));
		jButton12.setText(String.valueOf(territorios.get(12).getEjercitos()));
		jButton13.setText(String.valueOf(territorios.get(13).getEjercitos()));
        jButton14.setText(String.valueOf(territorios.get(14).getEjercitos()));
        jButton15.setText(String.valueOf(territorios.get(15).getEjercitos()));
        jButton16.setText(String.valueOf(territorios.get(16).getEjercitos()));
        jButton17.setText(String.valueOf(territorios.get(17).getEjercitos()));
        jButton18.setText(String.valueOf(territorios.get(18).getEjercitos()));
        jButton2.setText(String.valueOf(territorios.get(2).getEjercitos()));
        jButton3.setText(String.valueOf(territorios.get(3).getEjercitos()));
        jButton4.setText(String.valueOf(territorios.get(4).getEjercitos()));
        jButton5.setText(String.valueOf(territorios.get(5).getEjercitos()));
        jButton6.setText(String.valueOf(territorios.get(6).getEjercitos()));
        jButton7.setText(String.valueOf(territorios.get(7).getEjercitos()));
        jButton8.setText(String.valueOf(territorios.get(8).getEjercitos()));
        jButton9.setText(String.valueOf(territorios.get(9).getEjercitos()));
		
				
     }
}

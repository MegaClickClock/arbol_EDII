package com.mycompany.arbol;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    Arbol A1,A2;
    public Main() {
        initComponents();
        A1 = new Arbol();
        A2 = new Arbol();
        
        A2.insertar(20);
        A2.insertar(15);
        A2.insertar(10);
        A2.insertar(12);
        A2.insertar(30);
        A2.insertar(40);
        A2.insertar(35);
        A2.insertar(50);
        
        
        
        A1.insertar(15);
        A1.insertar(10);
        A2.insertar(12);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta1 = new javax.swing.JTextArea();
        btnInsertar = new javax.swing.JButton();
        btnPreOrden = new javax.swing.JButton();
        btnInOrden = new javax.swing.JButton();
        btnPostOrden = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnSumarPares = new javax.swing.JButton();
        btnCantPares = new javax.swing.JButton();
        btnMostrarPares = new javax.swing.JButton();
        btnAltura = new javax.swing.JButton();
        btnMayorX = new javax.swing.JButton();
        btnMostrarPadres = new javax.swing.JButton();
        btnAbuelo = new javax.swing.JButton();
        btnPadre = new javax.swing.JButton();
        btnNietos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta2 = new javax.swing.JTextArea();
        t2 = new javax.swing.JTextField();
        btnInsertar2 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSubArbol = new javax.swing.JButton();
        btnJobi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jta1.setColumns(20);
        jta1.setRows(5);
        jScrollPane1.setViewportView(jta1);

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnPreOrden.setText("PreOrden");
        btnPreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreOrdenActionPerformed(evt);
            }
        });

        btnInOrden.setText("InOrden");
        btnInOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInOrdenActionPerformed(evt);
            }
        });

        btnPostOrden.setText("PostOrden");
        btnPostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostOrdenActionPerformed(evt);
            }
        });

        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnSumarPares.setText("SumarPares");
        btnSumarPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarParesActionPerformed(evt);
            }
        });

        btnCantPares.setText("CantidadPares");
        btnCantPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCantParesActionPerformed(evt);
            }
        });

        btnMostrarPares.setText("MostrarPares");
        btnMostrarPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarParesActionPerformed(evt);
            }
        });

        btnAltura.setText("altura");
        btnAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlturaActionPerformed(evt);
            }
        });

        btnMayorX.setText("MayorX");
        btnMayorX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMayorXActionPerformed(evt);
            }
        });

        btnMostrarPadres.setText("MostrarPadres");
        btnMostrarPadres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarPadresActionPerformed(evt);
            }
        });

        btnAbuelo.setText("Abuelo");
        btnAbuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbueloActionPerformed(evt);
            }
        });

        btnPadre.setText("Padre");
        btnPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPadreActionPerformed(evt);
            }
        });

        btnNietos.setText("Nietos");
        btnNietos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNietosActionPerformed(evt);
            }
        });

        jta2.setColumns(20);
        jta2.setRows(5);
        jScrollPane2.setViewportView(jta2);

        btnInsertar2.setText("Insertar2");
        btnInsertar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar2ActionPerformed(evt);
            }
        });

        btnIgual.setText("comparar");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSubArbol.setText("SubArbol");
        btnSubArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubArbolActionPerformed(evt);
            }
        });

        btnJobi.setText("Jobi");
        btnJobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJobiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIgual)
                            .addComponent(btnSubArbol)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPreOrden)
                                    .addComponent(btnSumar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSumarPares)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCantPares))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnInOrden)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPostOrden)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNietos))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMostrarPares)
                                .addGap(18, 18, 18)
                                .addComponent(btnAltura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMayorX))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMostrarPadres)
                                .addGap(18, 18, 18)
                                .addComponent(btnAbuelo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPadre)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btnInsertar2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(btnJobi)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInsertar2)))
                            .addComponent(btnInsertar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnIgual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubArbol)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPreOrden)
                            .addComponent(btnInOrden)
                            .addComponent(btnPostOrden)
                            .addComponent(btnNietos)))
                    .addComponent(btnJobi, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSumar)
                    .addComponent(btnSumarPares)
                    .addComponent(btnCantPares))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarPares)
                    .addComponent(btnAltura)
                    .addComponent(btnMayorX))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarPadres)
                    .addComponent(btnAbuelo)
                    .addComponent(btnPadre))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        // TODO add your handling code here:
        int x;
        x = Integer.parseInt(t1.getText());
        A1.insertar(x);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnPreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreOrdenActionPerformed
        // TODO add your handling code here:
        A1.preOrden(jta1);
    }//GEN-LAST:event_btnPreOrdenActionPerformed

    private void btnInOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInOrdenActionPerformed
        // TODO add your handling code here:
        A1.inOrden(jta1);
    }//GEN-LAST:event_btnInOrdenActionPerformed

    private void btnPostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostOrdenActionPerformed
        // TODO add your handling code here:
        A1.postOrden(jta1);
    }//GEN-LAST:event_btnPostOrdenActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        // TODO add your handling code here:
        int s = A1.sumar();
        JOptionPane.showMessageDialog(null, "la suma es: " + Integer.toString(s));
        //t1.setText(Integer.toString(s));
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnSumarParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarParesActionPerformed
        // TODO add your handling code here:
        int sumarPares = A1.sumarPares();
        JOptionPane.showMessageDialog(null, "la suma de pares es: " + Integer.toString(sumarPares));
        
    }//GEN-LAST:event_btnSumarParesActionPerformed

    private void btnCantParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCantParesActionPerformed
        // TODO add your handling code here:
        int cantidaPares = A1.cantdiadPares();
        JOptionPane.showMessageDialog(null, "la cantidad de pares es: " + Integer.toString(cantidaPares));        
    }//GEN-LAST:event_btnCantParesActionPerformed

    private void btnMostrarParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarParesActionPerformed
        // TODO add your handling code here:
        A1.mostrarPares(jta1);
    }//GEN-LAST:event_btnMostrarParesActionPerformed

    private void btnAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlturaActionPerformed
        // TODO add your handling code here:
        int altura = A1.altura();
        JOptionPane.showMessageDialog(null, "la cantidad de pares es: " + Integer.toString(altura));
    }//GEN-LAST:event_btnAlturaActionPerformed

    private void btnMayorXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMayorXActionPerformed
        // TODO add your handling code here:
        int mayorX;
        mayorX = Integer.parseInt(t1.getText());
        A1.mayoresX(jta1, mayorX);
    }//GEN-LAST:event_btnMayorXActionPerformed

    private void btnMostrarPadresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarPadresActionPerformed
        // TODO add your handling code here:
        A1.mostrarPadres(jta1);
    }//GEN-LAST:event_btnMostrarPadresActionPerformed

    private void btnAbueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbueloActionPerformed
        // TODO add your handling code here:
        int devolverAbuelo = Integer.parseInt(t1.getText());
        devolverAbuelo = A1.devolverAbuelo(devolverAbuelo);
        JOptionPane.showMessageDialog(null, "el abuelo es: " + Integer.toString(devolverAbuelo));        
    }//GEN-LAST:event_btnAbueloActionPerformed

    private void btnPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPadreActionPerformed
        // TODO add your handling code here:
        int devolverPadre = Integer.parseInt(t1.getText());
        devolverPadre = A1.devolverPadre(devolverPadre);
        JOptionPane.showMessageDialog(null, "el padre es: " + Integer.toString(devolverPadre));        
    }//GEN-LAST:event_btnPadreActionPerformed

    private void btnNietosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNietosActionPerformed
        // TODO add your handling code here:
        int nietos;
        nietos = Integer.parseInt(t1.getText());
        A1.mostrarNietos(nietos, jta1);
    }//GEN-LAST:event_btnNietosActionPerformed

    private void btnInsertar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar2ActionPerformed
        // TODO add your handling code here:
        int x;
        x = Integer.parseInt(t2.getText());
        A2.insertar(x);
    }//GEN-LAST:event_btnInsertar2ActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        // TODO add your handling code here:
        if (A1.iguales(A2)) {
            JOptionPane.showMessageDialog(null, "son iguales");
        }else{
            JOptionPane.showMessageDialog(null, "no son iguales");
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        A1.eliminar(Integer.parseInt(t1.getText()));
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSubArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubArbolActionPerformed
        // TODO add your handling code here:
        if (A2.compararSubarbol(A1)) {
            JOptionPane.showMessageDialog(null, "es subarbol");
        }else{
            JOptionPane.showMessageDialog(null, "no es subarbol");
        }
    }//GEN-LAST:event_btnSubArbolActionPerformed

    private void btnJobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJobiActionPerformed
        // TODO add your handling code here:
        int x = Integer.parseInt(t1.getText());
        A1.seriePar(x, jta1);
    }//GEN-LAST:event_btnJobiActionPerformed
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbuelo;
    private javax.swing.JButton btnAltura;
    private javax.swing.JButton btnCantPares;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnInOrden;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnInsertar2;
    private javax.swing.JButton btnJobi;
    private javax.swing.JButton btnMayorX;
    private javax.swing.JButton btnMostrarPadres;
    private javax.swing.JButton btnMostrarPares;
    private javax.swing.JButton btnNietos;
    private javax.swing.JButton btnPadre;
    private javax.swing.JButton btnPostOrden;
    private javax.swing.JButton btnPreOrden;
    private javax.swing.JButton btnSubArbol;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnSumarPares;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jta1;
    private javax.swing.JTextArea jta2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}

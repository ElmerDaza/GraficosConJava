
package clases;

import java.awt.Graphics;


public class GraficoDeBarras extends javax.swing.JFrame {

    public GraficoDeBarras() {
        initComponents();
        this.setLocationRelativeTo(false);
    }

    boolean bandera = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JlabelRojo = new javax.swing.JLabel();
        JlabelVerde = new javax.swing.JLabel();
        JlabelAzul = new javax.swing.JLabel();
        JtextFieldRojo = new javax.swing.JTextField();
        JtextFieldVerde = new javax.swing.JTextField();
        JtextFieldAzul = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JlabelRojo.setText("rojo");

        JlabelVerde.setText("verde");

        JlabelAzul.setText("azul");

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jLabel1.setText("Color Favorito");

        jButton1.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        jButton1.setText("Graficar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JlabelVerde)
                    .addComponent(JlabelRojo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlabelAzul, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JtextFieldAzul, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(JtextFieldVerde)
                    .addComponent(JtextFieldRojo))
                .addGap(51, 51, 51)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(277, 277, 277)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelRojo)
                    .addComponent(JtextFieldRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelVerde)
                    .addComponent(JtextFieldVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JtextFieldAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JlabelAzul))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bandera = true;
        repaint();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GraficoDeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficoDeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficoDeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficoDeBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficoDeBarras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelAzul;
    private javax.swing.JLabel JlabelRojo;
    private javax.swing.JLabel JlabelVerde;
    private javax.swing.JTextField JtextFieldAzul;
    private javax.swing.JTextField JtextFieldRojo;
    private javax.swing.JTextField JtextFieldVerde;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //metodo para calcular el valor mas alto entre los tres
    public int ValorMayor(int ValorRojo, int ValorVerde, int ValorAzul) {
        if (ValorRojo > ValorVerde && ValorRojo > ValorAzul) {
            return ValorRojo;
        } else if (ValorVerde > ValorAzul) {
            return ValorVerde;
        }
        return ValorAzul;
    }
    @Override
    public void paint(Graphics g){
            super.paint(g);
            if(bandera == true){
               
                //recuperar los valores ingresados por usuario
                String Valor_rojo = JtextFieldRojo.getText();
                String Valor_verde = JtextFieldVerde.getText();
                String Valor_azul = JtextFieldAzul.getText();
                
                //comvertir los valores a enteros
                int valor_rojo = Integer.parseInt(Valor_rojo);
                int valor_verde = Integer.parseInt(Valor_verde);
                int valor_azul = Integer.parseInt(Valor_azul);
                
                //guardamos el valor obtenido en el metodo ValorMayor
                int Valor_mayor = ValorMayor(valor_rojo, valor_verde, valor_azul);
                
                int largoRojo = valor_rojo * 400 / Valor_mayor;
                int largoVerde = valor_verde * 400 / Valor_mayor;
                int largoAzul = valor_azul * 400 / Valor_mayor;
                
                //graficamos las barras
                g.setColor(java.awt.Color.RED);
                g.fillRect(100, 100, largoRojo, 40);
                g.drawString("color rojo",10,125);
                
                
                g.setColor(java.awt.Color.GREEN);
                g.fillRect(100, 150, largoVerde, 40);
                g.drawString("color verde",10,140);
                
                g.setColor(java.awt.Color.BLUE);
                g.fillRect(100, 200, largoAzul, 40);
                g.drawString("color verde",10,155);
            }
    
    }
    
}

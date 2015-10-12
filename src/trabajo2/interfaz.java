package trabajo2;

import java.util.Random;
import javax.swing.DefaultListModel;

public class interfaz extends javax.swing.JFrame {

    Random desor = new Random();
   DefaultListModel renglon;
   
    
    
    public interfaz() {
        initComponents();
setLocationRelativeTo(null);

    renglon = new DefaultListModel();
    jList1.setModel(renglon);
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.setBackground(new java.awt.Color(0, 255, 255));
        jScrollPane1.setViewportView(jList1);

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setText("ORDENAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setText("DESORDENAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 255, 0));
        jButton3.setText("LIMPIAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("                      28 CREENCIAS DE LOS ADVENTISTAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2)
                        .addGap(49, 49, 49)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// ordenar
     renglon.clear();
        
        
     renglon.addElement("1. Las Sagradas Escrituras");
     renglon.addElement("2. La Trinidad");
     renglon.addElement("3. Dios Padre");
     renglon.addElement("4. Dios Hijo");
     renglon.addElement("5. Dios Espíritu Santo");
     renglon.addElement("6. Dios es el Creador");
     renglon.addElement("7. La Naturaleza del Hombre");
     renglon.addElement("8. El Gran Conflicto");
     renglon.addElement("9. Vida, Muerte y Ressurrección de Cristo");
     renglon.addElement("10. La Experiencia de la Salvación");
     renglon.addElement("11. El crecimiento en Cristo");
     renglon.addElement("12. La Iglesia");
     renglon.addElement("13. El Remaneciente y su Misión");
     renglon.addElement("14. Unidad en el Cuerpo de Cristo");
     renglon.addElement("15. El Bautisimo");
     renglon.addElement("16. La Cena del Señor");
     renglon.addElement("17. Dones y Ministerios Espirituales");
     renglon.addElement("18. El Don de Profecía");
     renglon.addElement("19. La Ley de Dios");
     renglon.addElement("20. El Sábado");
     renglon.addElement("21. Mayordomía");
     renglon.addElement("22. Conducta Cristiana");
     renglon.addElement("23. Matrimonio y Familia");
     renglon.addElement("24. El Ministerio de Cristo en el Santuario Celestial");
     renglon.addElement("25. La Segunda Venida de Cristo");
     renglon.addElement("26. Muerte y Resurrección");
     renglon.addElement("27. El Milenio y el Fin del Pecado");
     renglon.addElement("28. La Nueva Tierra");
        
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // opcion de desordenar
        String[] vector = new String[28];
                vector[0] = "1. Las Sagradas Escrituras";
                vector[1] = "2. La Trinidad";
                vector[2] ="3. Dios Padre";
                vector[3] =  "4. Dios Hijo";       
                vector[4] = "5. Dios Espíritu Santo";
                vector[5] = "6. Dios es el Creador";
                vector[6] = "7. La Naturaleza del Hombre";
                vector[7] = "8. El Gran Conflicto";
                vector[8] = "9. Vida, Muerte y Ressurrección de Cristo";
                vector[9] = "10. La Experiencia de la Salvación";
                vector[10] = "11. El crecimiento en Cristo";
                vector[11] = "12. La Iglesia";
                vector[12] = "13. El Remaneciente y su Misión";
                vector[13] = "14. Unidad en el Cuerpo de Cristo";
                vector[14] = "15. El Bautisimo";
                vector[15] = "16. La Cena del Señor";
                vector[16] = "17. Dones y Ministerios Espirituales";
                vector[17] = "18. El Don de Profecía";
                vector[18] = "19. La Ley de Dios";
                vector[19] = "20. El Sábado";
                vector[20] = "21. Mayordomía";
                vector[21] = "22. Conducta Cristiana";
                vector[22] = "23. Matrimonio y Familia";
                vector[23] ="24. El Ministerio de Cristo en el Santuario Celestial";
                vector[24] = "25. La Segunda Venida de Cristo";
                vector[25] = "26. Muerte y Resurrección";
                vector[26] = "27. El Milenio y el Fin del Pecado";
                vector[27] =  "28. La Nueva Tierra";
                
                renglon.clear();
               for (int i = 0; i < 28 ; i++) {
                   renglon.addElement(vector[ desor.nextInt(28)]);
                   
                   
           
            
        }
                
               
           
        
                
                
                
                
                
                
                
                
                
                
                
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
renglon.clear();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

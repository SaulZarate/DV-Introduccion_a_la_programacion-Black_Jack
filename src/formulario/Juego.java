
package formulario;
import javax.swing.*;
import java.util.*;

public class Juego extends javax.swing.JFrame {

    
    public Juego() {
        initComponents();
        saldoInicialTextField.setText(Double.toString(Bienvenida.saldoinicial));
        saldo = Bienvenida.saldoinicial;  
        saldoTextField.setText(Double.toString(saldo));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        saldoInicialTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        saldoTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jugarButton = new javax.swing.JButton();
        pedirCartaButton = new javax.swing.JButton();
        plantarseButton = new javax.swing.JButton();
        doblarButton = new javax.swing.JButton();
        terminarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel1.setText("Saldo inicial");

        saldoInicialTextField.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        saldoInicialTextField.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jLabel2.setText("Saldo");

        saldoTextField.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        saldoTextField.setEnabled(false);

        jugarButton.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        jugarButton.setText("Jugar");
        jugarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jugarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarButtonActionPerformed(evt);
            }
        });

        pedirCartaButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pedirCartaButton.setText("Pedir Carta");
        pedirCartaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pedirCartaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pedirCartaButtonActionPerformed(evt);
            }
        });

        plantarseButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        plantarseButton.setText("Me planto");
        plantarseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        plantarseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plantarseButtonActionPerformed(evt);
            }
        });

        doblarButton.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        doblarButton.setText("Doblar Apuesta");
        doblarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doblarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doblarButtonActionPerformed(evt);
            }
        });

        terminarButton.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        terminarButton.setText("Terminar");
        terminarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        terminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pedirCartaButton)
                        .addGap(18, 18, 18)
                        .addComponent(plantarseButton)
                        .addGap(18, 18, 18)
                        .addComponent(doblarButton)
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(saldoInicialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(saldoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(terminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jugarButton)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(saldoInicialTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(saldoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jugarButton)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pedirCartaButton)
                    .addComponent(plantarseButton)
                    .addComponent(doblarButton))
                .addGap(18, 18, 18)
                .addComponent(terminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static double saldo;
    Random rnd=new Random();
    double apuesta,ganancias;
    int puntajemesa, puntajejugador;
    int numcarta1,numcarta2,numcarta3,numcarta4,numcarta5,numcarta6,numcarta7,numcarta8,numcarta9,numcarta10;
    int palocarta1,palocarta2,palocarta3,palocarta4,palocarta5,palocarta6,palocarta7,palocarta8,palocarta9,palocarta10;
    int sumajugador1,sumajugador2,sumajugador3,sumajugador4;
    int sumamesa1,sumamesa2,sumamesa3,sumamesa4;
    int contadorpedir,contadordoblarapuesta;
    int blackjackmesa;
    
    
    private void jugarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarButtonActionPerformed
        
        saldo=Double.parseDouble(saldoTextField.getText());
        
        contadorpedir=0;
        contadordoblarapuesta=0;
        
        if(saldo >= 50){
            saldo=saldo-50;
        saldoTextField.setText(""+saldo);       
        
        
        /* ----------------- CARTAS DE LA MESA ----------------------- */ 
        
        numcarta1=rnd.nextInt(13)+1;
        palocarta1=rnd.nextInt(4);
        jLabel3.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta1+"_"+"0.jpg")));
        if(numcarta1>=10){
            numcarta1=10;
        }
        
        numcarta2=rnd.nextInt(13)+1;
        palocarta2=rnd.nextInt(4);
        jLabel4.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta2+"_"+"0.jpg")));
        if(numcarta2>=10){
            numcarta2=10;
        }
        
        jLabel4.setVisible(false);
        
        sumamesa1=numcarta1+numcarta2;
        
        /* -------------------- CARTAS DEL JUGADOR ------------------------- */
        
        numcarta6=rnd.nextInt(13)+1;
        palocarta6=rnd.nextInt(4);
        jLabel8.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta6+"_"+"0.jpg")));
        
        numcarta7=rnd.nextInt(13)+1;
        palocarta7=rnd.nextInt(4);
        jLabel9.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta7+"_"+"0.jpg")));
        
        numcarta8=rnd.nextInt(13)+1;
        palocarta8=rnd.nextInt(4);
        jLabel10.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta8+"_"+"0.jpg")));
        
        numcarta9=rnd.nextInt(13)+1;
        palocarta9=rnd.nextInt(4);
        jLabel11.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta9+"_"+"0.jpg")));
        
        numcarta10=rnd.nextInt(13)+1;
        palocarta10=rnd.nextInt(4);
        jLabel12.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta10+"_"+"0.jpg")));
        
        jLabel10.setVisible(false);
        jLabel11.setVisible(false);
        jLabel12.setVisible(false);
        
        if(numcarta6>=10){
            numcarta6=10;
        }
        if(numcarta7>=10){
            numcarta7=10;
        }
        if(numcarta8>=10){
            numcarta8=10;
        }
        if(numcarta9>=10){
            numcarta9=10;
        }
        if(numcarta10>=10){
            numcarta10=10;
        }
        
        sumajugador1=numcarta6+numcarta7;
        sumajugador2=sumajugador1+numcarta8;
        sumajugador3=sumajugador2+numcarta9;
        sumajugador4=sumajugador3+numcarta10;
        
        puntajejugador=sumajugador1;
        
        /* Black Jack */
        if(numcarta6==1 && numcarta7==10 || numcarta7==1 && numcarta6==10){
            puntajejugador=22;
        }
        
        /* ----------------------------------------------------------------- */
       }else{
            JOptionPane.showMessageDialog(null,"No tiene mas Saldo");
        }
        
        
        
    }//GEN-LAST:event_jugarButtonActionPerformed

    private void pedirCartaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pedirCartaButtonActionPerformed
        
        
        if(contadorpedir <=2){
            
            switch(contadorpedir){
                case 0: 
                    jLabel10.setVisible(true);
                    if(sumajugador2 >21){
                        puntajejugador=0;
                        JOptionPane.showMessageDialog(null,"Se paso de 21");
                    }else{
                        contadorpedir++;
                        puntajejugador=sumajugador2;
                    }
                    break;
                case 1: 
                    jLabel11.setVisible(true);
                    if(sumajugador3 >21){
                        puntajejugador=0;
                        JOptionPane.showMessageDialog(null,"Se paso de 21");
                    }else{
                        contadorpedir++;
                        puntajejugador=sumajugador3;
                    }
                    break;
                case 2: 
                    jLabel12.setVisible(true);
                    if(sumajugador4 >21){
                        puntajejugador=0;
                        JOptionPane.showMessageDialog(null,"Se paso de 21");
                    }else{
                        puntajejugador=sumajugador4;
                    }
                    break;
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"No puede pedir mas cartas.");
        }
        
        
        
    }//GEN-LAST:event_pedirCartaButtonActionPerformed

    private void plantarseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plantarseButtonActionPerformed
        
        ganancias=Double.parseDouble(saldoTextField.getText());
        
        /* ---------------------- CODIGO DE CARTAS ------------------------- */
        
        jLabel4.setVisible(true);
        
        /* Black Jack */
        if(numcarta1==1 && numcarta2==10 || numcarta2==1 && numcarta1==10){
            puntajemesa=22;
            blackjackmesa=1;
        }
        
        if(blackjackmesa != 1){
            
            
        if(sumamesa1 >= 17 && sumamesa1 <= 21){
            puntajemesa=sumamesa1;
        }else if(sumamesa1 < 17){
            numcarta3=rnd.nextInt(13)+1;
            palocarta3=rnd.nextInt(4);
            jLabel5.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta3+"_"+"0.jpg")));
            if(numcarta3 >= 10){
                numcarta3=10;
            }
            sumamesa2=sumamesa1+numcarta3;
        }
        
        if(sumamesa2 >= 17 && sumamesa2<=21){
            puntajemesa=sumamesa2;
        }else if(sumamesa2 < 17){
            numcarta4=rnd.nextInt(13)+1;
            palocarta4=rnd.nextInt(4);
            jLabel6.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta4+"_"+"0.jpg")));
            if(numcarta4>=10){
                numcarta4=10;
            }
            sumamesa3=sumamesa2+numcarta4;
        }else if(sumamesa2 >21){
            puntajemesa=0;
            JOptionPane.showMessageDialog(null,"La mesa se paso de 21, usted gana");
        }
        
        if(sumamesa3 >= 17 && sumamesa3<=21){
            puntajemesa=sumamesa3;
        }else if(sumamesa3 < 17){
            numcarta5=rnd.nextInt(13)+1;
            palocarta5=rnd.nextInt(4);
            jLabel7.setIcon(new ImageIcon(getClass().getResource("/imagenes/carta_"+numcarta5+"_"+"0.jpg")));
            if(numcarta5>=10){
                numcarta5=10;
            }
            sumamesa4=sumamesa3+numcarta5;
        }else if(sumamesa3 >21){
            puntajemesa=0;
            JOptionPane.showMessageDialog(null,"La mesa se paso de 21, usted gana");
        }
        
        if(sumamesa4 >= 17 && sumamesa4<=21){
            puntajemesa=sumamesa4;
        }else if(sumamesa4 < 17){
            puntajemesa=sumamesa4;
        }else if(sumamesa4 >21){
            puntajemesa=0;
            JOptionPane.showMessageDialog(null,"La mesa se paso de 21, usted gana");
        } 
        
        }
        
        /* ------------------------ TRANSACCIONES ------------------------- */
        
        if(puntajemesa == puntajejugador){
            saldo=saldo+50;
            saldoTextField.setText(""+saldo);
        }
        
        if(puntajejugador > puntajemesa && puntajejugador == 22){
            saldo=saldo+150;
            saldoTextField.setText(""+saldo);
        }else if(puntajejugador > puntajemesa){
            saldo=saldo+100;
            saldoTextField.setText(""+saldo);
        }
        
        /* ----------------------------------------------------------------- */
        
        JOptionPane.showMessageDialog(null,"puntaje del jugador"+puntajejugador+"\npuntaje de la mesa"+puntajemesa);
        puntajemesa=0;
        
        
    }//GEN-LAST:event_plantarseButtonActionPerformed

    private void doblarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doblarButtonActionPerformed
        
        saldo=Double.parseDouble(saldoTextField.getText());
        if(contadordoblarapuesta==0 && saldo >=50 && contadorpedir==0){
            saldo=saldo-50;
            jLabel10.setVisible(true);
            puntajejugador=sumajugador2;
            saldoTextField.setText(""+saldo);  
            
            jLabel4.setVisible(true);
            
            if(sumamesa1>=17 && sumamesa1<=21){
                puntajemesa=sumajugador1;
            }else if(sumamesa1<17){
                jLabel5.setVisible(true);
                
                
            }else if(sumamesa1>21){
                puntajemesa=0;
            }
            
            if(sumamesa2>=17 && sumamesa2<=21){
                puntajemesa=sumajugador2;
            }else if(sumamesa2<17){
                jLabel5.setVisible(true);
            }else if(sumamesa2>21){
                puntajemesa=0;
            }
            
            if(sumamesa3>=17 && sumamesa3<=21){
                puntajemesa=sumajugador3;
            }else if(sumamesa3<17){
                jLabel5.setVisible(true);
            }else if(sumamesa3>21){
                puntajemesa=0;
            }
            
            if(sumamesa4>=17 && sumamesa4<=21){
                puntajemesa=sumajugador4;
            }else if(sumamesa4<17){
                jLabel5.setVisible(true);
            }else if(sumamesa4>21){
                puntajemesa=0;
            }
            
        }else if(saldo<50 || contadordoblarapuesta!=0 || contadorpedir!=0){
            JOptionPane.showMessageDialog(null,"No se puede doblar apuesta porque no tiene saldo o no es la primera mano");
        }
        
        contadordoblarapuesta++;
        
        JOptionPane.showMessageDialog(null,"Suma de la Mesa: "+puntajemesa+"\n Suma del Jugador: "+puntajejugador);
        
    }//GEN-LAST:event_doblarButtonActionPerformed
 
    private void terminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarButtonActionPerformed
         
        Ganancias formulario_ganancias=new Ganancias();
        formulario_ganancias.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_terminarButtonActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton doblarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jugarButton;
    private javax.swing.JButton pedirCartaButton;
    private javax.swing.JButton plantarseButton;
    private javax.swing.JTextField saldoInicialTextField;
    private javax.swing.JTextField saldoTextField;
    private javax.swing.JButton terminarButton;
    // End of variables declaration//GEN-END:variables
}

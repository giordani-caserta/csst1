/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author fx
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        btnUscita = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        lypCorsi = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCorsi = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        lypAllievi = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAllievi = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        lblStato = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestione Centro Studi");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnUscita.setText("Esci...");
        btnUscita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUscitaActionPerformed(evt);
            }
        });

        tblCorsi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titolo del Corso", "Altri dati"
            }
        ));
        tblCorsi.setColumnSelectionAllowed(true);
        tblCorsi.getTableHeader().setReorderingAllowed(false);
        tblCorsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCorsiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCorsi);
        tblCorsi.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setText("Titolo del Corso:");

        lypCorsi.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypCorsi.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypCorsi.setLayer(txtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lypCorsi.setLayer(jSpinner1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lypCorsiLayout = new javax.swing.GroupLayout(lypCorsi);
        lypCorsi.setLayout(lypCorsiLayout);
        lypCorsiLayout.setHorizontalGroup(
            lypCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lypCorsiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(lypCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addGroup(lypCorsiLayout.createSequentialGroup()
                        .addGroup(lypCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 201, Short.MAX_VALUE)))
                .addContainerGap())
        );
        lypCorsiLayout.setVerticalGroup(
            lypCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lypCorsiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lypCorsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(lypCorsiLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 105, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("CORSI", lypCorsi);

        tblAllievi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome dell'Allievo", "Altri dati"
            }
        ));
        tblAllievi.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tblAllievi);
        tblAllievi.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lypAllievi.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lypAllieviLayout = new javax.swing.GroupLayout(lypAllievi);
        lypAllievi.setLayout(lypAllieviLayout);
        lypAllieviLayout.setHorizontalGroup(
            lypAllieviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lypAllieviLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(307, Short.MAX_VALUE))
        );
        lypAllieviLayout.setVerticalGroup(
            lypAllieviLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lypAllieviLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ALLIEVI", lypAllievi);

        lblStato.setText("Caricamento in corso...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblStato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUscita)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUscita)
                    .addComponent(lblStato))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUscitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUscitaActionPerformed
        // TODO add your handling code here:
        if ( JOptionPane.showConfirmDialog(null, "Confermi?", "Uscita dal programma...", JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)
             ==
             JOptionPane.OK_OPTION )
            
            System.exit(0);
    }//GEN-LAST:event_btnUscitaActionPerformed

    private void tblCorsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCorsiMouseClicked
        // TODO add your handling code here:
        txtNome.setText(tblCorsi.getModel().getValueAt(tblCorsi.getSelectedRow(),0).toString());
    }//GEN-LAST:event_tblCorsiMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        javax.swing.table.DefaultTableModel mdlTblCorsi;

        BufferedReader bffRdr = null;  String line;

        
        mdlTblCorsi = (javax.swing.table.DefaultTableModel) tblCorsi.getModel();
        

        try {

            bffRdr = new BufferedReader( new FileReader("corsi.txt") );
            
            while ( (line = bffRdr.readLine()) != null )
            {
                String[] dati = line.split( "," );

                // Stampa di controllo.
                System.out.println( dati[0] + " , " + dati[1] + " , " + dati[2] + " , " + dati[3] );

                mdlTblCorsi.addRow( new Object[] { dati[0] , dati[1]+"ore, dal "+dati[2]+" al "+dati[3] } );
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bffRdr != null) {
                try {
                    bffRdr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
        javax.swing.table.DefaultTableModel mdlTblAllievi;
        mdlTblAllievi = (javax.swing.table.DefaultTableModel) tblAllievi.getModel();
        mdlTblAllievi.addRow(new Object[] {"Allievo X",""});
        
        lblStato.setText("Caricamento di tutti i dati terminato! Stato: OK");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnUscita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblStato;
    private javax.swing.JLayeredPane lypAllievi;
    private javax.swing.JLayeredPane lypCorsi;
    private javax.swing.JTable tblAllievi;
    private javax.swing.JTable tblCorsi;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
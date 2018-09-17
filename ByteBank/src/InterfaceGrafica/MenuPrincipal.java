/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;


import Codigo.*;



/**
 *
 * @author danie
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    PessoaFisicaTableModel tableModelPF = new PessoaFisicaTableModel();
    PessoaJuridicaTableModel tableModelPJ = new PessoaJuridicaTableModel();
    CadastroPessoaFisica cadastroPF = new CadastroPessoaFisica(tableModelPF);
    CadastroPessoaJuridica cadastroPJ = new CadastroPessoaJuridica(tableModelPJ);
    ConsultaPessoaFisica consultaPF = new ConsultaPessoaFisica(tableModelPF);
    ConsultaPessoaJuridica consultaPJ = new ConsultaPessoaJuridica(tableModelPJ);
    OpcaoCadastroPFOuPJ opcaoCadastro = new OpcaoCadastroPFOuPJ(cadastroPF, cadastroPJ);
    OpcaoConsultaPFOuPJ opcaoConsulta = new OpcaoConsultaPFOuPJ(consultaPF,consultaPJ);
    
    public MenuPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItemMenuCadastrarClientes = new javax.swing.JMenuItem();
        ItemMenuConsultarClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jMenu1.setText("Clientes");

        ItemMenuCadastrarClientes.setText("Cadastrar Clientes");
        ItemMenuCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadastrarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(ItemMenuCadastrarClientes);

        ItemMenuConsultarClientes.setText("Consultar Clientes");
        ItemMenuConsultarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuConsultarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(ItemMenuConsultarClientes);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ItemMenuCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuCadastrarClientesActionPerformed
        opcaoCadastro.setVisible(true);
    }//GEN-LAST:event_ItemMenuCadastrarClientesActionPerformed

    private void ItemMenuConsultarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMenuConsultarClientesActionPerformed
        opcaoConsulta.setVisible(true);
    }//GEN-LAST:event_ItemMenuConsultarClientesActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemMenuCadastrarClientes;
    private javax.swing.JMenuItem ItemMenuConsultarClientes;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

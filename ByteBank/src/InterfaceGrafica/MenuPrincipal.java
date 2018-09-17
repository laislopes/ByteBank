/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;


import Codigo.*;
import javafx.scene.layout.Region;



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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItemMenuCadastrarClientes = new javax.swing.JMenuItem();
        ItemMenuConsultarClientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setResizable(false);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/bytebank.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMenu1.setBackground(new java.awt.Color(0, 102, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/clientes.png"))); // NOI18N
        jMenu1.setText("Clientes");

        ItemMenuCadastrarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro.png"))); // NOI18N
        ItemMenuCadastrarClientes.setText("Cadastrar Clientes");
        ItemMenuCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMenuCadastrarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(ItemMenuCadastrarClientes);

        ItemMenuConsultarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/consulta.png"))); // NOI18N
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

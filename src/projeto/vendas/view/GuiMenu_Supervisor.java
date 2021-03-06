/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.vendas.view;

import projeto.vendas.model.Login;

/**
 *
 * @author Cleiton
 */
public class GuiMenu_Supervisor extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenu_Supervisor
     */
    public GuiMenu_Supervisor(Login login) {
        initComponents();
        this.login = login;
        System.out.println("Numero do Vendedor LOGADO = " + login.getCodigo() + "Nome = " + login.getNome());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Supervisor = new javax.swing.JMenuBar();
        Menu_Cadastro = new javax.swing.JMenu();
        Menu_Cliente = new javax.swing.JMenu();
        MenuItem_Pessoa_Física = new javax.swing.JMenuItem();
        MenuItem_Pessoa_Jurídica = new javax.swing.JMenuItem();
        MenuItem_Vendedor = new javax.swing.JMenuItem();
        Menu_Alterar = new javax.swing.JMenu();
        Menu_Alterar_Cliente_Vendedor = new javax.swing.JMenu();
        MenuItem_Alterar_Cliente = new javax.swing.JMenuItem();
        MenuItem_Alterar_Vendedor = new javax.swing.JMenuItem();
        Menu_Excluir = new javax.swing.JMenu();
        MenuItem_Excluir_Cliente = new javax.swing.JMenuItem();
        MenuItem_Excluir_Vendedor = new javax.swing.JMenuItem();
        Menu_Gerar_Pedido = new javax.swing.JMenu();
        Menu_Emitir_Nota_Fiscal = new javax.swing.JMenu();
        Menu_Consultas = new javax.swing.JMenu();
        MenuItem_Análise_de_Crédito = new javax.swing.JMenuItem();
        MenuItem_Nota_Fiscal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        Menu_Cadastro.setText("Cadastro");

        Menu_Cliente.setText("Cliente");

        MenuItem_Pessoa_Física.setText("Pessoa Física");
        Menu_Cliente.add(MenuItem_Pessoa_Física);

        MenuItem_Pessoa_Jurídica.setText("Pessoa Jurídica");
        Menu_Cliente.add(MenuItem_Pessoa_Jurídica);

        Menu_Cadastro.add(Menu_Cliente);

        MenuItem_Vendedor.setText("Vendedor");
        MenuItem_Vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_VendedorActionPerformed(evt);
            }
        });
        Menu_Cadastro.add(MenuItem_Vendedor);

        Menu_Supervisor.add(Menu_Cadastro);

        Menu_Alterar.setText("Alterar");

        Menu_Alterar_Cliente_Vendedor.setText("Alterar");

        MenuItem_Alterar_Cliente.setText("Cliente");
        Menu_Alterar_Cliente_Vendedor.add(MenuItem_Alterar_Cliente);

        MenuItem_Alterar_Vendedor.setText("Vendedor");
        Menu_Alterar_Cliente_Vendedor.add(MenuItem_Alterar_Vendedor);

        Menu_Alterar.add(Menu_Alterar_Cliente_Vendedor);

        Menu_Excluir.setText("Excluir");

        MenuItem_Excluir_Cliente.setText("Cliente");
        MenuItem_Excluir_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_Excluir_ClienteActionPerformed(evt);
            }
        });
        Menu_Excluir.add(MenuItem_Excluir_Cliente);

        MenuItem_Excluir_Vendedor.setText("Vendedor");
        Menu_Excluir.add(MenuItem_Excluir_Vendedor);

        Menu_Alterar.add(Menu_Excluir);

        Menu_Supervisor.add(Menu_Alterar);

        Menu_Gerar_Pedido.setText("Gerar Pedido");
        Menu_Supervisor.add(Menu_Gerar_Pedido);

        Menu_Emitir_Nota_Fiscal.setText("Emitir Nota Fiscal");
        Menu_Supervisor.add(Menu_Emitir_Nota_Fiscal);

        Menu_Consultas.setText("Consultas");

        MenuItem_Análise_de_Crédito.setText("Análise de Crédito");
        MenuItem_Análise_de_Crédito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_Análise_de_CréditoActionPerformed(evt);
            }
        });
        Menu_Consultas.add(MenuItem_Análise_de_Crédito);

        MenuItem_Nota_Fiscal.setText("Nota Fiscal");
        MenuItem_Nota_Fiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_Nota_FiscalActionPerformed(evt);
            }
        });
        Menu_Consultas.add(MenuItem_Nota_Fiscal);

        Menu_Supervisor.add(Menu_Consultas);

        setJMenuBar(Menu_Supervisor);

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
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem_VendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_VendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_VendedorActionPerformed

    private void MenuItem_Excluir_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_Excluir_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_Excluir_ClienteActionPerformed

    private void MenuItem_Análise_de_CréditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_Análise_de_CréditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_Análise_de_CréditoActionPerformed

    private void MenuItem_Nota_FiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_Nota_FiscalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_Nota_FiscalActionPerformed

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
            java.util.logging.Logger.getLogger(GuiMenu_Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu_Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu_Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu_Supervisor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu_Supervisor(login).setVisible(true);
            }
        });
    }
    
    private static Login login;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItem_Alterar_Cliente;
    private javax.swing.JMenuItem MenuItem_Alterar_Vendedor;
    private javax.swing.JMenuItem MenuItem_Análise_de_Crédito;
    private javax.swing.JMenuItem MenuItem_Excluir_Cliente;
    private javax.swing.JMenuItem MenuItem_Excluir_Vendedor;
    private javax.swing.JMenuItem MenuItem_Nota_Fiscal;
    private javax.swing.JMenuItem MenuItem_Pessoa_Física;
    private javax.swing.JMenuItem MenuItem_Pessoa_Jurídica;
    private javax.swing.JMenuItem MenuItem_Vendedor;
    private javax.swing.JMenu Menu_Alterar;
    private javax.swing.JMenu Menu_Alterar_Cliente_Vendedor;
    private javax.swing.JMenu Menu_Cadastro;
    private javax.swing.JMenu Menu_Cliente;
    private javax.swing.JMenu Menu_Consultas;
    private javax.swing.JMenu Menu_Emitir_Nota_Fiscal;
    private javax.swing.JMenu Menu_Excluir;
    private javax.swing.JMenu Menu_Gerar_Pedido;
    private javax.swing.JMenuBar Menu_Supervisor;
    // End of variables declaration//GEN-END:variables
}

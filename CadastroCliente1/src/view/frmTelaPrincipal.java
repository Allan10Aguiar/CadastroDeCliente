/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Allan Aguiar
 */
public class frmTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmTelaPrincipal
     */
    public frmTelaPrincipal() {  
        
        initComponents();
        
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/img/ic_principal_2.png")).getImage());
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public void abrirPDV(){
        internalPDV obj = new internalPDV();
        painelDesktop.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        itemCadCliente = new javax.swing.JMenuItem();
        itemCadUsuario = new javax.swing.JMenuItem();
        itemCadProd = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemCatalogo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemPDV = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        itemSair = new javax.swing.JMenuItem();
        itemLogin = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemMinimizar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TELA PRINCIPAL");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setIconImages(null);
        setUndecorated(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_loja_2.PNG"))); // NOI18N
        painelDesktop.add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 290);

        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N

        menuCadastro.setText("CADASTRO");
        menuCadastro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        itemCadCliente.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_cliente.png"))); // NOI18N
        itemCadCliente.setText("CLIENTES");
        itemCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadClienteActionPerformed(evt);
            }
        });
        menuCadastro.add(itemCadCliente);

        itemCadUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_usuario.png"))); // NOI18N
        itemCadUsuario.setText("USUÁRIOS");
        itemCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadUsuarioActionPerformed(evt);
            }
        });
        menuCadastro.add(itemCadUsuario);

        itemCadProd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemCadProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_produto.png"))); // NOI18N
        itemCadProd.setText("PRODUTOS");
        itemCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCadProdActionPerformed(evt);
            }
        });
        menuCadastro.add(itemCadProd);

        jMenuBar1.add(menuCadastro);

        jMenu2.setText("CONSULTAS");
        jMenu2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        itemCatalogo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_catalogo24.png"))); // NOI18N
        itemCatalogo.setText("CATÁLOGO");
        itemCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCatalogoActionPerformed(evt);
            }
        });
        jMenu2.add(itemCatalogo);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("CAIXA");
        jMenu3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        itemPDV.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        itemPDV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1400028071_cash_register.png"))); // NOI18N
        itemPDV.setText("PDV");
        itemPDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPDVActionPerformed(evt);
            }
        });
        jMenu3.add(itemPDV);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("SAIR");
        jMenu4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N

        itemSair.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_out.png"))); // NOI18N
        itemSair.setText("SAIR");
        itemSair.setToolTipText("Fechar o sistema");
        itemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSairActionPerformed(evt);
            }
        });
        jMenu4.add(itemSair);

        itemLogin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_cadeado.png"))); // NOI18N
        itemLogin.setText("LOGIN");
        itemLogin.setToolTipText("Voltar para Login");
        itemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemLoginActionPerformed(evt);
            }
        });
        jMenu4.add(itemLogin);
        jMenu4.add(jSeparator1);

        itemMinimizar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        itemMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ic_minimize.png"))); // NOI18N
        itemMinimizar.setText("MINIMIZAR");
        itemMinimizar.setToolTipText("Minimizar a tela");
        itemMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMinimizarActionPerformed(evt);
            }
        });
        jMenu4.add(itemMinimizar);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1919, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelDesktop, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSairActionPerformed

    private void itemCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadClienteActionPerformed
        internalCadCli obj = new internalCadCli();
        painelDesktop.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_itemCadClienteActionPerformed

    private void itemCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadUsuarioActionPerformed
        internalCadUsu obj = new internalCadUsu();
        painelDesktop.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_itemCadUsuarioActionPerformed

    private void itemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLoginActionPerformed
        frmLogin login = new frmLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_itemLoginActionPerformed

    private void itemCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCadProdActionPerformed
        internalCadProd obj = new internalCadProd();
        painelDesktop.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_itemCadProdActionPerformed

    private void itemMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMinimizarActionPerformed
       this.setState(ICONIFIED); //MINIMIZAR
    }//GEN-LAST:event_itemMinimizarActionPerformed

    private void itemPDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPDVActionPerformed
        internalIniciaVenda obj = new internalIniciaVenda();
        painelDesktop.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_itemPDVActionPerformed

    private void itemCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCatalogoActionPerformed
        internalCatalogo obj = new internalCatalogo();
        painelDesktop.add(obj);
        obj.setVisible(true);
        obj.setPosicao();
    }//GEN-LAST:event_itemCatalogoActionPerformed

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
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemCadCliente;
    private javax.swing.JMenuItem itemCadProd;
    private javax.swing.JMenuItem itemCadUsuario;
    private javax.swing.JMenuItem itemCatalogo;
    private javax.swing.JMenuItem itemLogin;
    private javax.swing.JMenuItem itemMinimizar;
    private javax.swing.JMenuItem itemPDV;
    private javax.swing.JMenuItem itemSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuCadastro;
    public static javax.swing.JDesktopPane painelDesktop;
    // End of variables declaration//GEN-END:variables
}
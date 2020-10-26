/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ClienteDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Pessoa;

/**
 *
 * @author Allan Aguiar
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/ic_addCliente2.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        cbSexo = new javax.swing.JComboBox<>();
        btnLogout = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel2.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel3.setText("SEXO:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel4.setText("CPF:");

        txtNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtCpf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnCadastrar.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        cbSexo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE O SEXO", "MASCULINO", "FEMININO" }));

        btnLogout.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1400028250_exit.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbSexo, 0, 298, Short.MAX_VALUE)
                    .addComponent(txtId)
                    .addComponent(txtNome)
                    .addComponent(txtCpf))
                .addContainerGap())
            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        try{
        Pessoa cliente = new Pessoa();
        
        if(txtNome.getText().equals("")){
          JOptionPane.showMessageDialog(null, "Você precisa informar o NOME!", "AVISO!", JOptionPane.WARNING_MESSAGE);
           return;  
        }
        if(txtCpf.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Você precisa informar o CPF!", "AVISO!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        cliente.setNome(txtNome.getText());
        cliente.setCpf(txtCpf.getText());
        
        if(cbSexo.getSelectedItem().equals("SELECIONE O SEXO")){
            JOptionPane.showMessageDialog(null, "Você precisa selecionar o sexo!", "AVISO!", JOptionPane.WARNING_MESSAGE);
            return;
        }
       else if(cbSexo.getSelectedItem().equals("MASCULINO")){
           cliente.setSexo("MASCULINO");
       }else if(cbSexo.getSelectedItem().equals("FEMININO")){
           cliente.setSexo("FEMININO");
       }
        
        ClienteDAO obj = new ClienteDAO();
        
        obj.cadastrar(cliente);
        
        txtNome.setText(null);        
        cbSexo.setSelectedIndex(0);
        txtCpf.setText(null);
        
         JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Aconteceu o erro: " + e);
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        frmLogin login = new frmLogin();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cbSexo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.UsuarioDao;
import DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class CadastLivroUser extends javax.swing.JFrame {

    /**
     * Creates new form CadastLivro
     */
    public CadastLivroUser() {
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

        jPanel1 = new javax.swing.JPanel();
        cadastrolivro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonenter = new javax.swing.JButton();
        buttonback = new javax.swing.JButton();
        InsertAutor = new javax.swing.JTextField();
        InsertTipo = new javax.swing.JTextField();
        InsertNota = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrolivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrolivroActionPerformed(evt);
            }
        });

        jLabel1.setText("Inserir Livro");

        buttonenter.setText("Enter");
        buttonenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonenterActionPerformed(evt);
            }
        });

        buttonback.setText("Back");
        buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonbackActionPerformed(evt);
            }
        });

        InsertNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertNotaActionPerformed(evt);
            }
        });

        jLabel2.setText("Inserir Autor");

        jLabel3.setText("Inserir Tipo");

        jLabel4.setText("Inserir Nota");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonenter)
                        .addGap(22, 22, 22)
                        .addComponent(buttonback))
                    .addComponent(InsertTipo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InsertAutor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrolivro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InsertNota))
                .addGap(0, 142, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cadastrolivro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InsertNota, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonback)
                    .addComponent(buttonenter))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrolivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrolivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrolivroActionPerformed

    private void buttonenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonenterActionPerformed
        String cadastrar_livro, cadastrar_autor, cadastrar_tipo, cadastrar_nota;
        
        cadastrar_livro = cadastrolivro.getText();
        cadastrar_autor = InsertAutor.getText();
        cadastrar_tipo = InsertTipo.getText();
        cadastrar_nota = InsertNota.getText();
        
        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setCadastrar_livro(cadastrar_livro);
        objusuariodto.setCadastrar_autor(cadastrar_autor);
        objusuariodto.setCadastrar_tipo(cadastrar_tipo);
        objusuariodto.setCadastrar_nota(cadastrar_nota);
        
        UsuarioDao objusuariodao = new UsuarioDao();
        
        int rslivrodao = objusuariodao.livroinsert(objusuariodto);
    }//GEN-LAST:event_buttonenterActionPerformed

    private void buttonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonbackActionPerformed
        TelaUsuario user = new TelaUsuario();
        user.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonbackActionPerformed

    private void InsertNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertNotaActionPerformed

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
            java.util.logging.Logger.getLogger(CadastLivroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastLivroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastLivroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastLivroUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastLivroUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InsertAutor;
    private javax.swing.JTextField InsertNota;
    private javax.swing.JTextField InsertTipo;
    private javax.swing.JButton buttonback;
    private javax.swing.JButton buttonenter;
    private javax.swing.JTextField cadastrolivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

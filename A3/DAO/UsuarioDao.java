/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.UsuarioDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 *
 */
public class UsuarioDao {
    
    Connection conn;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto){
        conn = new ConexaoDao().conectaBD();
        
        try{
            String sql = "select * from login_test where nome_admin = ? and senha_admin = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDao: " + erro);
            return null;
            
        
        }
        
        
    }
    
    public ResultSet autenticacaoUsuario2(UsuarioDTO objusuariodto) {
        conn = new ConexaoDao().conectaBD();

        try {
            String sql = "select * from login_user where nome_user = ? and senha_user = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDao: " + erro);
            return null;

        }

    }
    
    public int userinsert(UsuarioDTO objusuariodto){
        conn = new ConexaoDao().conectaBD();
        
        try{
            String sql = "INSERT INTO login_user (nome_user, senha_user, idade_user, sexo_user, livro_user) VALUES(?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objusuariodto.getCadastrar_user());
            pstm.setString(2, objusuariodto.getCadastrar_senha());
            pstm.setString(3, objusuariodto.getIdade_usuario());
            pstm.setString(4, objusuariodto.getSexo_usuario());
            pstm.setString(5, objusuariodto.getLivro_usuario());
            
            int rs = pstm.executeUpdate();
            return rs;
            
        
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDao: " + erro);
            return 0;
            
        
        }
        
        
    }
    
    public int livroinsert(UsuarioDTO objusuariodto){
        conn = new ConexaoDao().conectaBD();
        
        try{
            String sql = "INSERT INTO biblioteca (livro, autor, tipo, media) VALUES(?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objusuariodto.getCadastrar_livro());
            pstm.setString(2, objusuariodto.getCadastrar_autor());
            pstm.setString(3, objusuariodto.getCadastrar_tipo());
            pstm.setString(4, objusuariodto.getCadastrar_nota());
            
            int rs = pstm.executeUpdate();
            return rs;
            
        
        } catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDao: " + erro);
            return 0;
            
        
        }
        
        
    }
    
    public ResultSet autenticacaoUsuario1(UsuarioDTO objusuariodto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

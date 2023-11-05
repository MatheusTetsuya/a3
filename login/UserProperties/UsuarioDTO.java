/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

public class UsuarioDTO {

    private int id_usuario;
    private String nome_usuario, senha_usuario, cadastrar_user, cadastrar_senha;

    /**
     * @return the id_usuario
     */
    public int getId_usuario() {
        return id_usuario;
    }

    /**
     * @param id_usuario the id_usuario to set
     */
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    /**
     * @return the nome_usuario
     */
    public String getNome_usuario() {
        return nome_usuario;
    }

    /**
     * @param nome_usuario the nome_usuario to set
     */
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    /**
     * @return the senha_usuario
     */
    public String getSenha_usuario() {
        return senha_usuario;
    }

    /**
     * @param senha_usuario the senha_usuario to set
     */
    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    /**
     * @return the cadastrar_user
     */
    public String getCadastrar_user() {
        return cadastrar_user;
    }

    /**
     * @param cadastrar_user the cadastrar_user to set
     */
    public void setCadastrar_user(String cadastrar_user) {
        this.cadastrar_user = cadastrar_user;
    }

    /**
     * @return the cadastrar_senha
     */
    public String getCadastrar_senha() {
        return cadastrar_senha;
    }

    /**
     * @param cadastrar_senha the cadastrar_senha to set
     */
    public void setCadastrar_senha(String cadastrar_senha) {
        this.cadastrar_senha = cadastrar_senha;
    }

}

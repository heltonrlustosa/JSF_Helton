/*
 * 
 */

package br.ufop.web.petshop.model;

import java.io.Serializable;

/**
 *
 * @author Fernando B Oliveira <https://github.com/fboliveira>
 * 
 */

public class Cliente implements Serializable, InterfaceModel {
    
    private int id = 0;
    private String nome = "";
    private String login = "";
    private String senha = "";
   



    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getTable() {
        return "alunos";
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

}

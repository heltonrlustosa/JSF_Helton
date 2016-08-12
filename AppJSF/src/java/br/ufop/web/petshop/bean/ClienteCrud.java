/*
 * 
 */
package br.ufop.web.petshop.bean;

import br.ufop.web.petshop.controller.ClienteController;

import br.ufop.web.petshop.model.Cliente;
import br.ufop.web.petshop.model.InterfaceModel;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

/**
 *
 * @author Fernando B Oliveira <https://github.com/fboliveira>
 */
@Named(value = "clienteCrud")
@SessionScoped
public class ClienteCrud implements Serializable {

    private Cliente cliente = new Cliente();


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }





    /**
     * Creates a new instance of ClienteCrud
     */
    public ClienteCrud() {
    }

    public void add() {

        String msg;
        Severity s;
        
        ClienteController clienteController = new ClienteController();
        
      

        if (clienteController.add(cliente)) {
            msg = "Registro inserido com sucesso!";
            s = FacesMessage.SEVERITY_INFO;
            
        } else {
            msg = "O registro não foi inserido. Verifique o erro reportado.";
            s = FacesMessage.SEVERITY_ERROR;
        }

        FacesMessage message = new FacesMessage(s, "Clientes", msg);
        FacesContext.getCurrentInstance().addMessage(null, message);

    }
    
    public void edit( ) {

        String msg;
        Severity s;

        ClienteController clienteController = new ClienteController();
        if (clienteController.edit(cliente)) {
            msg = "Registro editado com sucesso!";
            s = FacesMessage.SEVERITY_INFO;
        } else {
            msg = "O registro não foi editado. Verifique o erro reportado.";
            s = FacesMessage.SEVERITY_ERROR;
        }

        FacesMessage message = new FacesMessage(s, "Clientes", msg);
        FacesContext.getCurrentInstance().addMessage(null, message);

    }
    public void delet( ) {

        String msg;
        Severity s;

        ClienteController clienteController = new ClienteController();
        if (clienteController.delet(cliente)) {
            msg = "Registro deletado com sucesso!";
            s = FacesMessage.SEVERITY_INFO;
        } else {
            msg = "O registro não foi deletado. Verifique o erro reportado.";
            s = FacesMessage.SEVERITY_ERROR;
        }

        FacesMessage message = new FacesMessage(s, "Clientes", msg);
        FacesContext.getCurrentInstance().addMessage(null, message);

    }
    
    
    
    public void get(int id) {
        ClienteController clienteController = new ClienteController();
        this.cliente = (Cliente) clienteController.get(id);
    }

}

/*
 * 
 */
package br.ufop.web.petshop.bean;

import br.ufop.web.petshop.controller.ClienteController;
import br.ufop.web.petshop.model.InterfaceModel;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Fernando B Oliveira <https://github.com/fboliveira>
 */
@Named(value = "clienteBean")
@RequestScoped
public class ClienteBean {

    int id = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Creates a new instance of ClienteBean
     */
    public ClienteBean() {
    }
    
    public List<InterfaceModel> getClientes() {
        ClienteController clienteController = new ClienteController();
        return clienteController.getList();
    }
    
    public void listar(int id) {
        System.out.println("br.ufop.web.petshop.bean.ClienteBean.get() -> id: " +id);
    }
    
}

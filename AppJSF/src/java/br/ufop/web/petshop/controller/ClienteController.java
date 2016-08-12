/*
 * 
 */

package br.ufop.web.petshop.controller;

import br.ufop.web.petshop.dao.ClienteDAO;
import br.ufop.web.petshop.model.Cliente;
import br.ufop.web.petshop.model.InterfaceModel;
import java.util.List;

/**
 *
 * @author Fernando B Oliveira <https://github.com/fboliveira>
 * 
 */

public class ClienteController implements InterfaceController {
    
    @Override
    public List<InterfaceModel> getList() {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.getList();
    }

    @Override
    public InterfaceModel get(int id) {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.get(id);
    }

    @Override
    public boolean add(InterfaceModel item) {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.add(item);
    }
    @Override
    public boolean edit(InterfaceModel item) {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.edit(item);
    }
     
    @Override
    public boolean delet(InterfaceModel item) {
    ClienteDAO clienteDAO = new ClienteDAO();
    return clienteDAO.delet(item);
    }

   

  
   
    
}

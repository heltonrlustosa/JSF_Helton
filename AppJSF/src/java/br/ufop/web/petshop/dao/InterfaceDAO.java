/*
 * 
 */
package br.ufop.web.petshop.dao;

import br.ufop.web.petshop.model.InterfaceModel;
import java.util.List;

/**
 *
 * @author Fernando B Oliveira <https://github.com/fboliveira>
 */
public interface InterfaceDAO {
 
    public List<InterfaceModel> getList();
    public InterfaceModel get(int id);
    public boolean add(InterfaceModel item);  
    public boolean edit(InterfaceModel item); 
    public boolean delet(InterfaceModel item);
    
}

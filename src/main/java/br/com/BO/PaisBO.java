package br.com.BO;

import br.com.DAO.PaisDAO;
import br.com.model.PaisModel;
import java.util.ArrayList;

/**
 * @author Carlos
 */
public class PaisBO {
    
    public PaisModel find(Integer id) throws Exception {
        PaisDAO paisDAO = new PaisDAO();
        
        return paisDAO.find(id);
    }
    
    public void save(PaisModel paisModel) throws Exception {
        PaisDAO paisDAO = new PaisDAO();
        
        paisDAO.save();
    }
    
    public PaisModel update(PaisModel paisModel) throws Exception {
        PaisDAO paisDAO = new PaisDAO();
        
        return paisDAO.update(paisModel);
    }
    
    public ArrayList<PaisModel> getAll() throws Exception {
        PaisDAO paisDAO = new PaisDAO();
        
        return paisDAO.getAll();
    }
}

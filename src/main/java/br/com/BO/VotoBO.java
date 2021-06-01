package br.com.BO;

import br.com.pesistence.VotoDAO;
import br.com.model.VotoModel;
import java.util.ArrayList;

/**
 * @author Carlos
 */
public class VotoBO {
    
    public VotoModel find(Integer id) throws Exception {
        VotoDAO votoDAO = new VotoDAO();
        
        return votoDAO.find(id);
    }
    
    public void save(VotoModel paisModel) throws Exception {
        VotoDAO votoDAO = new VotoDAO();
        
        votoDAO.save(paisModel);
    }
    
    public VotoModel update(VotoModel votoModel) throws Exception {
        VotoDAO votoDAO = new VotoDAO();
        
        return votoDAO.update(votoModel);
    }
    
    public Long getVotosPais1() throws Exception {
        VotoDAO votoDAO = new VotoDAO();
        
        return votoDAO.getVotosPais1();
    }
    
    public Long getVotosPais2() throws Exception {
        VotoDAO votoDAO = new VotoDAO();
        
        return votoDAO.getVotosPais2();
    }
    
    public Long getVotosPais3() throws Exception {
        VotoDAO votoDAO = new VotoDAO();
        
        return votoDAO.getVotosPais3();
    }
    
    public Long getVotosPais4() throws Exception {
        VotoDAO votoDAO = new VotoDAO();
        
        return votoDAO.getVotosPais4();
    }
    
    public Long getVotosPais5() throws Exception {
        VotoDAO votoDAO = new VotoDAO();
        
        return votoDAO.getVotosPais5();
    }
}

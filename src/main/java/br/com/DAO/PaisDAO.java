package br.com.DAO;

import br.com.model.PaisModel;
import br.com.pesistence.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * @author Carlos Daniel
 */
public class PaisDAO {


    // SAVE (INSERT)
    public void save(PaisModel paisModel) throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(paisModel);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro ao inserir dados no banco: " + e.getMessage());
            throw new Exception(e);
        } finally {
            em.close();
        }
    }

    public PaisModel find(Integer id) throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        PaisModel paisModel = null;
        try {
            paisModel = em.find(PaisModel.class, id);
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }
        return paisModel;
    }

    public PaisModel update(PaisModel paisModel) throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        PaisModel estoqueAtualizado = null;
        try {
            em.getTransaction().begin();
            estoqueAtualizado = em.merge(paisModel);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }
        return estoqueAtualizado;
    }

    public void delete(Integer id) throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            PaisModel paisModel = em.find(PaisModel.class, id);
            em.remove(paisModel);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }

    }

    /**
     * Get all Users
     *
     * @return
     */
    @SuppressWarnings("unchecked")
    public ArrayList<PaisModel> getAll() throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        List<PaisModel> paisesList = new ArrayList<>();
        try {
            Query query = em.createQuery("SELECT c FROM PaisModel c");
            paisesList = query.getResultList();
        } catch (Exception e) {
            System.out.println("Erro no GetAll:  " + e.getMessage());
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();

        }
        return (ArrayList<PaisModel>) paisesList;
    }

    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

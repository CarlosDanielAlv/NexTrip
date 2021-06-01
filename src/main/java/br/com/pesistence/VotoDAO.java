package br.com.pesistence;

import br.com.model.VotoModel;
import br.com.pesistence.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 * @author Carlos Daniel
 */
public class VotoDAO {

    // SAVE (INSERT)
    public void save(VotoModel votoModel) throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(votoModel);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Erro ao inserir dados no banco: " + e.getMessage());
            throw new Exception(e);
        } finally {
            em.close();
        }
    }

    public VotoModel find(Integer id) throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        VotoModel votoModel = null;
        try {
            votoModel = em.find(VotoModel.class, id);
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }
        return votoModel;
    }

    public VotoModel update(VotoModel votoModel) throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        VotoModel estoqueAtualizado = null;
        try {
            em.getTransaction().begin();
            estoqueAtualizado = em.merge(votoModel);
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
            VotoModel votoModel = em.find(VotoModel.class, id);
            em.remove(votoModel);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }

    }

    @SuppressWarnings("unchecked")
    public Long getVotosPais1() throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        Long resultado;
        String sql = "SELECT COUNT(c) FROM VotoModel c WHERE c.pais = 1";
        try {
            TypedQuery<Long> query = em.createQuery(sql, Long.class);
            resultado = query.getSingleResult();
        } catch (Exception e) {
            System.out.println("Erro no GetAll: " + e.getMessage());
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }
        return resultado;
    }
    
    public Long getVotosPais2() throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        Long resultado;
        String sql = "SELECT COUNT(c) FROM VotoModel c WHERE c.pais = 2";
        try {
            TypedQuery<Long> query = em.createQuery(sql, Long.class);
            resultado = query.getSingleResult();
        } catch (Exception e) {
            System.out.println("Erro no GetAll: " + e.getMessage());
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }
        return resultado;
    }
    
    public Long getVotosPais3() throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        Long resultado;
        String sql = "SELECT COUNT(c) FROM VotoModel c WHERE c.pais = 3";
        try {
            TypedQuery<Long> query = em.createQuery(sql, Long.class);
            resultado = query.getSingleResult();
        } catch (Exception e) {
            System.out.println("Erro no GetAll: " + e.getMessage());
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }
        return resultado;
    }
    
    public Long getVotosPais4() throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        Long resultado;
        String sql = "SELECT COUNT(c) FROM VotoModel c WHERE c.pais = 4";
        try {
            TypedQuery<Long> query = em.createQuery(sql, Long.class);
            resultado = query.getSingleResult();
        } catch (Exception e) {
            System.out.println("Erro no GetAll: " + e.getMessage());
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }
        return resultado;
    }
    
    public Long getVotosPais5() throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        Long resultado;
        String sql = "SELECT COUNT(c) FROM VotoModel c WHERE c.pais = 5";
        try {
            TypedQuery<Long> query = em.createQuery(sql, Long.class);
            resultado = query.getSingleResult();
        } catch (Exception e) {
            System.out.println("Erro no GetAll: " + e.getMessage());
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();
        }
        return resultado;
    }
    
    @SuppressWarnings("unchecked")
    public ArrayList<VotoModel> tgetAll() throws Exception {
        EntityManager em = HibernateUtil.getEntityManager();
        List<VotoModel> votoList = new ArrayList<>();
        try {
            Query query = em.createQuery("SELECT COUNT(c) FROM VotoModel c WHERE c.pais = 2");
            votoList = query.getResultList();
        } catch (Exception e) {
            System.out.println("Erro no GetAll:  " + e.getMessage());
            em.getTransaction().rollback();
            throw new Exception(e);
        } finally {
            em.close();

        }
        return (ArrayList<VotoModel>) votoList;
    }

}

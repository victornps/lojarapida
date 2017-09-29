package br.senac.rn.lojarapido.util;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;


public abstract class GenericDAO<T> {
    
    protected static EntityManager manager;
    
    public abstract Class<T> getClassType();
    
    public EntityManager getEm(){
        if (manager == null || !manager.isOpen()){
            manager = DataBase.getInstance().getEm();
        }
        return manager;
    }
    
    public T insert(T t){
      EntityManager em = getEm();  
      try{  
        manager.getTransaction().begin();
        manager.persist(t);
        manager.getTransaction().commit();
      }catch(Exception error){
          error.printStackTrace();
          em.getTransaction().rollback();
       }
    return t;
    }
    
    public T delete(T t){
      EntityManager em = getEm();  
      try{  
        manager.getTransaction().begin();
        manager.remove(t);
        manager.getTransaction().commit();
      }catch(Exception error){
          error.printStackTrace();
          em.getTransaction().rollback();
       }
    return t;
    }
    
    public T update(T t){
      EntityManager em = getEm();  
      try{  
        manager.getTransaction().begin();
        manager.merge(t);
        manager.getTransaction().commit();
      }catch(Exception error){
          error.printStackTrace();
          em.getTransaction().rollback();
       }
    return t;
    }
    
    public T selectById(int id){
        EntityManager em = getEm();
        return em.find(getClassType(),id);
    }
    
    public List<T> selectAll(){
        EntityManager em = getEm();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(getClassType());
        TypedQuery<T> typedQuery = em.createQuery(query.select(query.from(getClassType())));
        return typedQuery.getResultList();
    }
}

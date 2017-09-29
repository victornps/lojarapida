package br.senac.rn.lojarapido.dao;

import br.senac.rn.lojarapido.model.Sexo;
import br.senac.rn.lojarapido.util.GenericDAO;


public class SexoDAO extends GenericDAO<Sexo>{
   
    @Override
    public Class<Sexo> getClassType(){
        return Sexo.class;
    }
/*
    public SexoDAO() {
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
        manager = factory.createEntityManager();
    }
    
    public void inserir(Sexo sexo){
        manager.getTransaction().begin();
        manager.persist(sexo);
        manager.getTransaction().commit();
    }
    
    public void excluir(Sexo sexo){
        manager.getTransaction().begin();
        manager.remove(sexo);
        manager.getTransaction().commit();
    }
    
    public void atualizar(Sexo sexo){
        manager.getTransaction().begin();
        manager.merge(sexo);
        manager.getTransaction().commit();
    }
    
    public List<Sexo> buscarTodos(){
        TypedQuery<Sexo> consulta = manager.createQuery("SELECT s FROM Sexo s", Sexo.class);
        return consulta.getResultList();
    }
    
    public Sexo buscarPorId(int id){
        return manager.find(Sexo.class, id);
    }*/
}

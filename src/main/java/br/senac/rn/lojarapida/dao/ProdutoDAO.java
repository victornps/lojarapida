package br.senac.rn.lojarapida.dao;

import br.senac.rn.lojarapida.model.Produto;
import br.senac.rn.lojarapida.util.GenericDAO;



public class ProdutoDAO extends GenericDAO<Produto>{
       
       @Override
    public Class<Produto> getClassType(){
        return Produto.class;
    }
       /*
       private EntityManager manager;
       private EntityManagerFactory factory;
       
       public ProdutoDAO(){
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
         manager = factory.createEntityManager();
       }
       
    public void inserir(Produto produto){
        manager.getTransaction().begin();
        manager.persist(produto);
        manager.getTransaction().commit();
    }
    
    public void excluir(Produto produto){
        manager.getTransaction().begin();
        manager.remove(produto);
        manager.getTransaction().commit();
    }
    
    public void atualizar(Produto produto){
        manager.getTransaction().begin();
        manager.merge(produto);
        manager.getTransaction().commit();
    }
    
    public List<Produto> buscarTodos(){
        TypedQuery<Produto> consulta = manager.createQuery("SELECT p FROM Produto p", Produto.class);
        return consulta.getResultList();
    }
    
    public Produto buscarPorId(int id){
        return manager.find(Produto.class, id);
    }*/
}

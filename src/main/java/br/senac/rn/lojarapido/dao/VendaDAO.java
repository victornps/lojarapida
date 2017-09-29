package br.senac.rn.lojarapido.dao;


import br.senac.rn.lojarapido.model.Venda;
import br.senac.rn.lojarapido.util.GenericDAO;



public class VendaDAO extends GenericDAO<Venda>{
    
    @Override
    public Class<Venda> getClassType(){
        return Venda.class;
    }
    
    
    /*   
    private EntityManager manager;
       private EntityManagerFactory factory;
       
       public VendaDAO(){
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
         manager = factory.createEntityManager();
       }
       
    public void inserir(Venda venda){
        manager.getTransaction().begin();
        manager.persist(venda);
        manager.getTransaction().commit();
        System.out.println("Venda Inserida: "+venda);
        manager.close();
    }
    
    public void excluir(Venda venda){
        manager.getTransaction().begin();
        manager.remove(venda);
        manager.getTransaction().commit();
    }
    
    public void atualizar(Venda venda){
        manager.getTransaction().begin();
        manager.merge(venda);
        manager.getTransaction().commit();
    }
    
    public List<Venda> buscarTodos(){
        TypedQuery<Venda> consulta = manager.createQuery("SELECT v FROM Venda v", Venda.class);
        return consulta.getResultList();
    }
    
    public Venda buscarPorId(int id){
        return manager.find(Venda.class, id);
    }*/
}

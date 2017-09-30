package br.senac.rn.lojarapida.dao;


import br.senac.rn.lojarapida.model.Cliente;
import br.senac.rn.lojarapida.util.GenericDAO;
import java.util.List;
import javax.persistence.TypedQuery;




public class ClienteDAO extends GenericDAO<Cliente>{
    
    @Override
    public Class<Cliente> getClassType(){
        return Cliente.class;
    }
    /*
    private EntityManager manager;
    private EntityManagerFactory factory;
       
       public ClienteDAO(){
        factory = Persistence.createEntityManagerFactory("ConexaoDB");
         manager = factory.createEntityManager();
         
       }
       
    public void inserir(Cliente cliente){
        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();
        System.out.println("Cliente Inserido: "+cliente);
    }
    
    public void excluir(Cliente cliente){
        manager.getTransaction().begin();
        manager.remove(cliente);
        manager.getTransaction().commit();
    }
    
    public void atualizar(Cliente cliente){
        manager.getTransaction().begin();
        manager.merge(cliente);
        manager.getTransaction().commit();
    }
    
    public List<Cliente> buscarTodos(){
        TypedQuery<Cliente> consulta = manager.createQuery("SELECT c FROM Cliente c", Cliente.class);
        return consulta.getResultList();
    }
    
    public Cliente buscarPorId(int id){
        return manager.find(Cliente.class, id);
    }*/
    
    public List<Cliente> buscarPorCpf(String cpf){
        String jpql = "SELECT c FROM Cliente c WHERE c.cpf like :cpfCliente";
        TypedQuery<Cliente> consulta = manager.createQuery(jpql, Cliente.class);
        consulta.setParameter("cpfCliente","%" + cpf + "%");
        return consulta.getResultList();
    }
}

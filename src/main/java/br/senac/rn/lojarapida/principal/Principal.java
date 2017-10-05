package br.senac.rn.lojarapida.principal;

import br.senac.rn.lojarapida.dao.CategoriaDAO;
import br.senac.rn.lojarapida.dao.ClienteDAO;
import br.senac.rn.lojarapida.dao.ProdutoDAO;
import br.senac.rn.lojarapida.dao.SexoDAO;
import br.senac.rn.lojarapida.dao.VendaDAO;
import br.senac.rn.lojarapida.model.Categoria;
import br.senac.rn.lojarapida.model.Cliente;
import br.senac.rn.lojarapida.model.Produto;
import br.senac.rn.lojarapida.model.Sexo;
import br.senac.rn.lojarapida.model.Venda;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Principal {
    
    public static void main(String[] args) {
        
        //System.out.println(new CategoriaDAO().selectAll());
        
        Categoria c1 = new Categoria();
        c1.setNome("Teste");
        c1.setDescricao("Testando");
        CategoriaDAO dao = new CategoriaDAO();
        dao.insert(c1);
        
    }
}

package br.senac.rn.lojarapido.principal;

import br.senac.rn.lojarapido.dao.CategoriaDAO;
import br.senac.rn.lojarapido.dao.ClienteDAO;
import br.senac.rn.lojarapido.dao.ProdutoDAO;
import br.senac.rn.lojarapido.dao.SexoDAO;
import br.senac.rn.lojarapido.dao.VendaDAO;
import br.senac.rn.lojarapido.model.Categoria;
import br.senac.rn.lojarapido.model.Cliente;
import br.senac.rn.lojarapido.model.Produto;
import br.senac.rn.lojarapido.model.Sexo;
import br.senac.rn.lojarapido.model.Venda;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Principal {
    
    public static void main(String[] args) {
        
        Sexo s1 = new Sexo();
        s1.setNome("Indefinido");
        s1.setSigla('I');
        s1.setId(3);
        SexoDAO dao = new SexoDAO();
        //dao.delete(dao.selectById(3));
        System.out.println(dao.selectAll().toString());
        
    }
}

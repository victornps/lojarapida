package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.CategoriaDAO;
import br.senac.rn.lojarapida.dao.ProdutoDAO;
import br.senac.rn.lojarapida.model.Categoria;
import br.senac.rn.lojarapida.model.Produto;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "produtoBean")
public class ProdutoBean {
    
    private Produto produto = new Produto();
    
    public void salvar() {
        ProdutoDAO dao = new ProdutoDAO();
        if (this.produto.getId() == 0) {
            dao.insert(this.produto);
        } else {
            dao.update(this.produto);
        }
        this.produto = new Produto();
    }
    
    public void editar(Produto produto) {
        this.produto = produto;
    }
    
    public void excluir(Produto produto) {
        ProdutoDAO dao = new ProdutoDAO();
        dao.delete(produto);
    }

    public List<Categoria> getCategorias() {
        CategoriaDAO dao = new CategoriaDAO();
        return dao.selectAll();
    }
    
    public List<Produto> getProdutos() {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.selectAll();
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
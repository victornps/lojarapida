package br.senac.rn.lojarapida.controller;

import br.senac.rn.lojarapida.dao.ClienteDAO;
import br.senac.rn.lojarapida.dao.ProdutoDAO;
import br.senac.rn.lojarapida.model.Cliente;
import br.senac.rn.lojarapida.model.Produto;
import br.senac.rn.lojarapida.model.Venda;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "vendaBean")
public class VendaBean {

    private Venda venda = new Venda();
    private Cliente cliente;
    private Produto produto = new Produto();
    
    public void adicionarProduto() {
        this.venda.adicionarProduto(this.produto);
        System.out.println(this.produto);
        this.produto = new Produto();
    }
    
    public List<Produto> getProdutosPorNome(String nome) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.buscarPorNome(nome);
    }

    public List<Cliente> getClientesPorCpf(String cpf) {
        ClienteDAO dao = new ClienteDAO();
        return dao.buscarPorCpf(cpf);
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
    
}
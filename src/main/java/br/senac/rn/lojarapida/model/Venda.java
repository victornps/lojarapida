package br.senac.rn.lojarapida.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Cliente cliente;
    @ManyToMany
    private List<Produto> produtos = new ArrayList<Produto>();
    @Temporal(TemporalType.DATE)
    private Calendar data;
    private float valor;

    public Venda() {}

    public Venda(Cliente cliente, List<Produto> produtos, Calendar data, float valor) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.data = data;
        this.valor = valor;
    }

    public Venda(int id, Cliente cliente, List<Produto> produtos, Calendar data, float valor) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
        this.data = data;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public float getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venda other = (Venda) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Venda{" + "id=" + id + ", cliente=" + cliente + ", produtos=" + produtos + ", valor=" + valor + '}';
    }
    
    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }
    
    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }
    
}
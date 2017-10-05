package br.senac.rn.lojarapida.controller;


import br.senac.rn.lojarapida.dao.SexoDAO;
import br.senac.rn.lojarapida.model.Sexo;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "sexoBean")
public class SexoBean {

    private Sexo sexo = new Sexo();

    public void salvar() {
        SexoDAO dao = new SexoDAO();
        if (this.sexo.getId() == 0){
            dao.insert(this.sexo);
            
        }else{
            dao.update(this.sexo);
        }
        
        this.sexo = new Sexo();
    }
    
    public void editar(Sexo sexo) {
        this.sexo = sexo;
    
    }
        
    
    public void remover(Sexo sexo) {
        SexoDAO dao = new SexoDAO();
        dao.delete(sexo);
    
    }
    
    public List<Sexo> getSexos() {
        SexoDAO dao = new SexoDAO();
        return dao.selectAll();
    }
    
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    
}


package br.senac.rn.lojarapida.converter;

import br.senac.rn.lojarapida.dao.ProdutoDAO;
import br.senac.rn.lojarapida.model.Produto;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "produtoConverter", forClass = Produto.class)
public class ProdutoConverter implements Converter {
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringProduto) {
        if (stringProduto != null) {
            int id = Integer.parseInt(stringProduto);
            ProdutoDAO dao = new ProdutoDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectProduto) {
        if (objectProduto != null) {
            Produto cliente = (Produto) objectProduto;
            return String.valueOf(cliente.getId());
        }
        return null;
    }
    
}

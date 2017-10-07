package br.senac.rn.lojarapida.converter;


import br.senac.rn.lojarapida.dao.ClienteDAO;
import br.senac.rn.lojarapida.model.Cliente;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "clienteConverter", forClass = Cliente.class)
public class ClienteConverter implements Converter {
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String stringCliente) {
        if (stringCliente != null) {
            int id = Integer.parseInt(stringCliente);
            ClienteDAO dao = new ClienteDAO();
            return (Object) dao.selectById(id);
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object objectCliente) {
        if (objectCliente != null) {
            Cliente cliente = (Cliente) objectCliente;
            return String.valueOf(cliente.getId());
        }
        return null;
    }
    
}

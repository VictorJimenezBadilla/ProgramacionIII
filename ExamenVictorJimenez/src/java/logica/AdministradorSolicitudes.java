
package logica;

import datos.ListaSolicitud;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedProperty;
import datos.Solicitud;



/**
 *
 * @author Pc
 */
@ManagedBean
@SessionScoped
public class AdministradorSolicitudes implements Serializable {
 @ManagedProperty(value="#{detallesSolicitudes}")
    DetallesSolicitudes detalles;
    ListaSolicitud laLista;
    
    public AdministradorSolicitudes() {
        laLista = new ListaSolicitud();
        laLista.agregar("Victor", "Operacion", "22/10/17");
        laLista.agregar("Jose", "Factura", "10/10/10");
        
    }
    public ListaSolicitud getLaLista() {
        return laLista;
    }

    public void setLaLista(ListaSolicitud laLista) {
        this.laLista = laLista;
    }

    /*METODOS LLAMADOS DESDE LA PAGINA*/
    public String cargarNuevo() {
        return "nuevo";
    }

    public String detalles(String nom) {
        for (Solicitud e : laLista.getLista()) {
            if (e.getCliente().equals(nom)) {
                detalles.solicitud = e;
                return "detalles";
            }
        }
        return "index";
    }

    /*Getter n' Setter detalles*/
    public DetallesSolicitudes getDetalles() {
        return detalles;
    }

    public void setDetalles(DetallesSolicitudes detalles) {
        this.detalles = detalles;
    }
    
}

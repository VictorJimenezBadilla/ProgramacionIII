/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.Solicitud;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Pc
 */
@ManagedBean
@SessionScoped
public class DetallesSolicitudes {
    Solicitud solicitud;

    public DetallesSolicitudes() {
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }
    
  
    
    public String regresar(){
        return "index";
    }
    
}

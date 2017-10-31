/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Pc
 */
@ManagedBean
@RequestScoped
public class Datos {

    /*REFERENCIA AL MANAGED BEAN PAGINA LISTADO*/
    @ManagedProperty(value="#{administradorSolicitudes}")
            AdministradorSolicitudes administradorSolicitudes;
    
     String cliente, detalleCaso,fecha;
    public Datos() {
    }

    public AdministradorSolicitudes getAdministradorSolicitudes() {
        return administradorSolicitudes;
    }

    public void setAdministradorSolicitudes(AdministradorSolicitudes administradorSolicitudes) {
        this.administradorSolicitudes = administradorSolicitudes;
    }
    
    public String Guardar(){
        /*GUARDAMOS*/
        administradorSolicitudes.laLista.agregar(cliente, fecha, fecha);
        /*Regresamos al index*/
        return "index";
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDetalleCaso() {
        return detalleCaso;
    }

    public void setDetalleCaso(String detalleCaso) {
        this.detalleCaso = detalleCaso;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}

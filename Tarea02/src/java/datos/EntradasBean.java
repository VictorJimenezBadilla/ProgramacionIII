/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Pc
 */
@ManagedBean
@RequestScoped
public class EntradasBean {

    private String nombre;
private String apellido;
private int telefono;
private int cantidadEntradas;
private int cedula;
private String graderia;
private String cantante;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }

    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getGraderia() {
        return graderia;
    }

    public void setGraderia(String graderia) {
        this.graderia = graderia;
    }

    public String getCantante() {
        return cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }
    public EntradasBean() {
    }
    
}

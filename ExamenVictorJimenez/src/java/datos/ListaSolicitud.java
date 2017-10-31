
package datos;

import java.util.ArrayList;


public class ListaSolicitud {
    
    ArrayList<Solicitud> lista;

    public ListaSolicitud() {
        lista = new ArrayList<>();
    }

    public ArrayList<Solicitud> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Solicitud> lista) {
        this.lista = lista;
    }

    public void agregar(String cli, String detCas, String fec) {
        Solicitud e = new Solicitud();
        e.setCliente(cli);
        e.setDetalleCaso(detCas);
        e.setFecha(fec);
        lista.add(e);
    }
}

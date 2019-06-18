/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Yessi
 */
@ManagedBean
@ViewScoped
public class MascotaBean {
    private Mascota mascota;

    public MascotaBean() {
        mascota=new Mascota();
    }
    
    

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    public String guardar(){
        MascotaDao dao = new MascotaDao();
        dao.guardaraMascota(mascota);
        
        return "/RegistroMascota";
    }
    public ArrayList<Mascota> listar(){
        ArrayList<Mascota> milista = new ArrayList<>();
        MascotaDao dao = new MascotaDao();
        milista = dao.listarMascotas();
        return milista;
        
    }
    public String actualizarMascota(){
        MascotaDao dao = new MascotaDao();
        dao.actualizarMascota(mascota);
        return "/RegistroMascota";
    }
   

    public String eliminarMascota(Mascota data) {
        MascotaDao dao = new MascotaDao();
        boolean resp = dao.delete(data);
        if (resp) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Registro Borrado con exito"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("No se elimino correctamente"));
        }
        return "/RegistroMascota";
    }

    public String limpiar() {
        mascota = new Mascota();
        return "/RegistroMascota";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfases;

import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author ASUS
 */
public interface IMascota {
    public abstract void guardaraMascota(Mascota mascota);
    public abstract ArrayList<Mascota> listarMascotas();
    public abstract void actualizarMascota(Mascota mascota);
    public abstract List<Mascota> listarRazaMascotas(Session sesion, String raza) throws Exception;
    public abstract List<Mascota> listarNombreMascota(Session session,String nombreMascota);
    public abstract Integer contarMascotas(Session sesion)throws Exception;
    public abstract boolean delete(Mascota mascota);
 
}

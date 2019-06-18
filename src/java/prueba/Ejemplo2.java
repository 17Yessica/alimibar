/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Utilitarios.HibernateUtil;
import dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Juan Carlos
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Mascota> lista = new ArrayList<>();
        MascotaDao mascotadao = new MascotaDao();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
     /*   lista = mascotadao.listarMascotas(sesion);
        for (Mascota mascota : lista) {
            System.out.println("MASCOTITA: " + mascota.getNombreMascota());

        }*/
    }

}

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
import org.hibernate.Session;

/**
 *
 * @author ASUS
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        MascotaDao mascota = new MascotaDao();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Mascota mimascota = new Mascota(1, "pastor", "thalia", "peruano");
        mascota.actualizarMascota(mimascota);

    }
}



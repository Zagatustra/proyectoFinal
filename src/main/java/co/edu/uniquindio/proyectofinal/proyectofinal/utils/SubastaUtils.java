package co.edu.uniquindio.proyectofinal.proyectofinal.utils;

import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Anunciante;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Comprador;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Subasta;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;

public class SubastaUtils {
    public static Subasta inicializarDatos() {
        Subasta subasta = new Subasta();



        Usuario usu = new Usuario();
        Anunciante anuRel = new Anunciante("Juan","Arias","1023",null);
        Comprador compRel = new Comprador("Juan","Arias","1023",null);
        usu.setUsuario("juan-123");
        usu.setContrasena("arias12342");
        usu.setEmail("juanarias@uq.com");
        usu.setAnunRelacionado(anuRel);
        usu.setCompRelacionado(compRel);
        subasta.getListaUsuarios().add(usu);
        subasta.getListaAnunciantes().add(anuRel);
        subasta.getListaCompradores().add(compRel);

        usu = new Usuario();
        anuRel = new Anunciante("Pedro","Ramirez","10923",null);
        compRel = new Comprador("Pedro","Ramirez","10923",null);
        usu.setUsuario("pedro-123");
        usu.setContrasena("ramirez");
        usu.setEmail("juanramirez@uq.com");
        usu.setAnunRelacionado(anuRel);
        usu.setCompRelacionado(compRel);
        subasta.getListaUsuarios().add(usu);
        subasta.getListaAnunciantes().add(anuRel);
        subasta.getListaCompradores().add(compRel);

        usu = new Usuario();
        anuRel = new Anunciante("Sofi","Ramirez","10922",null);
        compRel = new Comprador("Sofi","Ramirez","10922",null);
        usu.setUsuario("sofi-123");
        usu.setContrasena("ramirez");
        usu.setEmail("sofiramirez@uq.com");
        usu.setAnunRelacionado(new Anunciante("Sofi","Ramirez","10922",null));
        usu.setCompRelacionado(new Comprador("Sofi","Ramirez","10922",null));
        subasta.getListaUsuarios().add(usu);
        subasta.getListaAnunciantes().add(anuRel);
        subasta.getListaCompradores().add(compRel);


        System.out.println("Información del banco creada");
        for(Usuario usuario: subasta.getListaUsuarios()){
            System.out.println(usuario.getAnunRelacionado().getNombre());
        }
        return subasta;
    }
}

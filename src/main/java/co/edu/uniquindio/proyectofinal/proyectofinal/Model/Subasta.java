package co.edu.uniquindio.proyectofinal.proyectofinal.Model;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.ISubastaControlService;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.service.ISubastaService;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;

import java.util.ArrayList;

public class Subasta implements ISubastaService {
    private static final long serialVersionUID = 1L;

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    ArrayList<Anunciante> listaAnunciantes = new ArrayList<>();
    ArrayList<Comprador> listaCompradores = new ArrayList<>();


    public Subasta() {

    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<Comprador> getListaCompradores() {
        return listaCompradores;
    }

    public void setListaCompradores(ArrayList<Comprador> listaCompradores) {
        this.listaCompradores = listaCompradores;
    }

    public ArrayList<Anunciante> getListaAnunciantes() {
        return listaAnunciantes;
    }

    public void setListaAnunciantes(ArrayList<Anunciante> listaAnunciantes) {
        this.listaAnunciantes = listaAnunciantes;
    }


    //FUNCIONES
@Override
    public Usuario crearUsuario(String nombre, String apellido,String identificacion,String usuario, String contrasena, String email) throws UsuarioException {
        Usuario nuevoUsuario = null;
        boolean usuarioExiste = verificarUsuarioExistente(usuario);
        if(usuarioExiste){
            throw new UsuarioException("El usuario ya existe");
        }else{
            nuevoUsuario = new Usuario();
            nuevoUsuario.setUsuario(usuario);
            nuevoUsuario.setContrasena(contrasena);
            nuevoUsuario.setEmail(email);
            listaUsuarios.add(nuevoUsuario);
            Anunciante anunRel = new Anunciante(nombre,apellido,identificacion,null);
            Comprador compRel=new Comprador(nombre,apellido,identificacion,null);
            nuevoUsuario.setCompRelacionado(compRel);
            nuevoUsuario.setAnunRelacionado(anunRel);
        }
        return nuevoUsuario;
    }

    public void agregarUsuario(Usuario nuevoUsuario) throws UsuarioException {
        getListaUsuarios().add(nuevoUsuario);
        getListaAnunciantes().add(nuevoUsuario.getAnunRelacionado());
        for(Usuario usu:listaUsuarios){
            try{
            System.out.println(usu.getAnunRelacionado().getNombre());}
            catch (NullPointerException e){
                System.out.println(usu.getUsuario());
            }
        }
    }
    public void agregarAnunciante(Anunciante nuevoAnunciante) throws UsuarioException {
        getListaAnunciantes().add(nuevoAnunciante);

        for(Anunciante anunciante:listaAnunciantes){
                  System.out.println(anunciante.getNombre());}

    }

    @Override
    public Boolean eliminarUsuario(String cedula, ArrayList<Usuario> listaUsuarios) throws UsuarioException {
        Usuario usuario = null;
        boolean flagExiste = false;
        usuario = obtenerUsuario(cedula,listaUsuarios);
        if(usuario == null)
            throw new UsuarioException("El empleado a eliminar no existe");
        else{
            listaUsuarios.remove(usuario);
            flagExiste = true;
        }
        return flagExiste;
    }


    @Override
    public boolean actualizarUsuario(String usuarioActual, Usuario usuario) throws UsuarioException {

        Usuario usuActual = obtenerUsuario(usuarioActual,listaUsuarios);
        if(usuarioActual == null)
            throw new UsuarioException("El empleado a actualizar no existe");
        else{
            usuActual.setUsuario(usuario.getUsuario());
            usuActual.setContrasena(usuario.getContrasena());
            usuActual.setEmail(usuario.getEmail());
            return true;
        }

    }

    @Override
    public boolean verificarUsuarioExistente(String usu) throws UsuarioException {
        if(usuarioExiste(usu)){
            throw new UsuarioException("El empleado con cedula:a existe");
        }else{
            return false;
        }
    }


    @Override
    public Usuario obtenerUsuario(String usu, ArrayList<Usuario> listaUsuarios){
        Usuario usuarioEncontrado = null;
        for (Usuario usuario : listaUsuarios) {
            if(usuario.getUsuario().equalsIgnoreCase(usu)){
                usuarioEncontrado = usuario;
                break;
            }
        }
        return usuarioEncontrado;
    }
    @Override
    public boolean usuarioExiste(String usu) {
        boolean usuarioEncontrado = false;
        for (Usuario usuario : listaUsuarios) {
            if(usuario.getUsuario().equalsIgnoreCase(usu)){
                usuarioEncontrado = true;
                break;
            }
        }
        return usuarioEncontrado;
    }

    @Override
    public void cambiarInter() {

    }
}


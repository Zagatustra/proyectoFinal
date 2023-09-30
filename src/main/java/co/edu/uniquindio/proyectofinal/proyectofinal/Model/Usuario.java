package co.edu.uniquindio.proyectofinal.proyectofinal.Model;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IUsuarioService;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.SubastaController;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.UsuarioController;

import java.util.ArrayList;

public class Usuario implements IUsuarioService {

    private String usuario;
    private String contrasena;
    private String email;

    private Anunciante anunRelacionado;
    private Comprador compRelacionado;

    public Usuario(){};

    public Usuario(String usuario, String contrasena, String email,
                   Anunciante anunRelacionado, Comprador compRelacionado) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.email = email;
        this.anunRelacionado=anunRelacionado;
        this.compRelacionado=compRelacionado;
    }


    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Anunciante getAnunRelacionado() {
        return anunRelacionado;
    }

    public void setAnunRelacionado(Anunciante anunRelacionado) {
        this.anunRelacionado = anunRelacionado;
    }

    public Comprador getCompRelacionado() {
        return compRelacionado;
    }

    public void setCompRelacionado(Comprador compRelacionado) {
        this.compRelacionado = compRelacionado;
    }

    public Usuario crearUsuario(String usuario, String contrasena, String email, ArrayList<Usuario> listaUsuarios) throws UsuarioException {
        Usuario nuevoUsuario = null;
        boolean usuarioExiste = verificarUsuarioExistente(usuario,listaUsuarios);
        if(usuarioExiste){
            throw new UsuarioException("El usuario ya existe");
        }else{
            nuevoUsuario = new Usuario();
            nuevoUsuario.setUsuario(usuario);
            nuevoUsuario.setContrasena(contrasena);
            nuevoUsuario.setEmail(email);
            listaUsuarios.add(nuevoUsuario);
        }
        return nuevoUsuario;
    }


    public Boolean eliminarUsuario(String cedula,ArrayList<Usuario> listaUsuarios) throws UsuarioException {
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
    public boolean actualizarUsuario(String usuarioActual, Usuario usuario, ArrayList<Usuario> listaUsuarios) throws UsuarioException {
        return false;
    }

/*    @Override
    public boolean actualizarUsuario(String usuarioActual, Usuario usuario,ArrayList<Usuarios> listaUsuarios) throws UsuarioException {

        Usuario usuActual = obtenerUsuario(usuarioActual,listaUsuarios);
        if(usuarioActual == null)
            throw new UsuarioException("El empleado a actualizar no existe");
        else{
            usuActual.setUsuario(usuario.getUsuario());
            usuActual.setContrasena(usuario.getContrasena());
            usuActual.setEmail(usuario.getEmail());
            return true;
        }

    }*/


    public boolean verificarUsuarioExistente(String usu,ArrayList<Usuario> listaUsuarios) throws UsuarioException {
        if(usuarioExiste(usu,listaUsuarios)){
            throw new UsuarioException("El empleado con cedula:a existe");
        }else{
            return false;
        }
    }

    public Usuario obtenerUsuario(String usu,ArrayList<Usuario> listaUsuarios){
    Usuario usuarioEncontrado = null;
        for (Usuario usuario : listaUsuarios) {
        if(usuario.getUsuario().equalsIgnoreCase(usu)){
            usuarioEncontrado = usuario;
            break;
        }
    }
    return usuarioEncontrado;
    }

    public boolean usuarioExiste(String usu,ArrayList<Usuario> listaUsuarios) {
        boolean usuarioEncontrado = false;
        for (Usuario usuario : listaUsuarios) {
            if(usuario.getUsuario().equalsIgnoreCase(usu)){
                usuarioEncontrado = true;
                break;
            }
        }
        return usuarioEncontrado;
    }
}

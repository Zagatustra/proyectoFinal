package co.edu.uniquindio.proyectofinal.proyectofinal.Model;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.ISubastaService;
import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IUsuarioService;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;

import java.util.ArrayList;

public class Subasta implements ISubastaService {
    private static final long serialVersionUID = 1L;
    //ArrayList<Cliente> listaClientes = new ArrayList<>();
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    ArrayList<Anunciante> listaCompradores = new ArrayList<>();
    ArrayList<Comprador> listaAnunciantes = new ArrayList<>();

    public Subasta() {

    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }






    /*

    @Override
    public ArrayList<Empleado> obtenerEmpleados() {
        // TODO Auto-generated method stub
        return getListaEmpleados();
    }

    */
}


package co.edu.uniquindio.proyectofinal.proyectofinal.Controller;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IModelFactoryService;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Subasta;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.SubastaMapper;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.AnuncianteDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.utils.SubastaUtils;

import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class ModelFactoryController implements IModelFactoryService {
    Subasta subasta;
    Usuario usuario;
    SubastaMapper mapper = SubastaMapper.INSTANCE;


    //------------------------------  Singleton ------------------------------------------------
    // Clase estatica oculta. Tan solo se instanciara el singleton una vez
    private static class SingletonHolder {
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    // Método para obtener la instancia de nuestra clase
    public static ModelFactoryController getInstance() {
        return SingletonHolder.eINSTANCE;
    }

    public ModelFactoryController() {
        System.out.println("invocación clase singleton");
        cargarDatosBase();
    }

    private void cargarDatosBase() {
        subasta = SubastaUtils.inicializarDatos();
    }

    public Subasta getSubasta() {
        return subasta;
    }
    public Usuario getUsuario(){return usuario;}
    public void setSubasta(Subasta subasta) {
        this.subasta = subasta;
    }


    @Override
    public List<UsuarioDto> obtenerUsuario() {
        return null;
    }

    @Override
    public List<AnuncianteDto> obtenerAnunciante() {
        return null;
    }

    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto) {
        return false;
    }


    @Override
    public boolean agrergarUsuario(Usuario usuario) {
        return false;
    }

    @Override
    public boolean eliminarUsuario(String usuario) {
        boolean flagExiste = false;
        try {
            flagExiste = getUsuario().eliminarUsuario(usuario,subasta.getListaUsuarios());
        } catch (UsuarioException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flagExiste;
    }

    @Override
    public boolean actualizarUsuario(String usuario, UsuarioDto usuarioDto) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(String usuActual, UsuarioDto usuarioDto,ArrayList<Usuario> listaUsuarios) {
        try {
            Usuario usuario = mapper.usuarioDtoToUsuario(usuarioDto);
            getUsuario().actualizarUsuario(usuActual, usuario,listaUsuarios);
            return true;
        } catch (UsuarioException e) {
            e.printStackTrace();
            return false;
        }
    }
}


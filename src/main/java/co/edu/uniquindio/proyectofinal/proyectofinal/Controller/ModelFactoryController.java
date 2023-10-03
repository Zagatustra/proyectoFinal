package co.edu.uniquindio.proyectofinal.proyectofinal.Controller;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.Service.IModelFactoryService;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Anunciante;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Subasta;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;
import co.edu.uniquindio.proyectofinal.proyectofinal.exepcion.UsuarioException;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.SubastaMapper;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.AnuncianteDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.CompradorDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.utils.SubastaUtils;

import java.util.List;

public class ModelFactoryController implements IModelFactoryService {
    Subasta subasta;
    SubastaMapper mapper = SubastaMapper.INSTANCE;
    Usuario usuario;
    boolean bandera=false;



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
    public List<UsuarioDto> obtenerUsuario() {return  mapper.getUsuariosDto(subasta.getListaUsuarios());}



    public List<CompradorDto> obtenerComprador() {
        return  mapper.getCompradorDto(subasta.getListaCompradores());
    }

    @Override
    public boolean agregarUsuario(UsuarioDto usuarioDto) {
        try {
            if (!subasta.verificarUsuarioExistente(usuarioDto.usuario())) {
                Usuario usuario = mapper.usuarioDtoToUsuario(usuarioDto);
                getSubasta().agregarUsuario(usuario);
                bandera=true;
            }
            return true;
        } catch (UsuarioException e) {
            e.getMessage();
            return false;
        }

    }

    @Override
    public boolean agregarAnunciante(AnuncianteDto anuncianteDto) {
        try {
                Anunciante anuncnainte = mapper.anuncianteDtoToAnunciante(anuncianteDto);
                getSubasta().agregarAnunciante(anuncnainte);

            return true;
        } catch (UsuarioException e) {
            e.getMessage();
            return false;
        }

    }
    @Override
    public boolean eliminarUsuario(String usuario) {
        boolean flagExiste = false;
        try {
            flagExiste = getSubasta().verificarUsuarioExistente(usuario);
        } catch (UsuarioException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flagExiste;
    }

       @Override
    public boolean actualizarUsuario(String usuActual, UsuarioDto usuarioDto) {
        try {
            Usuario usuario = mapper.usuarioDtoToUsuario(usuarioDto);
            getSubasta().actualizarUsuario(usuActual, usuario);
            return true;
        } catch (UsuarioException e) {
            e.printStackTrace();
            return false;
        }
    }
    @Override
    public boolean actualizarInterfaz(){
        return bandera;
        }
}


package co.edu.uniquindio.proyectofinal.proyectofinal;

import co.edu.uniquindio.proyectofinal.proyectofinal.Controller.ModelFactoryController;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.AnuncianteDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.CompradorDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;

import java.util.List;

public class SubastaMain {
    public static void main(String[] args) {
        ModelFactoryController modelFactoryController = ModelFactoryController.getInstance();

        UsuarioDto usuarioDto = new UsuarioDto(
                "juan",
                "arias",
                "546",new AnuncianteDto("Juan","Arias","1234",null),new CompradorDto("Juan","Arias","1234",null)
        );

        if(modelFactoryController.agregarUsuario(usuarioDto)){
            System.out.println("No existe se agrgeo correctamente");
        }else{
            System.out.println("Ya existe");
        }

        List<UsuarioDto> usuarioDtoList = modelFactoryController.obtenerUsuario();
        usuarioDtoList.forEach(System.out::println);
    }
}
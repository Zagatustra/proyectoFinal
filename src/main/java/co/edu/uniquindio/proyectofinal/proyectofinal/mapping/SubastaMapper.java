package co.edu.uniquindio.proyectofinal.proyectofinal.mapping;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Anunciante;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Comprador;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;

import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.AnuncianteDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.CompradorDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;


@Mapper
public interface SubastaMapper {
    SubastaMapper INSTANCE = Mappers.getMapper(SubastaMapper.class);

    @Named("usuarioToUsuarioDto")
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto);
    @IterableMapping(qualifiedByName = "usuarioToUsuarioDto")
    List<UsuarioDto> getUsuarioDtos(ArrayList<Usuario> listaUsuarios);

    default List<UsuarioDto> getUsuariosDto(ArrayList<Usuario> listUsu) {
        List<UsuarioDto> list = new ArrayList<>();
        for(int i=0;i<=listUsu.size()-1;i++){
            list.add(usuarioToUsuarioDto(listUsu.get(i)));
        }
        return list;
    }

    @Named("anuncianteToAnuncianteDto")
    AnuncianteDto anuncianteToAnuncianteDto(Anunciante anunciante);

    Anunciante anuncianteDtoToAnunciante(AnuncianteDto anuncianteDto);

    @Named("getAnunciantesDto")
    List<AnuncianteDto> getAnunciantesDto(ArrayList<Anunciante> listAnu);

    CompradorDto compradorToCompradorDto(Comprador comprador);

    Comprador compradorDtoToComprador(CompradorDto compradorDto);

    List<CompradorDto> getCompradorDto(List<Comprador> comproadorList);
}

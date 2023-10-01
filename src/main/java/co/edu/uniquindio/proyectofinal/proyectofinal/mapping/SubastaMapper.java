package co.edu.uniquindio.proyectofinal.proyectofinal.mapping;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Anunciante;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;

import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.AnuncianteDto;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;

import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
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
    List<UsuarioDto> getUsuarioDto(List<Usuario> listaUsu);

    @Named("anuncianteToAnuncianteDto")
    AnuncianteDto anuncianteToAnuncianteDto(Anunciante anunciante);

    Anunciante anuncianteDtoToAnunciante(AnuncianteDto anuncianteDto);

    @IterableMapping(qualifiedByName = "anuncianteToAnuncianteDto")
    List<AnuncianteDto> getAnuncianteDto(List<Anunciante> anuncianteList);



}

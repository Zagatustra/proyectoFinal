package co.edu.uniquindio.proyectofinal.proyectofinal.mapping;

import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Usuario;
import co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto.UsuarioDto;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Named;

import java.util.List;

@Mapper
public interface SubastaMapper {
    SubastaMapper INSTANCE = new SubastaMapper() {
        @Override
        public UsuarioDto usuarioToUsuarioDto(Usuario usuario) {
            return null;
        }

        @Override
        public Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto) {
            return null;
        }

        @Override
        public List<UsuarioDto> getUsuarioDto(List<Usuario> listaUsu) {
            return null;
        }
    };
    @Named("usuarioToUsuarioDto")
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);
    Usuario usuarioDtoToUsuario(UsuarioDto usuarioDto);
    @IterableMapping(qualifiedByName = {"usuarioToUsuario", "usuarioDtoToUsuarioDto"})
    List<UsuarioDto> getUsuarioDto(List<Usuario> listaUsu);

}

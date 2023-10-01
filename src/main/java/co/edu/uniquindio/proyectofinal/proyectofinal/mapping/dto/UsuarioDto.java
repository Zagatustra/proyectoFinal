package co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto;

import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Anunciante;
import co.edu.uniquindio.proyectofinal.proyectofinal.Model.Comprador;

public record UsuarioDto(

        String usuario,
        String contrasena,
        String email,
        AnuncianteDto anunRelacionado,
        CompradorDto comRelacionado) {
}

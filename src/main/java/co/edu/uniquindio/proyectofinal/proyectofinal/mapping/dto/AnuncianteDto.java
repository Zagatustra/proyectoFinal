package co.edu.uniquindio.proyectofinal.proyectofinal.mapping.dto;

import java.util.Date;

public record AnuncianteDto(
        String nombre,
        String apellido,
        String identificacion,
        Date fechaNac
) {
}

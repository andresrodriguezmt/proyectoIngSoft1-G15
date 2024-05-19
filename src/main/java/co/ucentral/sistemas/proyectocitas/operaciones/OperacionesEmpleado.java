package co.ucentral.sistemas.proyectocitas.operaciones;

import co.ucentral.sistemas.proyectocitas.entidadesdto.EmpleadoDto;

public interface OperacionesEmpleado {

    public EmpleadoDto crear(EmpleadoDto empleadoDto);

    public EmpleadoDto autenticarPorCedulayContrasenia(String cedula, String contrasenia);
}


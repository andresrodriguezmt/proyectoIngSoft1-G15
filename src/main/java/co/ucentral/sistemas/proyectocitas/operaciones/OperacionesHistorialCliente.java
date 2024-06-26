package co.ucentral.sistemas.proyectocitas.operaciones;

import co.ucentral.sistemas.proyectocitas.entidadesdto.HistorialClienteDto;
import co.ucentral.sistemas.proyectocitas.entidadesdto.ReporteEmpleadoCantidadAtendidoDto;
import co.ucentral.sistemas.proyectocitas.entidadesdto.ReporteServicioMasUsadoDto;
import co.ucentral.sistemas.proyectocitas.entidadesdto.ReporteTiempoPromedioAtencionDto;

import java.util.List;

public interface OperacionesHistorialCliente {

    public HistorialClienteDto crear(HistorialClienteDto historialClienteDto);

    public List<HistorialClienteDto> buscarTodos();

    public ReporteServicioMasUsadoDto reporteServicioMasUsado(long idSede);

    public ReporteTiempoPromedioAtencionDto reporteTiempoPromedioAtencion(int numeroCitas, int idSede, int idServicio);

    public ReporteEmpleadoCantidadAtendidoDto reporteEmpleadoMasClienteAtendido();


    public ReporteEmpleadoCantidadAtendidoDto reporteEmpleadoMenosClienteAtendido();
}

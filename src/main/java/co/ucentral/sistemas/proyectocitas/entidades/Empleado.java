package co.ucentral.sistemas.proyectocitas.entidades;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "EMPLEADO")
@ToString
@Builder
@Entity
public class Empleado {

    @Id
    @Column(name = "EMP_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EMPLEADO")
    @SequenceGenerator(name = "SEQ_EMPLEADO", sequenceName = "SEQ_EMPLEADO", allocationSize = 1)
    private int idEmpleado;

    @Column(name = "EMP_NOMBRE", nullable = false)
    private String nombre;

    @Column(name = "EMP_EDAD", nullable = false)
    private int edad;

    @Column(name = "EMP_ESTADO", nullable = false)
    private String estado;

    @Column(name = "EMP_CEDULA", nullable = false)
    private String cedula;

    @Column(name = "EMP_CONTRASENIA", nullable = false)
    private String contrasenia;

    @Column(name = "EMP_MODULO", nullable = false)
    private int modulo;

    @ManyToOne
    @JoinColumn(name = "SED_ID")
    private Sede sede;

    @ManyToOne
    @JoinColumn(name = "SER_ID")
    private Servicio servicio;

}



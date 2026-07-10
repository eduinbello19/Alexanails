package model;

public class Cita
{
    //Atributos
    private int id_cita;
    private String fecha;
    private String hora;
    private String estado;
    private int id_cliente;
    private int id_empleado;
    private int id_servicio;

    // Constructor
    public Cita(int id_cita, String fecha, String hora, String estado,
                int id_cliente, int id_empleado, int id_servicio) {

        this.id_cita = id_cita;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.id_servicio = id_servicio;

}

package model;

public class Cita
{
    // Atributos
    private int id_cita;
    private String fecha;
    private String hora;
    private String estado;
    private int id_cliente;
    private int id_empleado;
    private int id_servicio;

    // Constructor
    public Cita(int id_cita, String fecha, String hora, String estado,
                int id_cliente, int id_empleado, int id_servicio)
    {
        this.id_cita = id_cita;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.id_servicio = id_servicio;
    }

    // Getters
    public int getId_cita()
    {
        return id_cita;
    }

    public String getFecha()
    {
        return fecha;
    }

    public String getHora()
    {
        return hora;
    }

    public String getEstado()
    {
        return estado;
    }

    public int getId_cliente()
    {
        return id_cliente;
    }

    public int getId_empleado()
    {
        return id_empleado;
    }

    public int getId_servicio()
    {
        return id_servicio;
    }

    // Setters
    public void setId_cita(int id_cita)
    {
        this.id_cita = id_cita;
    }

    public void setFecha(String fecha)
    {
        this.fecha = fecha;
    }

    public void setHora(String hora)
    {
        this.hora = hora;
    }

    public void setEstado(String estado)
    {
        this.estado = estado;
    }

    public void setId_cliente(int id_cliente)
    {
        this.id_cliente = id_cliente;
    }

    public void setId_empleado(int id_empleado)
    {
        this.id_empleado = id_empleado;
    }

    public void setId_servicio(int id_servicio)
    {
        this.id_servicio = id_servicio;
    }
}

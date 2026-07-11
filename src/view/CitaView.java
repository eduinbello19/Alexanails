package view;

import connection.Conexion;
import controller.CitaController;
import model.Cita;

import javax.swing.*;
import java.util.ArrayList;

public class CitaView
{
    CitaController citaController = new CitaController();
    Conexion conexion = new Conexion();

    // Metodo mostrar
    public void mostrar()
    {
        ArrayList<Cita> listaCitas = new ArrayList<>();

        listaCitas = citaController.mostrar();

        for (Cita cita : listaCitas)
        {
            System.out.println("ID: " + cita.getId_cita());
            System.out.println("Fecha: " + cita.getFecha());
            System.out.println("Hora: " + cita.getHora());
            System.out.println("Estado: " + cita.getEstado());
            System.out.println("ID Cliente: " + cita.getId_cliente());
            System.out.println("ID Empleado: " + cita.getId_empleado());
            System.out.println("ID Servicio: " + cita.getId_servicio());
            System.out.println("----------------------------");
        }
    }


    // Metodo agregar
    public void agregar()
    {
        String fecha = JOptionPane.showInputDialog("Ingrese la fecha de la cita:");
        String hora = JOptionPane.showInputDialog("Ingrese la hora de la cita:");
        String estado = JOptionPane.showInputDialog("Ingrese el estado de la cita:");

        int id_cliente = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el ID del cliente:"));

        int id_empleado = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el ID del empleado:"));

        int id_servicio = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese el ID del servicio:"));

        Cita cita = new Cita(
                0,
                fecha,
                hora,
                estado,
                id_cliente,
                id_empleado,
                id_servicio
        );

        citaController.agregar(cita);
    }


    // Metodo eliminar
    public void eliminar()
    {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la cita que desea eliminar:"));
        citaController.eliminar(id);
    }


    //Metodo actualizar
    public void actualizar()
    {
        int id_cita = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la cita a actualizar:"));
        String fecha = JOptionPane.showInputDialog("Ingrese la nueva fecha:");
        String hora = JOptionPane.showInputDialog("Ingrese la nueva hora:");
        String estado = JOptionPane.showInputDialog("Ingrese el nuevo estado:");
        int id_cliente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo ID del cliente:"));
        int id_empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo ID del empleado:"));
        int id_servicio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo ID del servicio:"));

        Cita cita = new Cita(id_cita, fecha, hora, estado, id_cliente, id_empleado, id_servicio);

        citaController.actualizar(cita);
    }


    // pvsm para pruebas
    public static void main(String[] args)
    {
        CitaView citaView = new CitaView();
        citaView.eliminar();
    }
}

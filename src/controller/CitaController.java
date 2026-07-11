package controller;

import connection.Conexion;
import model.Cita;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CitaController
{
    //Creación de la conexión
    private Conexion conexion = new Conexion();

    //Metodo agregar
    public void agregar(Cita cita)
    {
        Connection con = conexion.getConexion();

        String query = "INSERT INTO cita (fecha, hora, estado, id_cliente, id_empleado, id_servicio) VALUES (?,?,?,?,?,?)";

        try
        {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, cita.getFecha());
            pst.setString(2, cita.getHora());
            pst.setString(3, cita.getEstado());
            pst.setInt(4, cita.getId_cliente());
            pst.setInt(5, cita.getId_empleado());
            pst.setInt(6, cita.getId_servicio());

            int resultado = pst.executeUpdate();

            if (resultado > 0)
            {
                JOptionPane.showMessageDialog(null, "Cita agregada correctamente.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Hubo un error al agregar la cita.");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    //metodo eliminar
    public void eliminar(int id)
    {
        Connection con = conexion.getConexion();

        String query = "DELETE FROM cita WHERE id_cita = ?";

        try
        {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1,id);

            int resultado = pst.executeUpdate();

            if (resultado > 0)
            {
                JOptionPane.showMessageDialog(null, "Cita eliminada correctamente.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Hubo un error al eliminar la cita.");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    //metodo actualizar

    public void actualizar(Cita cita)
    {
        Connection con = conexion.getConexion();

        String query = "UPDATE cita SET fecha = ?, hora = ?, estado = ?, id_cliente = ?, id_empleado = ?, id_servicio = ? WHERE id_cita = ?";

        try
        {
            PreparedStatement pst = con.prepareStatement(query);

            pst.setString(1, cita.getFecha());
            pst.setString(2, cita.getHora());
            pst.setString(3, cita.getEstado());
            pst.setInt(4, cita.getId_cliente());
            pst.setInt(5, cita.getId_empleado());
            pst.setInt(6, cita.getId_servicio());

            pst.setInt(7,cita.getId_cita());

            int resultado = pst.executeUpdate();

            if (resultado > 0)
            {
                JOptionPane.showMessageDialog(null, "Cita actualizado correctamente.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Hubo un error al actualizar la cita.");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}

package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion
{
    public Connection getConexion()
    {
        Connection con = null;

        try
        {
            //asi es en nuestro caso
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alexa_nails_app","root","");
            //en el caso del mack el XAMP corre por el 8889
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //retorna la conexion
        return  con;
    }
}

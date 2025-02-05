/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventanas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class Query {
    private static final String URL = "jdbc:postgresql://aws-0-us-west-1.pooler.supabase.com:5432/postgres";
    private static final String USER = "postgres.evyxcvhqzgimicjtbjpw";
    private static final String PASSWORD = "player88";
    private static Connection con;
    public static void initializeConnection() throws SQLException {
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión establecida correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexión: " + e.getMessage());
            throw e;
        }
    }

    // Manejo de reconexión
    private static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                initializeConnection();
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la conexión: " + e.getMessage());
        }
        return con;
    }
    public void agregarMueble(Mueble mueble) {
        String sql = "INSERT INTO mueble (id_mueble, modelo, tipo, material, precio_venta, descripcion) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
            pstmt.setInt(1, mueble.getID_Mueble());
            pstmt.setString(2, mueble.getModelo());
            pstmt.setString(3, mueble.getTipo());
            pstmt.setString(4, mueble.getMaterial());
            pstmt.setString(5, mueble.getPrecio_Venta()); // Suponiendo que el precio es un BigDecimal
            pstmt.setString(6, mueble.getDescripcion());

            pstmt.executeUpdate();
            System.out.println("Datos del mueble añadidos correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al insertar datos del mueble: " + e.getMessage());
        }
    }
    public void agregarUsuario(String nombre, String correo,String contra){
    String sql = "INSERT INTO usuario (id_usuario, nombre, correo_usuario, contrasena) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
            int IDU=codMaxUsuario()+1;
            pstmt.setInt(1, IDU);
            pstmt.setString(2, nombre);
            pstmt.setString(3, correo);
            pstmt.setString(4, contra);
            pstmt.executeUpdate();
            System.out.println("Datos del mueble añadidos correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al insertar datos del mueble: " + e.getMessage());
        }
    }
    public int codMaxUsuario(){
        int maxID = 0;
        String query = "SELECT MAX(id_usuario) AS MaxID FROM usuario"; // Reemplaza con el nombre real de tu tabla
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                maxID = rs.getInt("MaxID");
                System.out.println("El valor máximo de ID_Usuario es: " + maxID);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maxID;
    }
    public void mostrarMensaje(String mensaje) {
  
        JFrame frame = new JFrame("Mensaje");
        JPanel panel = new JPanel();
        JLabel label = new JLabel(mensaje);
        
        panel.add(label);
        frame.add(panel);

        frame.setSize(300, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Crear un temporizador para cerrar el panel después de 3 segundos
        Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    public int codMax(){
        int maxID = 0;
        String query = "SELECT MAX(id_mueble) AS MaxID FROM mueble"; // Reemplaza con el nombre real de tu tabla
        try (Statement stmt = getConnection().createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            if (rs.next()) {
                maxID = rs.getInt("MaxID");
                System.out.println("El valor máximo de ID_Muebles es: " + maxID);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maxID;
    }
    public javax.swing.JTable cargarDatosEnTabla(javax.swing.JTable tabla) {
        String sql = "SELECT id_mueble, modelo, tipo, material, precio_venta, descripcion FROM mueble";
        try (PreparedStatement statement = getConnection().prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            DefaultTableModel model = (DefaultTableModel) tabla.getModel();
            model.setRowCount(0); // Limpiar tabla antes de agregar datos
            while (resultSet.next()) {
                Object[] row = new Object[6];
                row[0] = resultSet.getInt("id_mueble");
                row[1] = resultSet.getString("modelo");
                row[2] = resultSet.getString("tipo");
                row[3] = resultSet.getString("material");
                row[4] = resultSet.getDouble("precio_venta");
                row[5] = resultSet.getString("descripcion");
                model.addRow(row);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tabla;
}
    public void eliminarMueble(Mueble mueble) {
    String sql = "DELETE FROM mueble WHERE id_mueble = ?";
    try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
        pstmt.setInt(1, mueble.getID_Mueble());
        int affectedRows = pstmt.executeUpdate();
        if (affectedRows > 0) {
            mostrarMensaje("Mueble eliminado correctamente.");
        } else {
            mostrarMensaje("No se encontró ningún mueble con el ID proporcionado.");
        }
    } catch (SQLException e) {
        System.out.println("Error al eliminar el mueble: " + e.getMessage());
    }
}
    public List<Mueble> obtenerPrimeros4Muebles() {
    String sql = "SELECT id_mueble, modelo, tipo, material, precio_venta, descripcion FROM mueble LIMIT 4";
    List<Mueble> muebles = new ArrayList<>();

    try (PreparedStatement pstmt = getConnection().prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {
        while (rs.next()) {
            int idMueble = rs.getInt("id_mueble");
            String modelo = rs.getString("modelo");
            String tipo = rs.getString("tipo");
            String material = rs.getString("material");
            Double precioVenta =rs.getDouble("precio_venta");
            String PreciV=precioVenta.toString();
            String descripcion = rs.getString("descripcion");

            Mueble mueble = new Mueble(idMueble, modelo, tipo, material, PreciV, descripcion);
            muebles.add(mueble);
        }

        System.out.println("Los primeros 4 muebles fueron obtenidos correctamente.");

    } catch (SQLException e) {
        System.out.println("Error al obtener los muebles: " + e.getMessage());
    }

    return muebles;
}
    public List<Mueble> obtenerSiguientes4Muebles(int offset) {
    String sql = "SELECT id_mueble, modelo, tipo, material, precio_venta, descripcion FROM mueble LIMIT 4 OFFSET ?";
    List<Mueble> muebles = new ArrayList<>();

    try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
        pstmt.setInt(1, offset);
        try (ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int idMueble = rs.getInt("id_mueble");
                String modelo = rs.getString("modelo");
                String tipo = rs.getString("tipo");
                String material = rs.getString("material");
                Double precioVenta =rs.getDouble("precio_venta");
                String PreciV=precioVenta.toString();
                String descripcion = rs.getString("descripcion");

                Mueble mueble = new Mueble(idMueble, modelo, tipo, material, PreciV, descripcion);
                muebles.add(mueble);
            }
        }
        System.out.println("Los siguientes 4 muebles fueron obtenidos correctamente.");
    } catch (SQLException e) {
        System.out.println("Error al obtener los muebles: " + e.getMessage());
    }
    return muebles;
    }
    
    public List<Mueble> obtenerSiguientes4MueblesPorTipo(int offset, String tipoMueble) {
    String sql = "SELECT id_mueble, modelo, tipo, material, precio_venta, descripcion FROM mueble WHERE tipo = ? LIMIT 4 OFFSET ?";
    List<Mueble> muebles = new ArrayList<>();
    try (PreparedStatement pstmt = getConnection().prepareStatement(sql)) {
        pstmt.setString(1, tipoMueble);
        pstmt.setInt(2, offset);
        try (ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                int idMueble = rs.getInt("id_mueble");
                String modelo = rs.getString("modelo");
                String tipo = rs.getString("tipo");
                String material = rs.getString("material");
                Double precioVenta = rs.getDouble("precio_venta");
                String PreciV = precioVenta.toString();
                String descripcion = rs.getString("descripcion");
                Mueble mueble = new Mueble(idMueble, modelo, tipo, material, PreciV, descripcion);
                muebles.add(mueble);
            }
        }
        System.out.println("Los siguientes 4 muebles del tipo '" + tipoMueble + "' fueron obtenidos correctamente.");
    } catch (SQLException e) {
        System.out.println("Error al obtener los muebles: " + e.getMessage());
    }
    return muebles;
    }
    public String buscarAdmim(String correo, String contrase) {
        String nombre = "";
        String query = "SELECT u.nombre FROM usuario u, administrador a " +
                       "WHERE u.correo_usuario = ? AND u.contrasena = ? AND u.id_usuario = a.id_usuario";
        
        try (PreparedStatement pstmt = getConnection().prepareStatement(query)) {
            pstmt.setString(1, correo);
            pstmt.setString(2, contrase);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    nombre = rs.getString("nombre");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return nombre;
    }
    public int IDAdministrador(String correo,String contrase){
    int res=999;
        String query = "SELECT a.id_admin FROM usuario u, administrador a " +
                       "WHERE u.correo_usuario = ? AND u.contrasena = ? AND u.id_usuario = a.id_usuario";
        
        try (PreparedStatement pstmt = getConnection().prepareStatement(query)) {
            pstmt.setString(1, correo);
            pstmt.setString(2, contrase);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                  res = rs.getInt("id_admin");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return res;
    }
    public String buscarUsuario(String correo, String contrase) {
        String nombre = "";
        String query = "SELECT nombre FROM usuario " +
                       "WHERE correo_usuario = ? AND contrasena = ?";
        
        try (PreparedStatement pstmt = getConnection().prepareStatement(query)) {
            pstmt.setString(1, correo);
            pstmt.setString(2, contrase);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    nombre = rs.getString("nombre");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return nombre;
    }
    public int IDUsuario(String correo,String contrase){
    int res=999;
        String query = "SELECT id_usuario FROM usuario u " +
                       "WHERE u.correo_usuario = ? AND u.contrasena = ?";
        try (PreparedStatement pstmt = getConnection().prepareStatement(query)) {
            pstmt.setString(1, correo);
            pstmt.setString(2, contrase);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                  res = rs.getInt("id_usuario");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    return res;
    }
}
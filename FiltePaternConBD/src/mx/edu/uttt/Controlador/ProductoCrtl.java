/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.Controlador;


import mx.edu.uttt.Conexion.ConexionBD;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mx.edu.uttt.Filter.Entidad.Modelo.BD;


/**
 *
 * @author moy-c
 */
public class ProductoCrtl {
    public boolean Insertar(BD obj)
    {
    BD pro= (BD)(obj);
     String query = "Insert into productos values (?,?,?,?,?)";
      try {
            Connection con = new ConexionBD().obtenerConexion();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, pro.getId());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getDescripcion());
            ps.setInt(4, pro.getStock());
            ps.setString(5,pro.getProveedor());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
    public boolean Actualizar(BD obj)
    {
    
       BD pro = (BD) (obj);
          Connection con = new ConexionBD().obtenerConexion();
        String query = "update productos set Descripcion=?, STOCK=?,proveedor=? where nombre=? ";
        try {
            PreparedStatement ps = con.prepareStatement(query);
           
            ps.setString(1, pro.getDescripcion());
            ps.setInt(2, pro.getStock());
            ps.setString(3, pro.getProveedor());
            ps.setString(4, pro.getNombre());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    } 
    public boolean Eliminar(BD obj)
    {
   BD pro = (BD) (obj);
        Connection con =new ConexionBD().obtenerConexion();
        String query = "Delete from Productos where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, pro.getNombre());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
 }
    
    public Object consultar() {
        Connection con =new ConexionBD().obtenerConexion();
        ArrayList<BD> lista = new ArrayList<>();

        String query = "select id,nombre,descripcion,stock,proveedor from producto";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               BD producto = new BD();
                producto.setId(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setDescripcion(rs.getString(3));
                producto.setStock(rs.getInt(4));
                producto.setProveedor(rs.getString(5));
                lista.add(producto);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return lista;
    }
    
 
    public List<Object> Consultar()
    {
        return null;
    }
}

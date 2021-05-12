package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import cursoJava.Cuadrado;
import util.ConnectionManager;

public class FiguraDao implements DAO {

	@Override
	public void agregar(Object obj) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConexion();
		//armar el sql de acuerdo a la figura 
		StringBuilder sql = new StringBuilder("insert into figuras(fig_nombre,fig_tipo,");
		PreparedStatement stm=null ;
		if (obj instanceof Cuadrado){
			Cuadrado cua = (Cuadrado)obj;
			sql.append("fig_lado) values(?,?,?)");
			
			stm = con.prepareStatement(sql.toString());
			stm.setString(1, cua.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, cua.getLado());
		}
			
		stm.execute();
		stm.close();
		con.close();
	}

	@Override
	public void eliminar(Object obj) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConexion();
		//armar el sql de acuerdo a la figura 
		StringBuilder sql = new StringBuilder("insert into figuras(fig_nombre,fig_tipo,");
		PreparedStatement stm=null ;
		if (obj instanceof Cuadrado){
			Cuadrado cua = (Cuadrado)obj;
			sql.append("fig_lado) values(?,?,?)");
			
			stm = con.prepareStatement(sql.toString());
			stm.setString(1, cua.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, cua.getLado());
		}
			
		stm.execute();
		stm.close();
		con.close();

	}

	@Override
	public void modificar(Object obj) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConexion();
		//armar el sql de acuerdo a la figura 
		StringBuilder sql = new StringBuilder("insert into figuras(fig_nombre,fig_tipo,");
		PreparedStatement stm=null ;
		if (obj instanceof Cuadrado){
			Cuadrado cua = (Cuadrado)obj;
			sql.append("fig_lado) values(?,?,?)");
			
			stm = con.prepareStatement(sql.toString());
			stm.setString(1, cua.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, cua.getLado());
		}
			
		stm.execute();
		stm.close();
		con.close();

	}

	@Override
	public List leer(Object obj) throws ClassNotFoundException, SQLException {
		ConnectionManager.conectar();
		Connection con = ConnectionManager.getConexion();
		//armar el sql de acuerdo a la figura 
		StringBuilder sql = new StringBuilder("insert into figuras(fig_nombre,fig_tipo,");
		PreparedStatement stm=null ;
		if (obj instanceof Cuadrado){
			Cuadrado cua = (Cuadrado)obj;
			sql.append("fig_lado) values(?,?,?)");
			
			stm = con.prepareStatement(sql.toString());
			stm.setString(1, cua.getNombre());
			stm.setInt(2, 1);
			stm.setFloat(3, cua.getLado());
		}
			
		stm.execute();
		stm.close();
		con.close();
		return null;
	}

}

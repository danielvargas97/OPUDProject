package datos.usuario.usuario;

import datos.conexion.implementacion.ConexionOracle;
import datos.conexion.interfaz.ConexionDB;
import logica.usuario.usuario.UsuarioOPUD;

public class UsuarioCRUD {
	private ConexionDB conex;
	private UsuarioOPUD usrOpud;
	public UsuarioCRUD() {
		
	}
	
	public void insertar() {
		conex = ConexionOracle.getInstance();
		String sqlComm = "INSERT INTO USUARIO VALUES";
	}
}

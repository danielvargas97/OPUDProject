package logica.objeto.condicion;

public interface iCondicionable {
	public String verFechaCondicion();
	public String verNombreCondicion();
	public String verEstadoCondicion();
	public void cambiarEstadoCondicion(boolean condicion);
}

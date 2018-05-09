package logica.objeto.condicion;

import java.text.DateFormat;
import java.util.Date;

public abstract class Condicion implements iCondicionable {
	protected Date fecha;
	protected String nombre;
	
	
	public Condicion() {
		this.fecha = new Date();
	}
	
	public Condicion(String fecha) {
		DateFormat conversorFecha =  DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		
		try{
			this.fecha = conversorFecha.parse(fecha);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}		
	}
	
	protected String formatearFecha() {
		DateFormat conversorFecha =  DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		String fecha = conversorFecha.format(this.fecha);
		return fecha;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}

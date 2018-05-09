package logica.objeto.condicion;

public class Hallado extends Condicion{
	private boolean devuelto;
	
	public Hallado() {
		super();
		setNombre("Hallado");
	}
	
	public Hallado(String fecha) {
		super(fecha);
	}
	
	@Override
	public String verFechaCondicion() {
		return formatearFecha();
	}

	@Override
	public String verNombreCondicion() {
		// TODO Auto-generated method stub
		return getNombre();
	}

	@Override
	public String verEstadoCondicion() {
		if(devuelto) {
			return getNombre();
			
		}
		else {
			
			return "No "+ getNombre();
		}
	}

	@Override
	public void cambiarEstadoCondicion(boolean condicion) {
		this.devuelto = condicion;
		
	}
	
}

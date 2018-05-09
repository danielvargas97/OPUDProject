package logica.objeto.condicion;

public class Perdido extends Condicion{
	private boolean perdido;
	
	
	public Perdido() {
		super();
		setNombre("Perdido");
	}
	
	public Perdido(String fechaHoy) {
		super(fechaHoy);
		
	}
	
	@Override
	public String verFechaCondicion() {
		return formatearFecha();
	}

	@Override
	public String verNombreCondicion() {
		// 
		return getNombre();
	}

	@Override
	public String verEstadoCondicion() {
		
		if(perdido) {
			return this.nombre; 			
		}
		else{
			return "No "+this.nombre;
		}

	}

	@Override
	public void cambiarEstadoCondicion(boolean condicion) {
		this.perdido = condicion;
	}

}

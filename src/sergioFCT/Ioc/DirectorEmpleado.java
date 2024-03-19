package sergioFCT.Ioc;

public class DirectorEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	//contructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo=informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono la plantilla";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe del director: "+informeNuevo.getInforme();
	}

}

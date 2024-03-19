package sergioFCT.Ioc;

public class SecretarioEmpleado implements Empleados {
	
	private String email;
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono agenda de jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "soy el secretario "+informeNuevo.getInforme();
	}
	
	private CreacionInformes informeNuevo;

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}


}

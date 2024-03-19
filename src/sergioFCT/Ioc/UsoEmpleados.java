package sergioFCT.Ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//Creacion de objetos tipo empleado 
		Empleados Empleado1=new DirectorEmpleado();
		
		//Uso objetos
		System.out.println(Empleado1.getTareas());
	*/
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//nombre del bean y la interface
		//modificando el xml podemos ir haciendo la inyeccion de dependencias
		/*Empleados Juan=contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
*/
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		System.out.println("Email: "+Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		
		contexto.close();
	}

}

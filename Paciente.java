public class Paciente extends Persona{
 int idPacientes; 

	Paciente(){
	super()
	} 
	
	Paciente(String nombre, String apellido, String nacionalidad, String area, int edad){
		super(nombre, apellido, nacionalidad, area, edad);
		this.idPacientes = idPacientes;
	}

	public void setIDPacientes(int idPacientes){
		this.idPacientes = idPacientes;
	}
	
	public int getIDPacientes(){
		return idPacientes;
	}

}
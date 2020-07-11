public class Medico extends Persona{
int idMedicos; 

	Medico(){
	super()
	} 
	
	Medico(String nombre, String apellido, String nacionalidad, String area, int edad){
		super(nombre, apellido, nacionalidad, area, edad);
		this.idMedicos = idMedicos;
	}

	public void setIDMedicos(int idMedicos){
		this.idMedicos = idMedicos;
	}
	
	public int getIDMedicos(){
		return idMedicos;
	}

}
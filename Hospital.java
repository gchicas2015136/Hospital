import java.util.Scanner;

public class Hospital extends Usuarios{
	public static void main(String args[]){
	String nombre, apellido, nombreUsuario;	

	Scanner scan = new Scanner(System.in);
	Usuarios U = new Usuarios();
	Persona P = new Persona();

		System.out.println("Bienvenido al Sistema operativo de Nuestro Hospital");
		System.out.println(" ");
		System.out.println("Ingresa tu Nombre porfavor: ");
		nombre = scan.nextLine();
		P.setNombre(nombre);
		System.out.println("Ingresa tu Apellido porfavor: ");
		apellido = scan.nextLine();
		P.setApellido(apellido);
		System.out.println("Ingresa tu Nombre de Usuario porfavor: ");
		nombreUsuario = scan.nextLine();
		P.setNombreUsuario(nombreUsuario);





	}
}
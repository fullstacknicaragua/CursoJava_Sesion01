//Solicitar al usuario su primer nombre y su primer apellido y a partir de esto retornar el nombre completo...

package demoFiles; //Paquete al que pertenece esta clase...

import java.util.Scanner; //Importando clases de librer�as que ser�n utilizadas en la aplicaci�n...

public class NombreCompleto {
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in); //Instancia de la clase Scanner que nos permitir� obtener lo que digite el usuario...
		String pNombre, pApellido;	//Declaraci�n de variables locales...
		System.out.print("Digite el primer nombre: ");
		pNombre=entrada.next(); //Asignando a la variable lo que digit� el usuario...
		System.out.print("Digite el primer apellido: ");
		pApellido=entrada.next(); //Asignando a la variable lo que digit� el usuario...
		System.out.print("Su nombre completo es: " + pNombre + " " + pApellido); //Imprimiendo el nombre completo del usuario...
		entrada.close(); //Se cierra la instancia de la clase Scanner
	}
}
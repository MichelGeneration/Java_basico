package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		// set o HashSet
		//HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		HashSet<String> Grupo4 = new HashSet<String>();
		
		//agregar elemento al arreglo
		Grupo4.add("Michel");
		Grupo4.add("Ivan");
		Grupo4.add("Ina");
		Grupo4.add("Michel");
		Grupo4.add("Carlos");
		Grupo4.add("Teresa");
		System.out.println(Grupo4);
		System.out.println("*****************************************");
		
		//No permite datos duplicados y el orden es al azar
		//verificar el contenido del arreglo
		boolean verificacionNombre = Grupo4.contains("Michel");
		System.out.println("Existe el miembro? "+verificacionNombre);
		System.out.println("*****************************************");
		//eliminar elemento
		Grupo4.remove("Teresa");
		System.out.println(Grupo4);
		System.out.println("*****************************************");
		//tamaño del arreglo
		System.out.println("Tamaño del grupo: "+Grupo4.size());
		System.out.println("*****************************************");
		//recorrer el arreglo
		for (String miembro :Grupo4) {
			System.out.println(miembro);
		
		}
		System.out.println("*****************************************");


	}

}

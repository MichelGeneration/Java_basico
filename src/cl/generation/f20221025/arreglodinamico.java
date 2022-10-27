package cl.generation.f20221025;

import java.util.ArrayList;

public class arreglodinamico {

	public static void main(String[] args) {
		// array lista
		// ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
		ArrayList<String> grupo4 = new ArrayList<String>();
		// agregar valores al arreglo
		grupo4.add("Michel");
		grupo4.add("Iván");
		grupo4.add("Carlos");
		grupo4.add("Ina");
		grupo4.add("Teresa");
		System.out.println(grupo4);
		System.out.println("*****************************************");
		// tamaño del arraylist
		System.out.println(grupo4.size());
		System.out.println("*****************************************");
		// lenght= arreglos estaticos; size=arreglos dinamicos
		// Obtener un elemento deun arreglo
		System.out.println(grupo4.get(3));
		System.out.println("*****************************************");
		// eliminar un elemento dentro del array
		System.out.println(grupo4.remove(4));
		System.out.println(grupo4);
		System.out.println("*****************************************");
		// recorrer el arraylist
		for (int i = 0; i < grupo4.size(); i++) {
			System.out.println("grupo 4 compuesto por " + grupo4.get(i));
		
		}
		
		// for iterador o for de objeto
		System.out.println("***********************************************");
		for (String miembro : grupo4) {
			System.out.println(miembro);
		}

	}

}

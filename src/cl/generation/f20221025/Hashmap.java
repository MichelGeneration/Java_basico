package cl.generation.f20221025;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// hashmap
		//contiene una llave, valor (key, value)
		HashMap<Integer,String> relatores = new HashMap<Integer,String>();
		//Agregar valor al map
		relatores.put(11,"Alejandro");
		relatores.put(3,  "Andrea");
		relatores.put(4,  "Laura");
		relatores.put(11, "Pamela");//si existe esa clave sobrescribe
		System.out.println("map"+relatores);
		
		//tamaño del map
		System.out.println(relatores.size());
		
		//acceder a un dato a traves de una clave
		System.out.println(relatores.get(3));
		
		//eliminar un par de objetos
		relatores.remove(11);
		System.out.println("map"+ relatores);
		
		//recorrer un map
		for(Integer clave : relatores.keySet()) {
			System.out.println("clave "+clave+" valor "+relatores.get(clave));
		

	
			
		}
	}

}

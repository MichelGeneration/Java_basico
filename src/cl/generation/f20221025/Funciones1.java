package cl.generation.f20221025;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		// Funciones o metodo

		// Llamar a un metodo
		nombreMetodo();
		nombreMetodo2("");
		nombreMetodo3(77, 9.9f);
		String[] arreglito = { "a", "e", "i", "o", "u" };
		nombreMetodo4(arreglito);
		System.out.println(retorno1());
		Integer valorRetornado = retorno1();
		System.out.println(valorRetornado/5);

	}

	// definicion o estructura de un metodo
	// void = el metodo no retorna ningun valor
	public static void nombreMetodo() {
		System.out.println("Estoy dentro del metodo inicial");
	}

	public static void nombreMetodo2(String nombre) {
		System.out.println("Estoy soy" + nombre);
	}

	public static void nombreMetodo3(Integer numero1, Float numero2) {
		System.out.println("Estoy soy" + numero1 + " " + numero2);
		System.out.println("Estoy soy" + numero2);
	}

	public static void nombreMetodo4(String[] arreglito) {
		System.out.println("Estoy soy" + Arrays.toString(arreglito));

	}
	//Funciones con retorno
	
	public static Integer retorno1() {
		Integer totalAlumnos= 35;
		return totalAlumnos;
		
	}
	}



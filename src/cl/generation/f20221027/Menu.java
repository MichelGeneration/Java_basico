package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores=4;
		// Menu de opciones
		menu();
		
		do {
			System.out.println("[Seleccione una opcion]");
			opciones = scanner.nextInt();
			
			
			
			//si la opcion es 0 salir del do while
			if(opciones==0) {
				System.out.println("Salido con exito");
				break;
				
			}
			
			if (contadorErrores==1) {
				System.out.println("Agotó la cantidad de intentos");
				break;
			}else if(opciones< 0 || opciones >4){
				contadorErrores--;
				System.out.println("Te quedan "+contadorErrores+" intentos ");
			}
				
			
	
			
		}while (opciones<0 || opciones >4);
		
		
		
		if(opciones==0 || contadorErrores==0) {
			System.out.println("Adiós");
		}else {//solo ingresará para opciones 1,2,3,4
			System.out.println("Ingresa el primer numero");
			float numero1 = scanner.nextFloat();
			System.out.println("Ingresa el segundo numero");
			float numero2 = scanner.nextFloat();
			float resultado=0;
			switch (opciones) {
			case 1://sumar
				resultado= numero1 + numero2;
				System.out.println("El resultado es "+resultado);
				

				break;
			case 2://restar
				resultado= numero1 - numero2;
				System.out.println("El resultado es "+resultado);

				break;
			case 3://multiplicar
				resultado= numero1 * numero2;
				System.out.println("El resultado es "+resultado);

				break;
			case 4://dividir
				if(numero2==0) {
					System.out.println("FATAL ERROR");
				}else {
					resultado= numero1 / numero2;
					System.out.println("El resultado es "+resultado);
				}
				

				break;

			default:
				System.out.println("Opción no valida");
				break;
			}

			
		}
		
		// Calculadora con 4 operarciones basicas
		// solicitar y capturar 2 numeros float o double
		//imprimir los resultados y guardar una variable
		//ofrecer opciones de repeticion
		//definir los metodos
		//validaciones
		//terminar la ejecucion
		

	}
	public static void menu() {
		System.out.println("*********Menú****************");
		System.out.println("*****************************");
		System.out.println("***1*****[SUMAR]*************");
		System.out.println("***2*****[RESTAR]************");
		System.out.println("***3*****[MULTIPLICAR]*******");
		System.out.println("***4*****[DIVIDIR]***********");
		System.out.println("***0*****[SALIR]*************");
		System.out.println("*****************************");
	}

}

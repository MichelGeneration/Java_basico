package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// instancia de clase
		Auto auto1 = new Auto();
		
		//asignar valores a los atributos privados
		auto1.setColor("Rojo");
		auto1.setMarca("Peugeot");
		
		System.out.println(auto1.getColor());
		
		//saber el contenido de los atributos
		System.out.println(auto1.toString());
		
		//nueva instancia de auto
		Auto car = new Auto("Nissan,"Negro","Quashcai",1.6f,10.of,240f);

	}

}

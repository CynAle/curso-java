package principal.paquete;

public class MiClase {

	public MiClase() {

		this.wrapper1 = new Integer(2);
	}

	public MiClase(int atributo1, boolean atributoBooleano, Integer wrapper1) {

		this.atributo1 = atributo1;
		this.atributoBooleano = atributoBooleano;
		this.wrapper1 = wrapper1;
	}

	// Atributos
	int atributo1;
	boolean atributoBooleano;

	// Wrappers
	Integer wrapper1;
	Character wrapperCharacter;

	final int CONSTANTE = 0;
	final Integer OTRA_CONSTANTE = 0;

	void setAtributo1(int atributo1) {
		this.atributo1 = atributo1;

	}

	int getAtributo1() {
		return atributo1;
	}

	void setWrapper1(int wrapper1) {
		this.wrapper1 = wrapper1;
	}

	int getWrapper1() {
		return wrapper1;
	}

	public static void main(String[] a) {

		MiClase miClase = new MiClase();
		System.out.println(miClase.getAtributo1());
		System.out.println(miClase.atributoBooleano);
		System.out.println(miClase.getWrapper1());
		
		OtraClase otra = new OtraClase();
		System.out.println(otra.getAtributo1());
		System.out.println(otra.atributoBooleano);
		otra.atributoBooleano = true;
		System.out.println(otra.atributoBooleano);
		otra.imprimirArreglo();
	}
}

class OtraClase extends MiClase {

	int[] arreglo, arreglo2, matriz[];
	
	public OtraClase() {
		arreglo = new int[5];
		arreglo[0] = 0;
		arreglo[1] = 1;
		arreglo[2] = 2;
		arreglo[3] = 3;
		arreglo[4] = 4;
	}

	public void imprimirArreglo() {

		int size = arreglo.length;
		for(int i = 0; i < size; i++) {
			System.out.println(arreglo[i]);
		}
		for (int valor : arreglo) {
			System.out.println(valor);
		}
	}
}

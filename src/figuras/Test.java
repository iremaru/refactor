package figuras;

public class Test {
	public static void main(String[] args) {
		Circunsferencia c1 = new Circunsferencia(5.5);
		Circunsferencia c2 = new Circunsferencia(10.1);
		Circunsferencia c3 = new Circunsferencia(10.9);

		if (c2.esIgual(false, c3))
			System.out.println("c2 y c3: iguales sin considerar decimales");

		if (c2.esIgual(true, c3))
			System.out.println("c2 y c3: iguales considerando decimales");
	}

}

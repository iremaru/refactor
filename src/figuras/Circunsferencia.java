package figuras;

/**
 * Clase para crear y manejar circunferencias.
 * @author Irene
 * @version 1
 * @since v. 1
 */
public class Circunsferencia {
	private static final double PI = 3.1416;
	private double radio;
	private String color;

	/**
	 * Crea un objeto circunsferencia.
	 * @param radio - Radio de la circunsferencia
	 */
	public Circunsferencia(double radio) {
		this.radio = radio;
	}
	
	/**
	 * Imprime por consola los datos de la circunsferencia.
	 */
	public void imprimir() {
		color = "rojo";
		System.out.println("Diametro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area = 2 * PI * radio * radio;
		System.out.println(area);
	}

	/**
	 * Determina si dos circunsferencias son iguales entre sí.
	 * @param considerarDecimales - Opción para comparar al milímetro
	 * @param otro - La otra circunsferencia con la que comparar
	 * @return True si son iguales, False si no.
	 */
	public boolean esIgual(boolean considerarDecimales, Circunsferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
	
	/**
	 * Getter del radio. Usala para obtener el valor del radio.
	 * @return Valor del radio de la circunsferencia
	 */
	public double getRad() {
		return radio;
	}

	/**
	 * Setter del radio. Usala para establecer el valor del radio.
	 * @param rad - Nuevo valor para el radio de la circunsferencia.
	 */
	public void setRad(double rad) {
		this.radio = rad;
	}
	
	
}

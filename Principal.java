/**
 * Montoya Montes Pedro
 * 
 * Clase Aleatorio, que regresa un número pseudoaleatorio mediante una función con bastantes picos de ruido.
 *
 */
public class Principal{
	/**
 	* 
 	* Clase principal para probar la clase Aleatorio.
 	*
 	*/
	public static void main(String[] args) {
		Aleatorio random1 = new Aleatorio();
		
		System.out.println((int)random1.aleatorio());
		System.out.println(random1.aleatorio());

		Aleatorio random2 = new Aleatorio(29);
		System.out.println((int)random2.aleatorio());
		System.out.println(random2.aleatorio());
	}
	
}
import java.lang.Math;
import java.time.ZonedDateTime;

/**
 * Montoya Montes Pedro
 * 
 * Clase Aleatorio, que regresa un número pseudoaleatorio mediante una función con bastantes picos de ruido.
 *
 */
public class Aleatorio{
	private double seed;
	private int rango;

	/**
	 * Constructor en caso de que el usuario ingrese un rango máximo (no acotado para positivos o negativos).
	 */
	public Aleatorio(int rango){
		this.seed = ZonedDateTime.now().toInstant().toEpochMilli();//Usamos esta semilla para que el valor varié de acuerdo a los milisegundos.
		this.rango = rango;
	}

	/**
	 * Constructor de la clase para el caso donde el usuario no especifica un rango, tomando este como el valor máximo de Integer en Java.
	 */
	public Aleatorio(){
		this.seed = ZonedDateTime.now().toInstant().toEpochMilli();//Usamos esta semilla para que el valor varié de acuerdo a los milisegundos.
		rango = Integer.MAX_VALUE ;
	}

	/**
	 * Método que tomará como ruido a la función: sin(cos(x*314))+cos(x^5)+cos(x*31)+sin(x^3)+(cos(x*13)/5)+sin(x*.1)

	 */
	public double aleatorio(){
		double ruido =
		+ Math.sin(Math.cos(seed*311))
		+ Math.cos(Math.pow(seed, 5))
		+ Math.cos(seed*31)
		+ Math.sin(Math.pow(seed, 3))
		+ (Math.cos(seed*13)/5)
		+ Math.sin(seed*0.1);

		double rand = 1 /(1+Math.pow(Math.E, ruido)); //Usamos la función sigmoide para acotar el valor.
		seed += rand;
		rand *= rango;
		return rand; //Regresamos el valor calculado.
	}
}
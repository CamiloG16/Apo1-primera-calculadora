import java.util.Scanner;

public class EjercicioClase { 

	public static void main(String[] args) { 
		Scanner in = new Scanner (System.in) ;
		
		String saborHelado;
	    
		System.out.println("Cual es tu sabor de helado favorito?" );
		
		saborHelado = in.nextLine();
		
		System.out.println("Tu sabor elegido fue : " + saborHelado);
		
		double porcentajeComision;
		
		System.out.println("Cual es el porcentaje de comision en la venta ? : " );
		
		porcentajeComision = in.nextDouble();
		
		System.out.println("Tu porcentaje de comision es : " + porcentajeComision);
	
		
		
		
	}	
}
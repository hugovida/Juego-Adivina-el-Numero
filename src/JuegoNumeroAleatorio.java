import java.util.*;

public class Main {



	public static void main(String[] args) {

		//DECLARACION DE VARIABLES

		Scanner e = new Scanner(System.in);

		double num;

		int numero_adivinar;

		int numero_usuario=100;

		//LLAMADA A FUNCION QUE DEVUELVE UN NUMERO ALEATORIO ENTRE EL 1 Y EL 20

		num=aleatorio();

		//CASTING QUE CONVIERTE A ENTERO

		numero_adivinar=(int)num;
		  
		
		//System.out.println(numero_adivinar);

        //FOR PARA QUE CUENTE LOS INTENTOS 

		for(int intentos=0;intentos<=4;intentos++) {
       
		//DO WHILE PARA QUE INTRODUZCA UN VALOR CORRECTO
		do {
		          System.out.println("ADIVINA UN NUMERO");
		          numero_usuario=e.nextInt(); 
		}while(numero_usuario<1 || numero_usuario>20);
		
          //SI ACIERTA EL NUMERO ENTRA POR ESTE IF Y MUESTRA POR PANTALLA ESE MENSAJE

             if(numero_adivinar==numero_usuario) {

            	 intentos=intentos+1;

            	 System.out.println("HAS ADIVINADO EL NUMERO SECRETO EN "+intentos+" INTENTOS");

            	 intentos=5;

             }

             //SI NO ACIERTA Y ES MAYOR QUE EL NUMERO SECRETO ENTRA POR AQUI Y SE LO DICE

            	 else if(numero_adivinar<numero_usuario) {

                 System.out.println("EL NUMERO SECRETO ES MENOR QUE "+numero_usuario);

            	 }

             //SI NO ACIERTA Y ES MENOR QUE EL NUMERO SECRETO ENTRA POR AQUI Y SE LO DICE

            	 else if(numero_adivinar>numero_usuario) {

                     System.out.println("EL NUMERO SECRETO ES MAYOR QUE "+numero_usuario);

                	 }

             //SI NO ACIERTA FIN DEL JUEGO

             if(intentos==4) {

            	 System.out.println("HAS PERDIDO EL NUMERO SECRETO ES "+numero_adivinar);

             }       

        }   

	}

	//FUNCION QUE GENERA UN NUMERO ALEATORIO

	public static double aleatorio() {

		double p = Math.random() * 21;

		return p;

		

	}

}
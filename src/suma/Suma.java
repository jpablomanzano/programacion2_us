package suma;
import java.util.Scanner;

/**
 *
 * @author Grupo Lorca
 */
public class Suma {

   
    public static void main(String[] args) {
        
        Scanner operacion = new Scanner (System.in);
        
        /*Declaro mis variables*/
        int num_1, num_2, resultado;
        
        /*Pido el primer número*/
        System.out.print("Ingresa el primer número: ");
        /*Capturo el primer número en la variable num_1*/
        num_1 = operacion.nextInt();
        
        /*Pido el segundo número*/
        System.out.print("Ingresa el segundo número: ");
        /*Capturo el segundo número en la variable num_2*/
        num_2 = operacion.nextInt();
        
        /*Calculo mi operación*/
        resultado = num_1+num_2;
        
        /*Imprimo resultado*/
        System.out.println("El resultado de la suma es: "+ resultado );
        
    }
    
}

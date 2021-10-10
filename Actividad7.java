
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;
import java.util.Scanner;
/**
 *
 * @author abii_
 */
public class Actividad7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int serie = 100, num1 = 0, num2 = 1, suma = 1;
        System.out.println("Sistema Fubonacci: " + num1);
        for (int i = 1; i < serie; i++) {
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
          int n1, n2,count = 0, i, j;
          Scanner n = new Scanner(System.in);
          System.out.print("Iniciamos de cero : "); 
          n1 = n.nextInt();
          System.out.print("A 100 :"); 
          n2 = n.nextInt();
          System.out.println("Se imprien los numeros primos que hay entre 0 a 100 :");
          for(i = n1; i <= n2; i++){
              for( j = 2; j < i; j++){
                  if(i % j == 0){
                      count = 0;
                      break;}else{count = 1;}
              }if(count == 1){
                  System.out.println(i);}}
    }
}





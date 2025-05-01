
package sorteio;

import java.util.Random;
import java.util.Scanner;

public class Sorteio {

    public static void main(String[] args) {
        
 Scanner scanner = new Scanner (System.in);
 System.out.println("Digite o primeiro número: ");  
 int n1 = scanner.nextInt();
 System.out.println("Digite o segundo número: ");  
 int n2 = scanner.nextInt();       
        
        Random random = new Random ();
    int n3 = random.nextInt(100) + 1;
        System.out.println("Número Sorteado: " + n3);
        
        if (n3 % 2 == 0 ) {
        System.out.println("O número sorteado é par.");
        } else {
          System.out.println("O número sorteado é ímpar.");
           }
        
            if (n1>n2 && n1>n3) {
            System.out.println("O maior número é :" + n1);
            }
             else if (n2>n1 && n2>n3) {
             System.out.println("O maior número é :" + n2);
             } 
              else {
              System.out.println("O maior número é :" + n3);
              }

                if (n1<n2 && n1<n3) {
                System.out.println("O menor número é :" + n1);
                }
                else if (n2<n1 && n2<n3) {
                    System.out.println("O menor número é :" + n2);
                     } 
                      else {
                      System.out.println("O menor número é :" + n3);
                      }
                            
    }
    
}

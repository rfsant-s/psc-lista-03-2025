import java.util.Scanner;

public class MaiorMenorMedia {
 public static void main(String[] args) {
 Scanner scanner = new Scanner (System.in);
 System.out.println("Digite o primeiro número: ");  
 int n1 = scanner.nextInt();
 System.out.println("Digite o segundo número: ");  
 int n2 = scanner.nextInt();
 System.out.println("Digite o terceiro número: ");  
 int n3 = scanner.nextInt();

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

            int media = (n1+n2+n3)/3;

            System.out.println("A média dos números é " + media);
 }   
}

import java.util.Scanner;
public class Equacao2oGrau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o valor de a:");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de b :");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de c:");
        int c = scanner.nextInt();

      if (a == 0 && b == 0 && c != 0) {
          System.out.println("Coeficientes informados incorretamente.");
      }
       else if (a == 0 && b != 0) {

        double raiz = -c / (double) b;
        System.out.println("Essa é uma equação de primeiro grau");
        System.out.println("A raiz é : " + raiz);
        } 
        else {
        double delta = (b * b) - 4 * a * c;
        

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais");
        }
         else if (delta == 0) {

          double raiz = (-b) / (2 * a);
          System.out.println("A equação possui duas raizes reais iguais.\n");
          System.out.println("A raiz é :" + raiz);
          } 

          else if (delta > 0) {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Esta equação  possui duas raízes reais diferentes.");
            System.out.println("As raizes são: " + x1 + " e " + x2);
          }      
        }
        scanner.close();
  }
    }


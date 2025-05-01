
package calculadora;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite o primeiro número :");
        double n1 = scanner.nextDouble();
        System.out.println("Digite o carctere da operação: ");
        String operador = scanner.next();
        System.out.println("Digite o outro número: ");
        double n2 = scanner.nextDouble ();
        
        switch (operador) {
            case "+":
                System.out.println(n1 + n2);
                break;
            case "-":
                System.out.println(n1 - n2);
            break;
            case "*":
                System.out.println(n1 * n2);
                break;
            case "/":
                System.out.println(n1 / n2); 
                break;
            case "^":
                System.out.println(Math.pow(n1, n2));
                break;
                
        } 
        
    }
    
}

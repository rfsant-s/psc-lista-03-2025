
package perimetroraio;
import static java.lang.Math.PI;
import java.util.Scanner;
public class PerimetroRaio {

    public static void main(String[] args) {
 Scanner scanner = new Scanner (System.in);
 
        System.out.println("Digite o valor do indicador:");
        double indicador = scanner.nextDouble();
        System.out.println("Digite o valor do raio:");
        double raio = scanner.nextDouble();
       
        if (indicador == 1) {
        double perimetro_circulo = 2* PI * raio;
        System.out.println("O perímetro é" + perimetro_circulo);
         }
           else if (indicador == 2) {
           double area_circulo = PI *(raio * raio);
           System.out.println("A área do círculo é" + area_circulo);
           }
                else if (indicador == 3) {
                double volume = (4 * PI * Math.pow(raio,3))/ 3; 
                System.out.println("O volume da esfera é" + volume);
                }      
                else {
                    System.out.println("Código da operação inválido!");
      
    }
    }
    
}

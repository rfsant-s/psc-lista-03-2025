import java.util.Scanner;

public class MaqVenda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor total da compra: ");
        double valor_compra = scanner.nextDouble(); 
        System.out.print("Digite o valor pago: ");
        double valor_pago = scanner.nextDouble();

        if (valor_pago < valor_compra) {
            System.out.println("Valor pago insuficiente para realizar compra!");
        } else {
            double troco = valor_pago - valor_compra;
            int nota50 = 0, nota20 = 0, nota10 = 0, nota5 = 0, nota2 = 0, nota1 = 0;

            System.out.println("TROCO: " + troco);

            while (troco >= 50) {
                nota50++;
                troco -= 50;
            }
            while (troco >= 20) {
                nota20++;
                troco -= 20;
            }
            while (troco >= 10) {
                nota10++;
                troco -= 10;
            }
            while (troco >= 5) {
                nota5++;
                troco -= 5;
            }
            while (troco >= 2) {
                nota2++;
                troco -= 2;
            }
            while (troco >= 1) {
                nota1++;
                troco -= 1;
            }

            System.out.println("Notas de R$ 50,00: " + nota50);
            System.out.println("Notas de R$ 20,00: " + nota20);
            System.out.println("Notas de R$ 10,00: " + nota10);
            System.out.println("Notas de R$ 5,00: " + nota5);
            System.out.println("Notas de R$ 2,00: " + nota2);
            System.out.println("Notas de R$ 1,00: " + nota1);
        }
    }
}
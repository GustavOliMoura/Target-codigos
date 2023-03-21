import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, proximoTermo = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Imprime os primeiros dois termos da sequência de Fibonacci
        System.out.print("Sequência de Fibonacci: " + num1 + ", " + num2 + ", ");

        // Calcula o próximo termo da sequência e verifica se ele é igual ao número informado
        while (proximoTermo < numero) {
            proximoTermo = num1 + num2;
            if (proximoTermo == numero) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
                return;
            }
            System.out.print(proximoTermo + ", ");
            num1 = num2;
            num2 = proximoTermo;
        }
        System.out.println(numero + " não pertence à sequência de Fibonacci.");
    }
}


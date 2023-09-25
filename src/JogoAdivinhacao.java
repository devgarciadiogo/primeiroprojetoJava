import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");

        while (tentativas < 5) {
            System.out.print("Digite um numero de 1 até 100: ");
            int numeroDigitado = scanner.nextInt();
            tentativas++;


            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o numero.");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número digitado é menor que o numero gerado");
            } else {
                System.out.println("O numero digitado é maior que o numero gerado");
            }


            if (tentativas == 5) {
                System.out.println("Você não conseguiu acertar o numero gerado");
            }
        }
    }
}
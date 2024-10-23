import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        // Criando o Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando a entrada de uma stringa
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        // Variável para contar a quantidade de 'a' (maiúsculo e minúsculo)
        int cont = 0;
        
        // Percorrendo a string e verificando a existência de 'a' ou 'A'
        for (int i = 0; i < input.length(); i++) {
            char letra = input.charAt(i);
            if (letra == 'a' || letra == 'A') {
                cont++;
            }
        }
        
        
        // Verificando se a letra 'a' foi encontrada
        if (cont > 0) {
            System.out.println("A letra 'a' aparece " + cont + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }
        
        // Fechando o Scanner
        scanner.close();
    }
}
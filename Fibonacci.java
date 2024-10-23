import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        // Criando o Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando a entrada de um número
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();
        
        // Variáveis para armazenar os dois primeiros números da sequência de Fibonacci
        int a = 0;
        int b = 1;
        
        // Variável para armazenar o próximo número na sequência
        int proximo = a + b;
        
        // Se o número for 0 ou 1, ele já pertence à sequência de fibonacci
        if (num == 0 || num == 1) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            // Enquanto o próximo número da sequência for menor ou igual ao número informado
            while (proximo <= num) {
                // Verifica se o número informado é igual ao próximo número da sequência
                if (proximo == num) {
                    System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
                    scanner.close();
                    return; // Encerra o programa pois o número foi encontrado
                }
                
                // Atualiza os valores para gerar o próximo número da sequência
                a = b;
                b = proximo;
                proximo = a + b;
            }
            
            // Se o laço terminar, o número não pertence à sequência
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
        
        // Fechando o Scanner
        scanner.close();
    }
}


import java.util.Scanner;

public class questao5_e_6_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        String[] palavras = new String[8]; 

        System.out.println("Digite 8 palavras:");

        for (int i = 0; i < palavras.length; i++) {
            System.out.print("Palavra " + (i + 1) + ": ");
            palavras[i] = scanner.nextLine();
        }

        // Insertion Sort para strings em ordem alfabética
        for (int i = 1; i < palavras.length; i++) {
            String chave = palavras[i];
            int j = i - 1;

           
            while (j >= 0 && palavras[j].compareToIgnoreCase(chave) > 0) {
                palavras[j + 1] = palavras[j];
                j--;
            }
            palavras[j + 1] = chave;

            
            System.out.print("Passo " + i + ": ");
            for (String palavra : palavras) {
                System.out.print(palavra + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class questao4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int[] numeros = new int[8]; 

        System.out.println("Digite 8 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        for (int i = 1; i <numeros.length; i++) {
            int chave = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] < chave) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = chave;

            
            System.out.print("Passo " + i + ": ");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

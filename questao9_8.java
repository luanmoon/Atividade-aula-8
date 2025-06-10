import java.util.Scanner;

public class questao9_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double[] numeros = new double[6]; 

        System.out.println("Digite 6 notas:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        for (int i = 1; i <numeros.length; i++) {
            double chave = numeros[i];
            int j = i - 1;
            while (j >= 0 && numeros[j] > chave) {
                numeros[j + 1] = numeros[j];
                j--;
            }
            numeros[j + 1] = chave;

            
            System.out.print("Colocando em ordem crescente " + i + ": ");
            for (double num : numeros) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
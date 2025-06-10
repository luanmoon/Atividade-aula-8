public class questao2_8 {
    public static void main(String[] args) {
        int[] v = {5, 3, 1, 4, 2, 6, 8, 7, 9, 0};

        
        for (int i = 1; i < v.length; i++) {
            int chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;

            
            System.out.print("Passo " + i + ": ");
            for (int num : v) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}




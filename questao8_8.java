public class questao8_8 {
    public static void main(String[] args) {
        double[] v = {5.5, 3.2, 1.7, 4.9, 2.3, 6.9, 8.1, 7.4, 9.6, 0.3};

        
        for (int i = 1; i < v.length; i++) {
            double chave = v[i];
            int j = i - 1;
            while (j >= 0 && v[j] > chave) {
                v[j + 1] = v[j];
                j--;
            }
            v[j + 1] = chave;
        }

        
        for (double num : v) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
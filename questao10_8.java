public class questao10_8 {
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
        }

        int chave = 7;
        int resultado = buscaBinaria(v, chave);
        if (resultado != -1) {
            System.out.println("Número " + chave + " encontrado na posição " + resultado);
        } else {
            System.out.println("Número " + chave + " não encontrado.");
        }
    }




    public static int buscaBinaria(int[] v, int chave) {
        int ini = 0, fim = v.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio] == chave) return meio;
            else if (v[meio] < chave) ini = meio + 1;
            else fim = meio - 1;
        }
        return -1;
 

    }
}
public class Main {
    public static void main(String[] args) {
        int[] vetor = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int tamanho = vetor.length;

        for (int i = 0; i < tamanho / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = temp;
        }

        // Exibindo o vetor invertido
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}


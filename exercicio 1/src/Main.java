public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        // Inicializa o vetor com valores
        for (int i = 0; i < 10; i++) {
            vetor[i] = i;
        }

        // Imprime o vetor em ordem inversa
        for (int i = 9; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}

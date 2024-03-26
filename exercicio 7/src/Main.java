public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};

        int maiorSomaColunas = 0;

        for (int j = 0; j < 5; j++) {
            int somaColuna = 0;
            for (int i = 0; i < 5; i++) {
                somaColuna += matriz[i][j];
            }
            if (somaColuna > maiorSomaColunas) {
                maiorSomaColunas = somaColuna;
            }
        }

        System.out.println("A maior soma entre as colunas é: " + maiorSomaColunas);
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número de linhas da primeira matriz:");
        int linhasA = input.nextInt();
        System.out.println("Informe o número de colunas da primeira matriz:");
        int colunasA = input.nextInt();

        System.out.println("Informe o número de linhas da segunda matriz:");
        int linhasB = input.nextInt();
        System.out.println("Informe o número de colunas da segunda matriz:");
        int colunasB = input.nextInt();

        if (colunasA != linhasB) {
            System.out.println("Não é possível multiplicar as matrizes. O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
        } else {
            int[][] matrizA = new int[linhasA][colunasA];
            int[][] matrizB = new int[linhasB][colunasB];
            int[][] matrizProduto = new int[linhasA][colunasB];

            System.out.println("Insira os valores da primeira matriz:");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasA; j++) {
                    matrizA[i][j] = input.nextInt();
                }
            }

            System.out.println("Insira os valores da segunda matriz:");
            for (int i = 0; i < linhasB; i++) {
                for (int j = 0; j < colunasB; j++) {
                    matrizB[i][j] = input.nextInt();
                }
            }

            // Multiplicação das matrizes
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    for (int k = 0; k < colunasA; k++) {
                        matrizProduto[i][j] += matrizA[i][k] * matrizB[k][j];
                    }
                }
            }

            System.out.println("Matriz Produto:");
            for (int i = 0; i < linhasA; i++) {
                for (int j = 0; j < colunasB; j++) {
                    System.out.print(matrizProduto[i][j] + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }
}

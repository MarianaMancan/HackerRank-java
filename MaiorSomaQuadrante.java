import java.util.List;
import java.util.ArrayList;

public class MaiorSomaQuadrante {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        int n = (int) Math.sqrt(lista.size());

        if (n * n != lista.size()) {
            throw new IllegalArgumentException("A lista não pode ser formada em uma matriz quadrada perfeita.");
        }

        int[][] matriz = new int[n][n];
        int index = 0;

        // Preenchendo a matriz com os elementos da lista
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = lista.get(index++);
            }
        }

        // Calculando a soma do primeiro quadrante
        int soma = 0;
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                soma += matriz[i][j];
            }
        }

        System.out.println("A maior soma possível do primeiro quadrante é: " + soma);
    }
}
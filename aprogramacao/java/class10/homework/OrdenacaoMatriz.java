package aprogramacao.java.class10.homework;

public class OrdenacaoMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b, a, t;

		int[][] matriz = { { 9, 7, 6, 5, 1 }, { 9, 4, 5, 2, 3 }, { 1, 5, 2, 4, 3 }, { 9, 8, 1, 2, 5 },
				{ 4, 9, 8, 7, 2 } };

		imprimirMatriz(matriz);
		ordenarLinhasMatriz(matriz);
		imprimirMatriz(matriz);
//		ordenarColunasMatriz(matriz);
	}

	public static void imprimirMatriz(int[][] matrizParametro) {
		for (int linha = 0; linha < matrizParametro.length; linha++) {
			for (int coluna = 0; coluna < matrizParametro[linha].length; coluna++) {
				System.out.print(matrizParametro[linha][coluna] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}

	public static void ordenarLinhasMatriz(int[][] matrizParametro) {
		for (int linha = 0; linha < matrizParametro.length; linha++) {
			for (int coluna = 1; coluna < matrizParametro[linha].length; coluna++) {
				for (int elemento = matrizParametro[linha].length - 1; elemento >= coluna; elemento--) {
					if (matrizParametro[linha][elemento - 1] > matrizParametro[linha][elemento]) {
						int valorIntermediario = matrizParametro[linha][elemento - 1];
						matrizParametro[linha][elemento - 1] = matrizParametro[linha][elemento];
						matrizParametro[linha][elemento] = valorIntermediario;
					}
				}
			}
		}
	}

}

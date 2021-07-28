package desafiosmatematicos;


import java.io.IOException;
import java.util.Scanner;

public class AreaDireita {

	public static void main(String[] args) throws IOException {
            /*
            * Desafio 01
            Leia um caractere maiúsculo, que indica uma operação que deve ser 
            realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a 
            soma ou a média considerando somente aqueles elementos que estão 
            na área direita da matriz, conforme ilustrado abaixo (área verde).
			
            Entrada

            A primeira linha de entrada contem um único caractere Maiúsculo O 
            ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser 
            realizada com os elementos da matriz. Seguem os 144 valores de 
            ponto flutuante que compõem a matriz.
			
            Saída

            Imprima o resultado solicitado (a soma ou média), com 1 casa após 
            o ponto decimal.

            */
		
            Scanner leitor = new Scanner(System.in);
            double soma = 0;
            char O = leitor.next().toUpperCase().charAt(0);
            double[][] M = new double[12][12];
            for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
                    M[i][j] = leitor.nextDouble();
        	}
            }
        
            for (int i = 0; i < M.length; i++) {
        	for (int j = 0; j < M[i].length; j++) {
                    if (j > i && j > M.length-i-1) soma += M[i][j];
        	}
        }

        if (O == 'M') soma /= 30;
    	System.out.println(String.format("%.1f", soma));

    }

}

package aula37;

public class Aula37 {

    public static void algoritmoA(int[] vetor, int nElemento) {
        if (nElemento < 2) {
            return;
        }
        int meio = nElemento / 2;
        int[] esquerdo = new int[meio];
        int[] direito = new int[nElemento - meio];
        for (int i = 0; i < meio; i++) {
            esquerdo[i] = vetor[i];
        }
        for (int i = meio; i < nElemento; i++) {
            direito[i - meio] = vetor[i];
        }
        algoritmoA(esquerdo, meio);
        algoritmoA(direito, nElemento - meio);
        juntar(vetor, esquerdo, direito, meio, nElemento - meio);
    }

    private static void juntar(int[] vetor, int[] esquerdo, int[] direito, int iEsquerdo, int iDireito) {
        int i = 0, j = 0, k = 0;
        while (i < iEsquerdo && j < iDireito) {
            if (esquerdo[i] < direito[j]) {
                vetor[k++] = esquerdo[i++];
            } else {
                vetor[k++] = direito[i++];
            }
        }
        while (i < iEsquerdo) {
            vetor[k++] = direito[j++];
        }
    }

    public static int[] algoritmoB(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int menor = vetor[i];
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < menor) {
                    int aux = vetor[j];
                    vetor[j] = menor;
                    menor = aux;
                }
            }
            vetor[i] = menor;
        }
        return vetor;
    }

    public static int[] algoritmoC(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j + 1];
                    vetor[j] = aux;
                }
            }
        }
        return vetor;
    }

    public static int[] algoritmoD(int[] vetor) {
        int i, j, valor;
        for (i = 1; i < vetor.length; i++) {
            valor = vetor[i];
            for (j = i - 1; (j >= 0) && (vetor[j] > valor); j--) {
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = valor;
        }
        return vetor;
    }
}

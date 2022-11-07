package aula37;
import java.util.Random;
public class Teste {
    static int tamanho = 100;
    public static void mostraVetor(int[] vetor){
         for (int i=0 ; i < vetor.length; i++){
                System.out.print(vetor[i]+" ");
            }
          System.out.println("");
    }
     public static void main(String[] args){
            Random aleatorio = new Random();
            int i;
            long inicio;
            long fim;
            long tempoOrd;
            long tempoReord;
            int[] vetor = new int [tamanho];
            int[] vetorDois = new int[tamanho];
            for (i=0 ; i < vetor.length; i++){
                vetor [i] = aleatorio.nextInt(tamanho*2);
               
            }
            System.arraycopy(vetor, 0, vetorDois, 0, tamanho);
            mostraVetor(vetor);
            inicio = System.currentTimeMillis();
            Aula37.algoritmoB(vetor);
            fim = System.currentTimeMillis();
            tempoOrd=fim-inicio;
            mostraVetor(vetor);
            inicio = System.currentTimeMillis();
            Aula37.algoritmoB(vetor);
            fim = System.currentTimeMillis();
            tempoReord=fim-inicio;
            mostraVetor(vetor);
            System.out.println("algoritmoB ord: "+tempoOrd+"ms reord: "+tempoReord+"ms para "+tamanho+" elementos");
            System.arraycopy(vetorDois, 0, vetor, 0, tamanho);
            //algoritmo A
            inicio = System.currentTimeMillis();
            Aula37.algoritmoA(vetor,vetor.length);
            fim = System.currentTimeMillis();
            tempoOrd=fim-inicio;
            mostraVetor(vetor);
            inicio = System.currentTimeMillis();
            Aula37.algoritmoA(vetor,vetor.length);
            fim = System.currentTimeMillis();
            tempoReord=fim-inicio;
            mostraVetor(vetor);
            System.out.println("algoritmoA ord: "+tempoOrd+"ms reord: "+tempoReord+"ms para "+tamanho+" elementos");
            System.arraycopy(vetorDois, 0, vetor, 0, tamanho);
            //algoritmo C
            inicio = System.currentTimeMillis();
            Aula37.algoritmoC(vetor);
            fim = System.currentTimeMillis();
            tempoOrd=fim-inicio;
            mostraVetor(vetor);
            inicio = System.currentTimeMillis();
            Aula37.algoritmoC(vetor);
            fim = System.currentTimeMillis();
            tempoReord=fim-inicio;
            mostraVetor(vetor);
            System.out.println("algoritmoC ord: "+tempoOrd+"ms reord: "+tempoReord+"ms para "+tamanho+" elementos");
            System.arraycopy(vetorDois, 0, vetor, 0, tamanho);
           //Algoritmo D
             inicio = System.currentTimeMillis();
            Aula37.algoritmoD(vetor);
            fim = System.currentTimeMillis();
            tempoOrd=fim-inicio;
            mostraVetor(vetor);
            inicio = System.currentTimeMillis();
            Aula37.algoritmoD(vetor);
            fim = System.currentTimeMillis();
            tempoReord=fim-inicio;
            mostraVetor(vetor);
            System.out.println("algoritmoD ord: "+tempoOrd+"ms reord: "+tempoReord+"ms para "+tamanho+" elementos");
            System.arraycopy(vetorDois, 0, vetor, 0, tamanho);
           //-------------------------------------------------------------------------------------------------------------------------------------------------
           
           
           
     } 
     } 
        
        
        
        
        
        
        
    

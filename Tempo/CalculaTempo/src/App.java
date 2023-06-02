import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {


       

        List<Integer> lista = new ArrayList<>();
        Set<Integer> lista2 = new HashSet<>();

         /*for(int i = 0; i <=50000; i++) {
            lista.add(i);
        }  */
        long inicio = System.currentTimeMillis();
        for(int i = 0; i <= 5000; i++) {
           lista2.add(i);
       }
       
       long fim = System.currentTimeMillis();
       long tempoDeExecucao = fim - inicio;

     System.out.println("Tempo gasto: " + tempoDeExecucao);

     long inicio2 = System.currentTimeMillis();
       for(int i = 0; i <= 5000; i++) {
        lista2.contains(i);
       }

      
     long fim2 = System.currentTimeMillis();
     long tempoDeExecucao2 = fim2 - inicio2;

     System.out.println("Tempo gasto: " + tempoDeExecucao2);
    }
    }



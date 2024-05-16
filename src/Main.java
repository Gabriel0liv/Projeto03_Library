
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> numeros = Arrays.asList(1.3, 1.4, 4.55, 6.8, 9.4, 2.0, 8.7, 4.55);

        //chama o metodo para calcular a média
        double media = NumberUtils.calcularMedia(numeros);
        System.out.println("Média: " + media); // imprime na tela
        //chama o metodo para calcular a mediana
        double mediana = NumberUtils.calcularMediana(numeros);
        System.out.println("Mediana: " + mediana); // imprime na tela
        // chama o metodo para calcular a moda
        double moda = NumberUtils.calcularModa(numeros);
        System.out.println("Moda: " + moda); // imprime na tela

        // chama o método para ordenar a lista, segundo parametro "true" para retornar ordem crescente
        List<Double> listaCrescente = NumberUtils.ordenarLista(numeros, true);
        System.out.println("Lista ordenada Crescente: " + listaCrescente); // imprime a lista na tela
        // chama o método para ordenar a lista, segundo parametro "false" para retornar ordem decrescente
        List<Double> listaDecrescente = NumberUtils.ordenarLista(numeros, false);
        System.out.println("Lista ordenada Decrescente: " + listaDecrescente);


    }
}

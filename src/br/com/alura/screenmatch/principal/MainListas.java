package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainListas {
    public static void main(String[] args) {
        Filme f1 = new Filme("O poderoso chefão", 1970);
        f1.evaluate(9);
        Filme f2 = new Filme("Avatar", 2023);
        f2.evaluate(6);
        Filme f3 = new Filme("Dogville", 2003);
        f3.evaluate(10);
        Serie lost = new Serie("lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        lista.add(f3);
        lista.add(f1);
        lista.add(f2);
        lista.add(lost);
        for(Titulo item: lista){
            System.out.println(item.getName());
            if(item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArista = new ArrayList<>();
        buscaPorArista.add("Adam Sandler");
        buscaPorArista.add("Paulo");
        buscaPorArista.add("Jacqueline");
        System.out.println(buscaPorArista);

        Collections.sort(buscaPorArista);
        System.out.println(buscaPorArista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getYearRelease));
        System.out.println(lista);
    }
}

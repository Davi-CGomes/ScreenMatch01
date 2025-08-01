package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main{
        public static void main(String[] args){
            Filme f1 = new Filme("O poderoso chefão", 1970);
            //f1.setName("O poderoso chefão");
            //f1.setYearRelease(1970);
            f1.setDurationMin(180);
            System.out.println("Duração do filme: " + f1.getDurationMin());

            f1.display();
            f1.evaluate(8);
            f1.evaluate(5);
            f1.evaluate(10);
            System.out.println(f1.getTotalReviews());
            System.out.println(f1.mediaReviews());

            Serie lost = new Serie("lost", 2000);
            //lost.setName("lost");
            //lost.setYearRelease(2000);
            lost.display();
            lost.setSeasons(10);
            lost.setEpisodesPerSeason(10);
            lost.setMinPerEpisode(50);
            System.out.println("Duração da serie: " + lost.getDurationMin());

            Filme f2 = new Filme("Avatar", 2023);
            //f2.setName("AVtar");
            //f2.setYearRelease(2023);
            f2.setDurationMin(200);


            CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
            calculadora.includeFilm(f1);
            calculadora.includeFilm(f2);
            calculadora.includeFilm(lost);
            System.out.println(calculadora.getTotalTime());

            FiltroRecomendacao filtro = new FiltroRecomendacao();
            filtro.filtra(f1);

            Episodio episodio = new Episodio();
            episodio.setNumber(1);
            episodio.setSerie(lost);
            episodio.setTotalViews(300);
            filtro.filtra(episodio);

            Filme f3 = new Filme("Dogville", 2003);
            f3.setDurationMin(200);
            //f3.setName("Dogville");
            //f3.setYearRelease(2003);
            f3.evaluate(10);

            ArrayList<Filme> listaDeFilme = new ArrayList<>();
            listaDeFilme.add(f3);
            listaDeFilme.add(f1);
            listaDeFilme.add(f2);
            System.out.println("Tamanho da lista> " + listaDeFilme.size());
            System.out.println("Primeiro filme: " + listaDeFilme.get(0).getName());
            System.out.println(listaDeFilme);


        }
}
package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int totalTime = 0;

    public int getTotalTime() {
        return this.totalTime;
    }

//    public void includeFilm(Filme f){
//        this.totalTime += f.getDurationMin();
//    }

//    public void includeFilm(Serie s){
//        this.totalTime += s.getDurationMin();
//    }

    public void includeFilm(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.totalTime += titulo.getDurationMin();
    }
}

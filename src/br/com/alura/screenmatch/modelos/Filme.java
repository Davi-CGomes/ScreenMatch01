package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String director;

    public Filme(String name, int yearRelease){
        super(name, yearRelease);
    }

    @Override
    public int getClassificacao(){
        return (int)mediaReviews()/2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getYearRelease() + ") ";
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}

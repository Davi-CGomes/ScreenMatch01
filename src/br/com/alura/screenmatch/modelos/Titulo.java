package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String name;
    private int yearRelease;
    private boolean includePlan;
    private double sumReviews;
    private int totalReviews;
    private int durationMin;

    public Titulo(String name, int yearRelease) {
        this.name = name;
        this.yearRelease = yearRelease;
    }

    public String getName() {
        return name;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public boolean isIncludePlan() {
        return includePlan;
    }

    public int getDurationMin() {
        return durationMin;
    }

    public int getTotalReviews(){
        return totalReviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public void setIncludePlan(boolean includePlan) {
        this.includePlan = includePlan;
    }

    public void setDurationMin(int durationMin) {
        this.durationMin = durationMin;
    }

    public void display(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearRelease);
    }

    public void evaluate(double note){
        sumReviews += note;
        totalReviews++;
    }

    public double mediaReviews(){
        return sumReviews/totalReviews;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }
}

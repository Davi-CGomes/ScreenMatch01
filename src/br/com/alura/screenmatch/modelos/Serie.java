package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private int minPerEpisode;

    public Serie(String name, int yearRelease){
        super(name, yearRelease);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinPerEpisode() {
        return minPerEpisode;
    }

    public void setMinPerEpisode(int minPerEpisode) {
        this.minPerEpisode = minPerEpisode;
    }

    @Override
    public int getDurationMin() {
        return seasons * episodesPerSeason * minPerEpisode;
    }

    @Override
    public String toString() {
        return "Serie: " + this.getName() + "(" + this.getYearRelease() + ")";
    }
}

public interface Epreuve {
    
    public int participer(Equipe equipe);
    public int participer(Athlete athlete);

    public bool aParticipe(Equipe equipe);
    public bool aParticipe(Athlete athlete);

    public void ajouteScore(Equipe equipe, int score);
    public void ajouteScore(Athlete athlete, int score);
}
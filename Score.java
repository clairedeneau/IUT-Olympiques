public class Score<Integer, Double, Equipe> {
    
    private Integer position;
    private Double score;
    private Equipe participant;

    public Score(Integer classement, Double score, Equipe participant){
        /**
     * Constructeur pour initialiser un score avec une position, un score et un participant.
     *
     * @param position La position (classement) du participant.
     * @param score Le score du participant.
     * @param participant Le participant (équipe).
     */
        this.position = classement;
        this.score = score;
        this.participant = participant;
    }

    public Score(Integer classement, Equipe participant){
        /**
     * Constructeur pour initialiser un score avec une position et un participant, sans score.
     *
     * @param position La position (classement) du participant.
     * @param participant Le participant (équipe).
     */
        this.position = classement;
        this.score = null;
        this.participant = participant;
    }

    public Integer getPosition() {
        /**
     * Obtient la position du participant.
     *
     * @return La position du participant.
     */
        return position;
    }

    public void setPosition(Integer position) {
        /**
     * Modifie la position du participant.
     *
     * @param position La nouvelle position du participant.
     */
        this.position = position;
    }

    public Double getScore() {
        /**
     * Obtient le score du participant.
     *
     * @return Le score du participant.
     */
        return score;
    }

    public void setScore(Double score) {
        /**
     * Modifie le score du participant.
     *
     * @param score Le nouveau score du participant.
     */
        this.score = score;
    }

    public Equipe getParticipant() {
        /**
     * Obtient le participant.
     *
     * @return Le participant.
     */
        return participant;
    }

    public void setParticipant(Equipe participant) {
        /**
     * Modifie le participant.
     *
     * @param participant Le nouveau participant.
     */
        this.participant = participant;
    }

    @Override
    public String toString() {
        return "Score [position=" + position + ", score=" + score + ", participant=" + participant + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        result = prime * result + ((score == null) ? 0 : score.hashCode());
        result = prime * result + ((participant == null) ? 0 : participant.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        /**
     * Vérifie si cet objet Score est égal à un autre objet.
     *
     * @param obj L'objet à comparer avec cet objet Score.
     * @return true si les objets sont égaux, sinon false.
     */
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Score other = (Score) obj;
        if (position == null) {
            if (other.position != null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        if (score == null) {
            if (other.score != null)
                return false;
        } else if (!score.equals(other.score))
            return false;
        if (participant == null) {
            if (other.participant != null)
                return false;
        } else if (!participant.equals(other.participant))
            return false;
        return true;
    }
}
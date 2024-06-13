public class Score<Integer, Double, Equipe> {
    
    private Integer position;
    private Double score;
    private Equipe participant;

    public Score(Integer classement, Double score, Equipe participant){
        this.position = classement;
        this.score = score;
        this.participant = participant;
    }

    public Score(Integer classement, Equipe participant){
        this.position = classement;
        this.score = null;
        this.participant = participant;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Equipe getParticipant() {
        return participant;
    }

    public void setParticipant(Equipe participant) {
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


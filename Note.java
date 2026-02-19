
public class Note {
    private String matiere;
    private double note;

    public Note(String matiere, double note) {
        this.matiere = matiere;
        this.note = note;
    }

    public String getMatiere() {
        return matiere;
    }

    public double getNote() {
        return note;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public void setNote(double note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "(" + matiere + " : " + note + ")";
    }
}

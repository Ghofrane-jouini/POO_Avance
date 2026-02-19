import java.util.ArrayList;

public class Etudiant implements Statisticable, Comparable<Etudiant> {
    public String nom;
    public String matricule;
    ArrayList<Note> notes;

    public Etudiant(String nom, String matricule) {
        this.nom = nom;
        this.matricule = matricule;
        this.notes = new ArrayList<Note>();
    }

    public String getNom() {
        return nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void addNote(Note note) {
        this.notes.add(note);
    }

    @Override
    public float getMoyenne() {
        double sum = 0;
        for (Note n : this.notes) {
            sum += n.getNote();
        }
        return (float) (sum / this.notes.size());
    }

    @Override
    public int compareTo(Etudiant e) {
        return this.matricule.compareTo(e.matricule);
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", matricule=" + matricule +
                ", notes=" + notes +
                '}';
    }
}
import java.util.ArrayList;

public class Stat {

    public float moyenne(Etudiant e) {
        return e.getMoyenne();
    }

    public float max(Etudiant e) {
        if (e.getNotes().isEmpty())
            return 0;

        float max = (float) e.getNotes().get(0).getNote();

        for (Note n : e.getNotes()) {
            if (n.getNote() > max) {
                max = (float) n.getNote();
            }
        }
        return max;
    }

    public float min(Etudiant e) {
        if (e.getNotes().isEmpty())
            return 0;

        float min = (float) e.getNotes().get(0).getNote();

        for (Note n : e.getNotes()) {
            if (n.getNote() < min) {
                min = (float) n.getNote();
            }
        }
        return min;
    }

    /* moyenne du groupe */

    public float moyenne(ArrayList<Etudiant> classe) {
        if (classe.isEmpty())
            return 0;

        float sum = 0;
        for (Etudiant e : classe) {
            sum += e.getMoyenne();
        }
        return sum / classe.size();
    }

    public Etudiant meilleur(ArrayList<Etudiant> classe) {
        if (classe.isEmpty())
            return null;

        Etudiant meilleurE = classe.get(0);

        for (Etudiant e : classe) {
            if (e.getMoyenne() > meilleurE.getMoyenne()) {
                meilleurE = e;
            }
        }
        return meilleurE;
    }

    public Etudiant moinsBon(ArrayList<Etudiant> classe) {
        if (classe.isEmpty())
            return null;

        Etudiant moinsBonE = classe.get(0);

        for (Etudiant e : classe) {
            if (e.getMoyenne() < moinsBonE.getMoyenne()) {
                moinsBonE = e;
            }
        }
        return moinsBonE;
    }
}

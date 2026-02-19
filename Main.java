import java.util.*;

public class Main {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("mimi", "1");
        e1.addNote(new Note("Math", 15));
        e1.addNote(new Note("Info", 14));

        Etudiant e2 = new Etudiant("blgasem", "2");
        e2.addNote(new Note("Math", 10));
        e2.addNote(new Note("Info", 12));

        Etudiant e3 = new Etudiant("foufa", "3");
        e3.addNote(new Note("Math", 18));
        e3.addNote(new Note("Info", 17));

        ArrayList<Etudiant> classe = new ArrayList<>();
        classe.add(e1);
        classe.add(e2);
        classe.add(e3);

        System.out.println(" Liste initiale ");
        for (Etudiant e : classe) {
            System.out.println(e);
        }

        Collections.sort(classe);
        System.out.println("\n Tri par matricule ");
        for (Etudiant e : classe) {
            System.out.println(e.getNom() + " : " + e.getMatricule());
        }

        Collections.sort(classe, new CompareMoyenne());
        System.out.println("\n Tri par moyenne ");
        for (Etudiant e : classe) {
            System.out.println(e.getNom() + " : " + e.getMoyenne());
        }

        Collections.sort(classe, new CompareNom());
        System.out.println("\n Tri par nom ");
        for (Etudiant e : classe) {
            System.out.println(e.getNom());
        }

        Stat stat = new Stat();

        System.out.println("\nMoyenne de la classe : " + stat.moyenne(classe));
        System.out.println("Meilleur etudiant : " + stat.meilleur(classe));
        System.out.println("Moins bon etudiant : " + stat.moinsBon(classe));
    }
}

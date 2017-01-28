package geekdos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by theXuser on 1/5/2017.
 */
public class NotesManagerImpl extends GestionNotesInterfacePOA {
    List<Etudiant> etudiants = new ArrayList<Etudiant>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        this.etudiants.add(e);
    }

    @Override
    public float getNote(String cne) {
        float note = 0;

        for (Etudiant etudiant: etudiants) {
            if (cne.equals(etudiant.cne)) {
                note = calculeMoyenne(etudiant);
            }
        }
        return note;
    }

    @Override
    public Etudiant[] getEtudiantsTries() {
        Etudiant[] etudiantsArray = new Etudiant[etudiants.size()];
        Etudiant[] etudiantsArraytrie = new Etudiant[etudiants.size()];
        for (int i = 0; i < etudiantsArray.length ;i++){
            etudiantsArray[i] = etudiants.get(i);
            if (calculeMoyenne(etudiantsArray[i]) >= calculeMoyenne(etudiantsArray[i+1])){
                etudiantsArraytrie[i] = etudiantsArray[i];
            }
        }
        return etudiantsArraytrie;
    }

    @Override
    public Etudiant[] getValidant() {
        return new Etudiant[0];
    }

    @Override
    public Etudiant getMajorant() {
        double note = 0;double max = 0;
        Etudiant magoron = null;

        for (Etudiant Etudiant: etudiants) {
            note = calculeMoyenne(Etudiant);
            if (note > max){
                max = note;
                magoron = Etudiant;
            }
        }
        return magoron;
    }

    private float calculeMoyenne(Etudiant etudiant){
        float sommeNotes =  etudiant.note1 + etudiant.note2;
        return sommeNotes / 2;
    }

}

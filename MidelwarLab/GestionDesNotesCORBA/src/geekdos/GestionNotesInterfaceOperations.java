package geekdos;


/**
* geekdos/GestionNotesInterfaceOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GestionNotes.idl
* Thursday, January 5, 2017 10:44:12 AM WET
*/

public interface GestionNotesInterfaceOperations 
{
  void ajouterEtudiant (geekdos.Etudiant e);
  float getNote (String cne);
  geekdos.Etudiant[] getEtudiantsTries ();
  geekdos.Etudiant[] getValidant ();
  geekdos.Etudiant getMajorant ();
} // interface GestionNotesInterfaceOperations

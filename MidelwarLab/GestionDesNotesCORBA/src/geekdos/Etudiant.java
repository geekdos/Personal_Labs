package geekdos;


/**
* geekdos/Etudiant.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GestionNotes.idl
* Thursday, January 5, 2017 10:44:12 AM WET
*/

public final class Etudiant implements org.omg.CORBA.portable.IDLEntity
{
  public float note1 = (float)0;
  public float note2 = (float)0;
  public String nom = null;
  public String prenom = null;
  public String cne = null;

  public Etudiant ()
  {
  } // ctor

  public Etudiant (float _note1, float _note2, String _nom, String _prenom, String _cne)
  {
    note1 = _note1;
    note2 = _note2;
    nom = _nom;
    prenom = _prenom;
    cne = _cne;
  } // ctor

} // class Etudiant

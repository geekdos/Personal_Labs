package geekdos;

/**
* geekdos/GestionNotesInterfaceHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GestionNotes.idl
* Thursday, January 5, 2017 10:44:12 AM WET
*/

public final class GestionNotesInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public geekdos.GestionNotesInterface value = null;

  public GestionNotesInterfaceHolder ()
  {
  }

  public GestionNotesInterfaceHolder (geekdos.GestionNotesInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = geekdos.GestionNotesInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    geekdos.GestionNotesInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return geekdos.GestionNotesInterfaceHelper.type ();
  }

}

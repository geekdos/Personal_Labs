package Converter.dev;

/**
* EuroHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Euro.idl
* jeudi 29 d�cembre 2016 10 h 52 WET
*/

public final class EuroHolder implements org.omg.CORBA.portable.Streamable
{
  public Euro value = null;

  public EuroHolder ()
  {
  }

  public EuroHolder (Euro initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EuroHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EuroHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EuroHelper.type ();
  }

}

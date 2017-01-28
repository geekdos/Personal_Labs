package Converter.dev;

/**
* EuroHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Euro.idl
* jeudi 29 d�cembre 2016 10 h 52 WET
*/

abstract public class EuroHelper
{
  private static String  _id = "IDL:Euro:1.0";

  public static void insert (org.omg.CORBA.Any a, Euro that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Euro extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (EuroHelper.id (), "Euro");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Euro read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_EuroStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Euro value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static Euro narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Euro)
      return (Euro)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _EuroStub stub = new _EuroStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static Euro unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof Euro)
      return (Euro)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      _EuroStub stub = new _EuroStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
package msg;


/**
* msg/Message.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GestionMsgElectronique.idl
* Thursday, January 12, 2017 11:34:32 AM WET
*/

public final class Message implements org.omg.CORBA.portable.IDLEntity
{
  public String client = null;
  public String subject = null;
  public String corps = null;
  public msg.Date date = null;

  public Message ()
  {
  } // ctor

  public Message (String _client, String _subject, String _corps, msg.Date _date)
  {
    client = _client;
    subject = _subject;
    corps = _corps;
    date = _date;
  } // ctor

} // class Message

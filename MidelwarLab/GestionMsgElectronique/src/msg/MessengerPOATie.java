package msg;


/**
* msg/MessengerPOATie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GestionMsgElectronique.idl
* Thursday, January 12, 2017 11:34:32 AM WET
*/

public class MessengerPOATie extends MessengerPOA
{

  // Constructors

  public MessengerPOATie ( msg.MessengerOperations delegate ) {
      this._impl = delegate;
  }
  public MessengerPOATie ( msg.MessengerOperations delegate , org.omg.PortableServer.POA poa ) {
      this._impl = delegate;
      this._poa      = poa;
  }
  public msg.MessengerOperations _delegate() {
      return this._impl;
  }
  public void _delegate (msg.MessengerOperations delegate ) {
      this._impl = delegate;
  }
  public org.omg.PortableServer.POA _default_POA() {
      if(_poa != null) {
          return _poa;
      }
      else {
          return super._default_POA();
      }
  }
  public int signup ()
  {
    return _impl.signup();
  } // signup

  public void submit (int id, msg.Message msg)
  {
    _impl.submit(id, msg);
  } // submit

  public msg.Message consult (int id)
  {
    return _impl.consult(id);
  } // consult

  private msg.MessengerOperations _impl;
  private org.omg.PortableServer.POA _poa;

} // class MessengerPOATie


package com.geekdos.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.geekdos.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SayChirira_QNAME = new QName("http://service.geekdos.com/", "sayChirira");
    private final static QName _SayChiriraResponse_QNAME = new QName("http://service.geekdos.com/", "sayChiriraResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.geekdos.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayChiriraResponse }
     * 
     */
    public SayChiriraResponse createSayChiriraResponse() {
        return new SayChiriraResponse();
    }

    /**
     * Create an instance of {@link SayChirira }
     * 
     */
    public SayChirira createSayChirira() {
        return new SayChirira();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayChirira }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "sayChirira")
    public JAXBElement<SayChirira> createSayChirira(SayChirira value) {
        return new JAXBElement<SayChirira>(_SayChirira_QNAME, SayChirira.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayChiriraResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "sayChiriraResponse")
    public JAXBElement<SayChiriraResponse> createSayChiriraResponse(SayChiriraResponse value) {
        return new JAXBElement<SayChiriraResponse>(_SayChiriraResponse_QNAME, SayChiriraResponse.class, null, value);
    }

}

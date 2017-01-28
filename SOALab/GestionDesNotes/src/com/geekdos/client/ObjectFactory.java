
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

    private final static QName _AjouterEtudiant_QNAME = new QName("http://service.geekdos.com/", "ajouterEtudiant");
    private final static QName _AjouterEtudiantResponse_QNAME = new QName("http://service.geekdos.com/", "ajouterEtudiantResponse");
    private final static QName _GetNonValidationResponse_QNAME = new QName("http://service.geekdos.com/", "getNonValidationResponse");
    private final static QName _GetRatResponse_QNAME = new QName("http://service.geekdos.com/", "getRatResponse");
    private final static QName _SaveEtudiants_QNAME = new QName("http://service.geekdos.com/", "saveEtudiants");
    private final static QName _GetRat_QNAME = new QName("http://service.geekdos.com/", "getRat");
    private final static QName _GetNoteResponse_QNAME = new QName("http://service.geekdos.com/", "getNoteResponse");
    private final static QName _GetNonValidation_QNAME = new QName("http://service.geekdos.com/", "getNonValidation");
    private final static QName _SaveEtudiantsResponse_QNAME = new QName("http://service.geekdos.com/", "saveEtudiantsResponse");
    private final static QName _GetAllEtudiants_QNAME = new QName("http://service.geekdos.com/", "getAllEtudiants");
    private final static QName _GetNote_QNAME = new QName("http://service.geekdos.com/", "getNote");
    private final static QName _GetvalidationResponse_QNAME = new QName("http://service.geekdos.com/", "getvalidationResponse");
    private final static QName _GetAllEtudiantsResponse_QNAME = new QName("http://service.geekdos.com/", "getAllEtudiantsResponse");
    private final static QName _Getvalidation_QNAME = new QName("http://service.geekdos.com/", "getvalidation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.geekdos.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNoteResponse }
     * 
     */
    public GetNoteResponse createGetNoteResponse() {
        return new GetNoteResponse();
    }

    /**
     * Create an instance of {@link GetNonValidation }
     * 
     */
    public GetNonValidation createGetNonValidation() {
        return new GetNonValidation();
    }

    /**
     * Create an instance of {@link AjouterEtudiant }
     * 
     */
    public AjouterEtudiant createAjouterEtudiant() {
        return new AjouterEtudiant();
    }

    /**
     * Create an instance of {@link AjouterEtudiantResponse }
     * 
     */
    public AjouterEtudiantResponse createAjouterEtudiantResponse() {
        return new AjouterEtudiantResponse();
    }

    /**
     * Create an instance of {@link GetNonValidationResponse }
     * 
     */
    public GetNonValidationResponse createGetNonValidationResponse() {
        return new GetNonValidationResponse();
    }

    /**
     * Create an instance of {@link GetRatResponse }
     * 
     */
    public GetRatResponse createGetRatResponse() {
        return new GetRatResponse();
    }

    /**
     * Create an instance of {@link SaveEtudiants }
     * 
     */
    public SaveEtudiants createSaveEtudiants() {
        return new SaveEtudiants();
    }

    /**
     * Create an instance of {@link GetRat }
     * 
     */
    public GetRat createGetRat() {
        return new GetRat();
    }

    /**
     * Create an instance of {@link GetAllEtudiants }
     * 
     */
    public GetAllEtudiants createGetAllEtudiants() {
        return new GetAllEtudiants();
    }

    /**
     * Create an instance of {@link GetNote }
     * 
     */
    public GetNote createGetNote() {
        return new GetNote();
    }

    /**
     * Create an instance of {@link SaveEtudiantsResponse }
     * 
     */
    public SaveEtudiantsResponse createSaveEtudiantsResponse() {
        return new SaveEtudiantsResponse();
    }

    /**
     * Create an instance of {@link GetvalidationResponse }
     * 
     */
    public GetvalidationResponse createGetvalidationResponse() {
        return new GetvalidationResponse();
    }

    /**
     * Create an instance of {@link GetAllEtudiantsResponse }
     * 
     */
    public GetAllEtudiantsResponse createGetAllEtudiantsResponse() {
        return new GetAllEtudiantsResponse();
    }

    /**
     * Create an instance of {@link Getvalidation }
     * 
     */
    public Getvalidation createGetvalidation() {
        return new Getvalidation();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link Etudiant }
     * 
     */
    public Etudiant createEtudiant() {
        return new Etudiant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiant }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "ajouterEtudiant")
    public JAXBElement<AjouterEtudiant> createAjouterEtudiant(AjouterEtudiant value) {
        return new JAXBElement<AjouterEtudiant>(_AjouterEtudiant_QNAME, AjouterEtudiant.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEtudiantResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "ajouterEtudiantResponse")
    public JAXBElement<AjouterEtudiantResponse> createAjouterEtudiantResponse(AjouterEtudiantResponse value) {
        return new JAXBElement<AjouterEtudiantResponse>(_AjouterEtudiantResponse_QNAME, AjouterEtudiantResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNonValidationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getNonValidationResponse")
    public JAXBElement<GetNonValidationResponse> createGetNonValidationResponse(GetNonValidationResponse value) {
        return new JAXBElement<GetNonValidationResponse>(_GetNonValidationResponse_QNAME, GetNonValidationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getRatResponse")
    public JAXBElement<GetRatResponse> createGetRatResponse(GetRatResponse value) {
        return new JAXBElement<GetRatResponse>(_GetRatResponse_QNAME, GetRatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "saveEtudiants")
    public JAXBElement<SaveEtudiants> createSaveEtudiants(SaveEtudiants value) {
        return new JAXBElement<SaveEtudiants>(_SaveEtudiants_QNAME, SaveEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getRat")
    public JAXBElement<GetRat> createGetRat(GetRat value) {
        return new JAXBElement<GetRat>(_GetRat_QNAME, GetRat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getNoteResponse")
    public JAXBElement<GetNoteResponse> createGetNoteResponse(GetNoteResponse value) {
        return new JAXBElement<GetNoteResponse>(_GetNoteResponse_QNAME, GetNoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNonValidation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getNonValidation")
    public JAXBElement<GetNonValidation> createGetNonValidation(GetNonValidation value) {
        return new JAXBElement<GetNonValidation>(_GetNonValidation_QNAME, GetNonValidation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "saveEtudiantsResponse")
    public JAXBElement<SaveEtudiantsResponse> createSaveEtudiantsResponse(SaveEtudiantsResponse value) {
        return new JAXBElement<SaveEtudiantsResponse>(_SaveEtudiantsResponse_QNAME, SaveEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEtudiants }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getAllEtudiants")
    public JAXBElement<GetAllEtudiants> createGetAllEtudiants(GetAllEtudiants value) {
        return new JAXBElement<GetAllEtudiants>(_GetAllEtudiants_QNAME, GetAllEtudiants.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getNote")
    public JAXBElement<GetNote> createGetNote(GetNote value) {
        return new JAXBElement<GetNote>(_GetNote_QNAME, GetNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetvalidationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getvalidationResponse")
    public JAXBElement<GetvalidationResponse> createGetvalidationResponse(GetvalidationResponse value) {
        return new JAXBElement<GetvalidationResponse>(_GetvalidationResponse_QNAME, GetvalidationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllEtudiantsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getAllEtudiantsResponse")
    public JAXBElement<GetAllEtudiantsResponse> createGetAllEtudiantsResponse(GetAllEtudiantsResponse value) {
        return new JAXBElement<GetAllEtudiantsResponse>(_GetAllEtudiantsResponse_QNAME, GetAllEtudiantsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getvalidation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.geekdos.com/", name = "getvalidation")
    public JAXBElement<Getvalidation> createGetvalidation(Getvalidation value) {
        return new JAXBElement<Getvalidation>(_Getvalidation_QNAME, Getvalidation.class, null, value);
    }

}

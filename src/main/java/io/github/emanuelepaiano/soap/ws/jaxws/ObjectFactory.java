//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.11.29 alle 09:42:31 AM CET 
//


package io.github.emanuelepaiano.soap.ws.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.github.emanuelepaiano.soap.ws.jaxws package. 
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

    private final static QName _GetHelloAsString_QNAME = new QName("http://endpoint.soap.emanuelepaiano.github.io/", "getHelloAsString");
    private final static QName _GetHelloAsStringResponse_QNAME = new QName("http://endpoint.soap.emanuelepaiano.github.io/", "getHelloAsStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.github.emanuelepaiano.soap.ws.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHelloAsString }
     * 
     */
    public GetHelloAsString createGetHelloAsString() {
        return new GetHelloAsString();
    }

    /**
     * Create an instance of {@link GetHelloAsStringResponse }
     * 
     */
    public GetHelloAsStringResponse createGetHelloAsStringResponse() {
        return new GetHelloAsStringResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloAsString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soap.emanuelepaiano.github.io/", name = "getHelloAsString")
    public JAXBElement<GetHelloAsString> createGetHelloAsString(GetHelloAsString value) {
        return new JAXBElement<GetHelloAsString>(_GetHelloAsString_QNAME, GetHelloAsString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloAsStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoint.soap.emanuelepaiano.github.io/", name = "getHelloAsStringResponse")
    public JAXBElement<GetHelloAsStringResponse> createGetHelloAsStringResponse(GetHelloAsStringResponse value) {
        return new JAXBElement<GetHelloAsStringResponse>(_GetHelloAsStringResponse_QNAME, GetHelloAsStringResponse.class, null, value);
    }

}

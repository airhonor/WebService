
package com.honorzhang.web.service.client.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.honorzhang.web.service.client.ws package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertPeople_QNAME = new QName("http://service.people.com/wsdl", "insertPeople");
    private final static QName _InsertPeopleResponse_QNAME = new QName("http://service.people.com/wsdl", "insertPeopleResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.honorzhang.web.service.client.ws
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertPeople }
     */
    public InsertPeople createInsertPeople() {
        return new InsertPeople();
    }

    /**
     * Create an instance of {@link InsertPeopleResponse }
     */
    public InsertPeopleResponse createInsertPeopleResponse() {
        return new InsertPeopleResponse();
    }

    /**
     * Create an instance of {@link People }
     */
    public People createPeople() {
        return new People();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPeople }{@code >}}
     */
    @XmlElementDecl(namespace = "http://service.people.com/wsdl", name = "insertPeople")
    public JAXBElement<InsertPeople> createInsertPeople(InsertPeople value) {
        return new JAXBElement<InsertPeople>(_InsertPeople_QNAME, InsertPeople.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPeopleResponse }{@code >}}
     */
    @XmlElementDecl(namespace = "http://service.people.com/wsdl", name = "insertPeopleResponse")
    public JAXBElement<InsertPeopleResponse> createInsertPeopleResponse(InsertPeopleResponse value) {
        return new JAXBElement<InsertPeopleResponse>(_InsertPeopleResponse_QNAME, InsertPeopleResponse.class, null, value);
    }

}

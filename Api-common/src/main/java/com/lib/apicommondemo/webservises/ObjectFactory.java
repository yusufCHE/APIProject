
package com.lib.apicommondemo.webservises;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.lib.apicommondemo.webservises package. 
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

    private final static QName _GetCustomerById_QNAME = new QName("http://WebServises.apicommondemo.lib.com/", "getCustomerById");
    private final static QName _GetAllCustomers_QNAME = new QName("http://WebServises.apicommondemo.lib.com/", "getAllCustomers");
    private final static QName _GetAllCustomersResponse_QNAME = new QName("http://WebServises.apicommondemo.lib.com/", "getAllCustomersResponse");
    private final static QName _SaveCustomer_QNAME = new QName("http://WebServises.apicommondemo.lib.com/", "saveCustomer");
    private final static QName _Customers_QNAME = new QName("http://WebServises.apicommondemo.lib.com/", "customers");
    private final static QName _SaveCustomerResponse_QNAME = new QName("http://WebServises.apicommondemo.lib.com/", "saveCustomerResponse");
    private final static QName _GetCustomerByIdResponse_QNAME = new QName("http://WebServises.apicommondemo.lib.com/", "getCustomerByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.lib.apicommondemo.webservises
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCustomersResponse }
     * 
     */
    public GetAllCustomersResponse createGetAllCustomersResponse() {
        return new GetAllCustomersResponse();
    }

    /**
     * Create an instance of {@link SaveCustomer }
     * 
     */
    public SaveCustomer createSaveCustomer() {
        return new SaveCustomer();
    }

    /**
     * Create an instance of {@link GetCustomerById }
     * 
     */
    public GetCustomerById createGetCustomerById() {
        return new GetCustomerById();
    }

    /**
     * Create an instance of {@link GetAllCustomers }
     * 
     */
    public GetAllCustomers createGetAllCustomers() {
        return new GetAllCustomers();
    }

    /**
     * Create an instance of {@link SaveCustomerResponse }
     * 
     */
    public SaveCustomerResponse createSaveCustomerResponse() {
        return new SaveCustomerResponse();
    }

    /**
     * Create an instance of {@link Customers }
     * 
     */
    public Customers createCustomers() {
        return new Customers();
    }

    /**
     * Create an instance of {@link GetCustomerByIdResponse }
     * 
     */
    public GetCustomerByIdResponse createGetCustomerByIdResponse() {
        return new GetCustomerByIdResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServises.apicommondemo.lib.com/", name = "getCustomerById")
    public JAXBElement<GetCustomerById> createGetCustomerById(GetCustomerById value) {
        return new JAXBElement<GetCustomerById>(_GetCustomerById_QNAME, GetCustomerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServises.apicommondemo.lib.com/", name = "getAllCustomers")
    public JAXBElement<GetAllCustomers> createGetAllCustomers(GetAllCustomers value) {
        return new JAXBElement<GetAllCustomers>(_GetAllCustomers_QNAME, GetAllCustomers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServises.apicommondemo.lib.com/", name = "getAllCustomersResponse")
    public JAXBElement<GetAllCustomersResponse> createGetAllCustomersResponse(GetAllCustomersResponse value) {
        return new JAXBElement<GetAllCustomersResponse>(_GetAllCustomersResponse_QNAME, GetAllCustomersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServises.apicommondemo.lib.com/", name = "saveCustomer")
    public JAXBElement<SaveCustomer> createSaveCustomer(SaveCustomer value) {
        return new JAXBElement<SaveCustomer>(_SaveCustomer_QNAME, SaveCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServises.apicommondemo.lib.com/", name = "customers")
    public JAXBElement<Customers> createCustomers(Customers value) {
        return new JAXBElement<Customers>(_Customers_QNAME, Customers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServises.apicommondemo.lib.com/", name = "saveCustomerResponse")
    public JAXBElement<SaveCustomerResponse> createSaveCustomerResponse(SaveCustomerResponse value) {
        return new JAXBElement<SaveCustomerResponse>(_SaveCustomerResponse_QNAME, SaveCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServises.apicommondemo.lib.com/", name = "getCustomerByIdResponse")
    public JAXBElement<GetCustomerByIdResponse> createGetCustomerByIdResponse(GetCustomerByIdResponse value) {
        return new JAXBElement<GetCustomerByIdResponse>(_GetCustomerByIdResponse_QNAME, GetCustomerByIdResponse.class, null, value);
    }

}

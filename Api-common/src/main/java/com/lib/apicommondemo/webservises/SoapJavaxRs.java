
package com.lib.apicommondemo.webservises;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapJavaxRs", targetNamespace = "http://WebServises.apicommondemo.lib.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapJavaxRs {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.lib.apicommondemo.webservises.Customers
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCustomerById", targetNamespace = "http://WebServises.apicommondemo.lib.com/", className = "com.lib.apicommondemo.webservises.GetCustomerById")
    @ResponseWrapper(localName = "getCustomerByIdResponse", targetNamespace = "http://WebServises.apicommondemo.lib.com/", className = "com.lib.apicommondemo.webservises.GetCustomerByIdResponse")
    @Action(input = "http://WebServises.apicommondemo.lib.com/SoapJavaxRs/getCustomerByIdRequest", output = "http://WebServises.apicommondemo.lib.com/SoapJavaxRs/getCustomerByIdResponse")
    public Customers getCustomerById(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.lib.apicommondemo.webservises.Customers>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllCustomers", targetNamespace = "http://WebServises.apicommondemo.lib.com/", className = "com.lib.apicommondemo.webservises.GetAllCustomers")
    @ResponseWrapper(localName = "getAllCustomersResponse", targetNamespace = "http://WebServises.apicommondemo.lib.com/", className = "com.lib.apicommondemo.webservises.GetAllCustomersResponse")
    @Action(input = "http://WebServises.apicommondemo.lib.com/SoapJavaxRs/getAllCustomersRequest", output = "http://WebServises.apicommondemo.lib.com/SoapJavaxRs/getAllCustomersResponse")
    public List<Customers> getAllCustomers();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveCustomer", targetNamespace = "http://WebServises.apicommondemo.lib.com/", className = "com.lib.apicommondemo.webservises.SaveCustomer")
    @ResponseWrapper(localName = "saveCustomerResponse", targetNamespace = "http://WebServises.apicommondemo.lib.com/", className = "com.lib.apicommondemo.webservises.SaveCustomerResponse")
    @Action(input = "http://WebServises.apicommondemo.lib.com/SoapJavaxRs/saveCustomerRequest", output = "http://WebServises.apicommondemo.lib.com/SoapJavaxRs/saveCustomerResponse")
    public void saveCustomer(
        @WebParam(name = "arg0", targetNamespace = "")
        Customers arg0);

}

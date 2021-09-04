package com.lib.apicommondemo.WebServises;

import com.lib.apicommondemo.Repositories.CustomersRepo;
import com.lib.apicommondemo.entities.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Component
@WebService(serviceName = "Customers")
public class SoapJavaxRs {
    @Autowired
    private CustomersRepo repoCustomers;

    @WebMethod
    public List<Customers> getAllCustomers(){
        return repoCustomers.findAll();
    }

    @WebMethod
    public Customers getCustomerById(@WebParam String id){
        return repoCustomers.findById(id).get();
    }

   @WebMethod
    public void saveCustomer(Customers customer){
        repoCustomers.save(customer);
    }
}


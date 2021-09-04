package com.lib.apicommondemo.WebServises;

import com.lib.apicommondemo.entities.Customers;
import com.lib.apicommondemo.Repositories.CustomersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;




@Component
@Path("/Customers")
public class RestJavaxRs {
    @Autowired
    private CustomersRepo repoCustomers;

    @Path("/Customer")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Customers> getAllCustomers(){
        return repoCustomers.findAll();
    }

    @Path("/Customer/{id}")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Customers getCustomerById(@PathParam(value = "id") String id){
        return repoCustomers.findById(id).get();
    }

    @Path("/V1")
    @POST
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public void saveCustomer(Customers customer){
        repoCustomers.save(customer);
    }
}


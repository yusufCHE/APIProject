package com.example.apicommondemo.restRequest;

import com.example.apicommondemo.entities.Customers;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomersRequest {

    private final CustmorService custmorService;

    public CustomersRequest(CustmorService custmorService) {
        this.custmorService = custmorService;
    }

    //GET
    @RequestMapping(value = "/Customers", method = RequestMethod.GET)
    public List<Customers> getCustomers(){
        return custmorService.getAllCustomers();
    }
    @RequestMapping(value ="/Customers/{id}" )
    public Customers getCustomerById(@PathVariable String id){
        return custmorService.getCustomer(id);
    }
    //POST
    @RequestMapping(value = "/Customers/V1", method = RequestMethod.POST)
    public void saveCustomer(@RequestBody Customers customer){
        custmorService.saveCustomer(customer);
    }

}

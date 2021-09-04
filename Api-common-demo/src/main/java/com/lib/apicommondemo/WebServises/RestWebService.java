package com.lib.apicommondemo.WebServises;




import com.lib.apicommondemo.entities.Customers;
import com.lib.apicommondemo.Repositories.CustomersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.*;
import java.util.List;

//@RestController
//@RequestMapping("Api")
public class RestWebService {
    @Autowired
    private CustomersRepo repoCustomers;

    @GetMapping(value = "/Customers",produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Customers> getAllCustomers(){
        return repoCustomers.findAll();
    }

    @GetMapping(name = "/Customers/{id}")
    public Customers getCustomerById(@PathVariable String id){
        return repoCustomers.findById(id).get();
    }

    @PostMapping(path = "/V1")
    public void saveCustomer(@RequestBody Customers customer){
        repoCustomers.save(customer);
    }
}

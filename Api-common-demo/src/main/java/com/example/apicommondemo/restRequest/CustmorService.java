package com.example.apicommondemo.restRequest;

import com.example.apicommondemo.dao.CustomersRepo;
import com.example.apicommondemo.entities.Customers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustmorService {

    private final CustomersRepo customersRepo ;

    public CustmorService(CustomersRepo customersRepo) {
        this.customersRepo = customersRepo;
    }


    //Return All customers

    public List<Customers> getAllCustomers(){
        return customersRepo.findAll();
    }


    //Return one customer

    public Customers getCustomer(String id){
        for (Customers C: customersRepo.findAll()){
            if (id.equals(C.getBankCode())) {
                return C;
            }
        }
        return null;
    }


    //save customer
    public void saveCustomer(Customers customer){
        this.customersRepo.save(customer);
    }




}

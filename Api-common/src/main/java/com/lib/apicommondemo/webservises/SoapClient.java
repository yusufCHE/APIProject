package com.lib.apicommondemo.webservises;

import java.util.ArrayList;
import java.util.List;

public class SoapClient {

    public static void main(String[] args) {
        SoapJavaxRs stub = new Customers_Service().getSoapJavaxRsPort();
        List<Customers> customers;
        customers = stub.getAllCustomers();
        System.out.println(customers);

    }
}

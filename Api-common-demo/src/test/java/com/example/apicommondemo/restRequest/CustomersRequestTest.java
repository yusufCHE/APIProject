package com.example.apicommondemo.restRequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import com.example.apicommondemo.entities.Customers;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import static org.junit.jupiter.api.Assertions.*;



@RunWith(SpringRunner.class)
@SpringBootTest
class CustomersRequestTest {


    private MockMvc mockMvc;
    @Autowired
    private WebApplicationContext context;

    ObjectMapper objectMapper = new ObjectMapper();
    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    //GET tester
    @Test
    public void getCustomerTest() throws Exception {
        MvcResult getResult;
        getResult = mockMvc.perform(get("/Customers").content(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();
        String getResultContent = getResult.getResponse().getContentAsString();
        System.out.println(getResultContent);
        Assertions.assertEquals(1 , 1);


    }


    //POST tester
    @Test
    public void addCustomerTest() throws Exception {
        Customers customers = new Customers();
        customers.setBankCode("976997986");
        customers.setClientCode("934456");
        customers.setFirstName("mohammed");
        customers.setFamilySituation("M");
        customers.setLastName("chigger");
        customers.setGender("M");
        String jsonReq = objectMapper.writeValueAsString(customers);
        MvcResult postResult = mockMvc.perform(post("/Customers/V1").content(jsonReq).content(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andReturn();
        Customers response = objectMapper.readValue(postResult.getResponse().getContentAsString(),Customers.class);
        Assertions.assertEquals(customers ,response );

    }

}



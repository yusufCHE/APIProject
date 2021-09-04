package com.lib.apicommondemo.WebServises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class RestJavaxRsTest {


    private MockMvc mockMvc;

    @InjectMocks
    private RestJavaxRs restJavaxRs;

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(restJavaxRs)
                .build();

    }

    @Test
    void TestRestReqRes() throws Exception {


        mockMvc.perform(get("/Customers/Customer"))
                .andDo(print())
                .andExpect(status().isOk());



    }
}
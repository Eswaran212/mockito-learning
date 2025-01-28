package com.erangan.mockito.springboot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@ExtendWith(SpringExtension.class)
@WebMvcTest(ApplicationController.class)
public class ApplicationControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void testHealthCheckUrl() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/health").accept(MediaType.APPLICATION_JSON);
        MvcResult result= mockMvc.perform(request).andReturn();
        String response =result.getResponse().getContentAsString();
        System.out.println(response);

    }
}

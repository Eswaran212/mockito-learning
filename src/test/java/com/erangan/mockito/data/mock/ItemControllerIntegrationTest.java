package com.erangan.mockito.data.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ItemControllerIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getItemTest(){
        ResponseEntity result =restTemplate.getForEntity("/item",Object.class);
        assertEquals(true,result.getStatusCode().is2xxSuccessful());
        System.out.println(result.getBody().toString());
    }

    @Test
    public void getItemListTest(){
        ResponseEntity result =restTemplate.getForEntity("/item-list",Object.class);
        assertEquals(true,result.getStatusCode().is2xxSuccessful());
        System.out.println(result.getBody().toString());
    }

}

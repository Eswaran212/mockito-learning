package com.erangan.mockito.data.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class})
public class MockArrayListTest {
    List data = mock(List.class);

    @Test
    void basicTest(){
        when(data.size()).thenReturn(0).thenReturn(30);
        assertEquals(0,data.size());
        assertEquals(30,data.size());
        assertNotEquals(10,data.size());
    }
    @Test
    void withString(){
        when(data.get(2)).thenReturn("TWO").thenReturn("ONE");
        assertEquals("TWO",data.get(2));
        assertNotEquals("ONE",data.get(1));
    }
}

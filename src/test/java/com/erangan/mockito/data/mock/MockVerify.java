package com.erangan.mockito.data.mock;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class MockVerify {
    List data = mock(List.class);

    @Test
    void verifyCall(){
        String value1= (String) data.get(0);
        String value2= (String) data.get(0);
        String value3= (String) data.get(1);
        verify(data,atLeast(2)).get(0);
        verify(data,atMost(3)).get(anyInt());
        verify(data,times(3)).get(anyInt());
    }
}

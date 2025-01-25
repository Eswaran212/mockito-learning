package com.erangan.mockito.data.mock;

import com.erangan.mockito.service.DataService;
import com.erangan.mockito.service.PerformCalculationImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MockWithInjectMockTest {
        @InjectMocks PerformCalculationImpl impl;
        @Mock DataService dataService;

        @Test
        void testDataServiceBasedAddition(){
        when(dataService.retreiveAllData()).thenReturn(new int[]{1,2,3});
        assertEquals(6,impl.PerformAdditionViaDataService());
    }

        @Test
        void testDataServiceWithNoArg(){
        when(dataService.retreiveAllData()).thenReturn(new int[]{});
        int result =impl.PerformAdditionViaDataService();
        assertNotEquals(100,impl.PerformAdditionViaDataService());
    }

}

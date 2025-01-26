package com.erangan.mockito.data.mock;

import com.erangan.mockito.service.DataService;
import com.erangan.mockito.service.PerformCalculationImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.*;

public class PerformCalculationImplWithBefore {

    PerformCalculationImpl impl = new PerformCalculationImpl();
    DataService dataService = mock(DataService.class);

    @BeforeEach
    public void Before(){
        impl.setDataService(dataService);
    }

    @Test
    void testDataServiceBasedAddition(){
      when(dataService.retreiveAllData()).thenReturn(new int[]{1,2,3});
      assertEquals(6,impl.PerformAdditionViaDataService());
      verify(dataService,times(1)).retreiveAllData();
    }

    @Test
    void testDataServiceWithNoArg(){
        when(dataService.retreiveAllData()).thenReturn(new int[]{});
        int result =impl.PerformAdditionViaDataService();
        assertNotEquals(100,impl.PerformAdditionViaDataService());
    }

}

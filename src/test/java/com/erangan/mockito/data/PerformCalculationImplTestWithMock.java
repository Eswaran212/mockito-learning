package com.erangan.mockito.data;

import com.erangan.mockito.service.DataService;
import com.erangan.mockito.service.PerformCalculationImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PerformCalculationImplTestWithMock {

    @Test
    void testDataServiceBasedAddition(){
        PerformCalculationImpl impl = new PerformCalculationImpl();
        DataService dataService = mock(DataService.class);
      when(dataService.retreiveAllData()).thenReturn(new int[]{1,2,3});
      impl.setDataService(dataService);
      int actual = impl.PerformAdditionViaDataService();
    assertEquals(6,actual);
    }

    @Test
    void testDataServiceWithNoArg(){
        DataService dataService = mock(DataService.class);
        PerformCalculationImpl impl = new PerformCalculationImpl();
        when(dataService.retreiveAllData()).thenReturn(new int[]{});
        impl.setDataService(dataService);
        int result =impl.PerformAdditionViaDataService();
        assertNotEquals(111,result);
    }

}

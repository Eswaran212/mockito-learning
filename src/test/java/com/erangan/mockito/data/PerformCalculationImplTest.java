package com.erangan.mockito.data;

import com.erangan.mockito.service.PerformCalculationImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PerformCalculationImplTest  {

    @Test
    void testArrayOfInteger(){
        PerformCalculationImpl impl = new PerformCalculationImpl();
        int result =impl.performAddition(new int[]{32,56,23});
        assertEquals(111,result);
         result =impl.performAddition(new int[]{});
        assertEquals(0,result);
    }



    @Test
    void testDataServiceBasedAddition(){
        PerformCalculationImpl impl = new PerformCalculationImpl();
       // impl.setDataService(()->{return new int[]{1,3,4,6};});
        int result =impl.PerformAdditionViaDataService();
        assertNotEquals(111,result);
    }

}

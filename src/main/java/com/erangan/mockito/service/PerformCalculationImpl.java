package com.erangan.mockito.service;

import java.util.Arrays;

public class PerformCalculationImpl {

    DataService dataService;
    public void setDataService(DataService dataService){
        this.dataService=dataService;
    }

    public int performAddition(int[] data){
        return Arrays.stream(data).sum();
    }
    public int PerformAdditionViaDataService(){
        var data = dataService.retreiveAllData();
        return performAddition(data);
    }
}

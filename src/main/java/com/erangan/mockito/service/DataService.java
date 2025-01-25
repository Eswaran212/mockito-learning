package com.erangan.mockito.service;

import org.springframework.stereotype.Component;
public interface DataService {

    public int[] retreiveAllData();
    public String[] getUserData();

}

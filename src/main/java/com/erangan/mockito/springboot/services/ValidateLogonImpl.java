package com.erangan.mockito.springboot.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class ValidateLogonImpl implements ValidateLogonService{

    private Set<String> users = Set.of("admin", "user","guest");
    @Override
    public boolean canAccess() {
        return false;
    }
}

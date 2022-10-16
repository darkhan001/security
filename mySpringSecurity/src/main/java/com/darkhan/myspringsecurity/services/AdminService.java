package com.darkhan.myspringsecurity.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public void doAdminStuff(){
        System.out.println("Only admin here");
    }

    public void doSecond(){
        System.out.println("Second");
    }

    public void doThird(){
        System.out.println("Third");
    }
}

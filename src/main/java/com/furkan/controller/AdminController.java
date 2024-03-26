package com.furkan.controller;

import com.furkan.repository.entity.Admin;
import com.furkan.service.AdminService;

public class AdminController {

    AdminService adminService;

    public AdminController(){
        this.adminService = new AdminService();
    }
    public Admin save(Admin admin){
        return adminService.save(admin);
    }

}

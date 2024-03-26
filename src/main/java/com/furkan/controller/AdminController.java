package com.ugur.controller;

import com.ugur.repository.entity.Admin;
import com.ugur.service.AdminService;

public class AdminController {

    AdminService adminService;

    public AdminController(){
        this.adminService = new AdminService();
    }
    public Admin save(Admin admin){
        return adminService.save(admin);
    }

}

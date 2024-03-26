package com.ugur.service;

import com.ugur.repository.AdminRepository;
import com.ugur.repository.entity.Admin;
import com.ugur.utility.MyFactoryService;

public class AdminService extends MyFactoryService<AdminRepository, Admin,Long> {
    AdminRepository adminRepository;
    public AdminService() {
        super(new AdminRepository());
        this.adminRepository = new AdminRepository();
    }
}

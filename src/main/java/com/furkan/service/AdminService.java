package com.furkan.service;

import com.furkan.repository.AdminRepository;
import com.furkan.repository.entity.Admin;
import com.furkan.utility.MyFactoryService;

public class AdminService extends MyFactoryService<AdminRepository, Admin,Long> {
    AdminRepository adminRepository;
    public AdminService() {
        super(new AdminRepository());
        this.adminRepository = new AdminRepository();
    }
}

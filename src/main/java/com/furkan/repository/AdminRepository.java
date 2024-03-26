package com.furkan.repository;

import com.furkan.repository.entity.Admin;
import com.furkan.utility.MyFactoryRepository;

public class AdminRepository extends MyFactoryRepository<Admin,Long> {
    public AdminRepository() {
        super(new Admin());
    }
}

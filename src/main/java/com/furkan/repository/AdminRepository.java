package com.ugur.repository;

import com.ugur.repository.entity.Admin;
import com.ugur.utility.MyFactoryRepository;

public class AdminRepository extends MyFactoryRepository<Admin,Long> {
    public AdminRepository() {
        super(new Admin());
    }
}

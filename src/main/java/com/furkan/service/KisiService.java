package com.ugur.service;

import com.ugur.repository.KisiRepository;
import com.ugur.repository.entity.Kisi;
import com.ugur.utility.MyFactoryService;

import java.util.Optional;

public class KisiService extends MyFactoryService<KisiRepository, Kisi,Long> {
    KisiRepository kisiRepository;
    public KisiService() {
        super(new KisiRepository());
        this.kisiRepository = new KisiRepository();
    }

    public Optional<Kisi> findByUsername(String username) {
        return kisiRepository.findByUsername(username);
    }
}

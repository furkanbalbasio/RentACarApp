package com.ugur.service;

import com.ugur.repository.KiralamaRepository;
import com.ugur.repository.entity.Kiralama;
import com.ugur.repository.views.KiralamaSayisi;
import com.ugur.repository.views.KiralananAraclar;
import com.ugur.utility.MyFactoryService;

import java.util.List;

public class KiralamaService extends MyFactoryService<KiralamaRepository, Kiralama,Long> {
    KiralamaRepository kiralamaRepository;
    public KiralamaService() {
        super(new KiralamaRepository());
        this.kiralamaRepository=new KiralamaRepository();
    }

    public List<KiralananAraclar> raporlama() {
        return kiralamaRepository.raporlama();
    }

    public List<KiralamaSayisi> kiralamaSayisi() {
        return kiralamaRepository.kiralamaSayisi();
    }
}

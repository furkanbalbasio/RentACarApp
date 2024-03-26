package com.furkan.service;

import com.furkan.repository.KiralamaRepository;
import com.furkan.repository.entity.Kiralama;
import com.furkan.repository.views.KiralamaSayisi;
import com.furkan.repository.views.KiralananAraclar;
import com.furkan.utility.MyFactoryService;

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

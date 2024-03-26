package com.ugur.repository;

import com.ugur.repository.entity.Kisi;
import com.ugur.utility.HibernateUtility;
import com.ugur.utility.MyFactoryRepository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.Optional;

public class KisiRepository extends MyFactoryRepository<Kisi,Long> {
    EntityManager entityManager;
    public KisiRepository() {
        super(new Kisi());
        this.entityManager = HibernateUtility.getSessionFactory().createEntityManager();
    }

    public Optional<Kisi> findByUsername(String username) {
        String sql = "SELECT * FROM tbl_kisi as k WHERE k.username=:username";
        Query query = entityManager.createNativeQuery(sql, Kisi.class);
        query.setParameter("username",username);
        Kisi kisi = (Kisi) query.getSingleResult();
        return Optional.ofNullable(kisi);
    }
}

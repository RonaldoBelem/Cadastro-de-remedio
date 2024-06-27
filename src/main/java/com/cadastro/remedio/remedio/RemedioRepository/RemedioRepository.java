package com.cadastro.remedio.remedio.RemedioRepository;

import com.cadastro.remedio.remedio.RemedioEntity.RemedioEntity;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemedioRepository extends JpaRepository<RemedioEntity, Long> {



}

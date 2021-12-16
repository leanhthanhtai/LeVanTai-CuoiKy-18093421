package com.example.levantai18093421toyota.Repositorys;

import com.example.levantai18093421toyota.entity.Toyota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyotaRepository extends JpaRepository<Toyota,Long> {
}

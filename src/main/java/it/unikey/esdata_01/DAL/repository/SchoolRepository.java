package it.unikey.esdata_01.DAL.repository;

import it.unikey.esdata_01.DAL.entity.SchoolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<SchoolEntity, Integer> {
}

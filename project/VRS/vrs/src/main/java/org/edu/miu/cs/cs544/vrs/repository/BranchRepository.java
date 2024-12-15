package org.edu.miu.cs.cs544.vrs.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.edu.miu.cs.cs544.vrs.Entity.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("BranchRepository")
@Transactional
public interface BranchRepository extends JpaRepository<Branch, Long> {



}

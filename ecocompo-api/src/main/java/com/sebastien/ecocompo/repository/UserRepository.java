package com.sebastien.ecocompo.repository;

import com.sebastien.ecocompo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long > {
}

package com.ifisher.Repositories;

import com.ifisher.Models.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRepository extends JpaRepository<Fish, Long> {

}

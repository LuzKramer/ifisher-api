package com.ifisher.Repositories;

import com.ifisher.Models.Mk_images;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface Mk_imagesRepository extends JpaRepository<Mk_images, UUID> {
}

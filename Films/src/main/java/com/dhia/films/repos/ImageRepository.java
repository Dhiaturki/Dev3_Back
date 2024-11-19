package com.dhia.films.repos;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.dhia.films.entities.Image; 
 
 
public interface ImageRepository extends JpaRepository<Image , Long> { 
} 
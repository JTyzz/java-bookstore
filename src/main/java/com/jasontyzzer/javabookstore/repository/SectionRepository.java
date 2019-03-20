package com.jasontyzzer.javabookstore.repository;

import com.jasontyzzer.javabookstore.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
package com.educandoweb.course.repositories;

import com.educandoweb.course.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

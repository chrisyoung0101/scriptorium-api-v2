package com.example.scriptoriumapiv2.repository;

import com.example.scriptoriumapiv2.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    // Inherits CRUD methods (findAll, save, delete, etc.)
}

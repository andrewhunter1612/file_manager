package com.example.file_manager.repositories;

import com.example.file_manager.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}

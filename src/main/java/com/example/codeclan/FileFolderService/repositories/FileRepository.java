package com.example.codeclan.FileFolderService.repositories;

import com.example.codeclan.FileFolderService.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {

}

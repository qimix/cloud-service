package ru.netology.cloud_service.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.cloud_service.entity.Files;

import java.util.List;

@Repository
public interface FilesRepository extends CrudRepository<Files, String> {
    List<Files> findFilesByName(String name);
}

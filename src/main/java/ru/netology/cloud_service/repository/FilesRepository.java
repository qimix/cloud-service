package ru.netology.cloud_service.repository;

import org.springframework.data.repository.CrudRepository;
import ru.netology.cloud_service.entity.Files;

public interface FilesRepository extends CrudRepository<Files, Long> {
}

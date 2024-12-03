package ru.netology.cloud_service.repository;

import org.springframework.data.repository.CrudRepository;
import ru.netology.cloud_service.entity.Downloads;

public interface DownloadsRepository extends CrudRepository<Downloads, Long> {
}

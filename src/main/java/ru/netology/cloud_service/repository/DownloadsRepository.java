package ru.netology.cloud_service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.cloud_service.entity.Downloads;

@Repository
public interface DownloadsRepository extends CrudRepository<Downloads, Long> {
}

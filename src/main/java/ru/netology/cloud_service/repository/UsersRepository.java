package ru.netology.cloud_service.repository;

import org.springframework.data.repository.CrudRepository;
import ru.netology.cloud_service.entity.Users;

public interface UsersRepository extends CrudRepository<Users, String> {
}

package ru.netology.cloud_service.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.cloud_service.service.CloudService;

@Configuration
public class AppConfiguration {
    @Bean
    @Qualifier("cloudService")
    public CloudService cloudService() {
        return new CloudService();
    }

    @Bean
    @Qualifier("entityManagerFactory")
    public EntityManagerFactory entityManagerFactory() {
        return Persistence.createEntityManagerFactory("cloud-service");
    }

    @Bean
    @Qualifier("entityManager")
    public EntityManager entityManager() {
        return entityManagerFactory().createEntityManager();
    }

}

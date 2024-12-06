package ru.netology.cloud_service.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.netology.cloud_service.dto.FilesDTO;
import ru.netology.cloud_service.entity.Files;
import ru.netology.cloud_service.repository.FilesRepository;

import java.io.File;
import java.util.List;

public class CloudService {
    @Autowired
    @Qualifier("filesRepository")
    FilesRepository filesRepository;

    @Transactional
    public List<Files> findFilesByName(FilesDTO filesDTO) {
        return filesRepository.findFilesByName(filesDTO.getName());
    }
}

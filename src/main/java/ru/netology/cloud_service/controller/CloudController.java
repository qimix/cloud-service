package ru.netology.cloud_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.netology.cloud_service.dto.FilesDTO;
import ru.netology.cloud_service.entity.Files;
import ru.netology.cloud_service.service.CloudService;


import java.util.List;

@RestController
public class CloudController {
    CloudService cloudService;

    @Autowired
    public void setCloudService(CloudService cloudService) {
        this.cloudService = cloudService;
    }

    @GetMapping("/files/by-name")
    public List<Files> getListFilesController(@RequestParam("name") String name) {
        return cloudService.findFilesByName(new FilesDTO(name));
    }

}
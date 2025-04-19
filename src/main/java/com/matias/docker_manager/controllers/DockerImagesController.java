package com.matias.docker_manager.controllers;

import com.github.dockerjava.api.model.Image;
import com.matias.docker_manager.services.DockerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/images")
public class DockerImagesController {
    private final DockerService dockerService;

    public DockerImagesController(DockerService client){
        this.dockerService = client;
    }

    @GetMapping("")
    public List<Image> listImages(){
        return dockerService.listImages();
    }

    @GetMapping("/filter")
    public List<Image> filterImages(@RequestParam(required = true) String filter){
        return dockerService.filterImages(filter);
    }

}

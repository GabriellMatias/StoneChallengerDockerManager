package com.matias.docker_manager.controllers;

import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Image;
import com.matias.docker_manager.services.DockerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/containers")
public class DockerContainersController {
    private final DockerService dockerService;

    public DockerContainersController(DockerService dockerService) {
        this.dockerService = dockerService;
    }

    @GetMapping("")
    public List<Container> listContainers(@RequestParam(required = false, defaultValue = "true") boolean showAll){
        return dockerService.listContainers(showAll);
    }

    @PostMapping("/{id}/start")
    public void startContainer(@PathVariable String containerId){
        dockerService.startContainer(containerId);
    }

    @PostMapping("/{id}/stop")
    public void stopContainer(@PathVariable String containerId){
        dockerService.stopContainer(containerId);
    }

    @DeleteMapping("/{id}")
    public void removeContainer(@PathVariable String containerId){
        dockerService.removeContainer(containerId);
    }

    @PostMapping("")
    public void createContainer(@RequestParam String imageName){
        dockerService.createContainer(imageName);
    }
}

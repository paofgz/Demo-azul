package com.itesm.azul.controllers;

import com.itesm.azul.models.Video;
import com.itesm.azul.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/video")
public class VideoController {
    @Autowired
    VideoService videoService;

    //READ ONE
    @GetMapping("/get/{id}")
    public Video getOne(@PathVariable String id) {
        return videoService.getOne(id);
    }

    //GET ALL VIDEOS
    @GetMapping("/list")
    public List<Video> getAll() {
        return videoService.getAll();
    }

    //CREATE
    @PostMapping("/add")
    public Video addNewVideo(@RequestBody Video addedVideo) throws Exception {
        return videoService.addNewVideo(addedVideo);
    }

    //UPDATE
    @PutMapping("/edit/{id}")
    public Video editVideo(@PathVariable String id, @RequestBody Video updates) throws Exception {
        return videoService.editVideo(id, updates);
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public Boolean deleteVideo(@PathVariable String id) throws Exception {
        return videoService.deleteVideo(id);
    }
}

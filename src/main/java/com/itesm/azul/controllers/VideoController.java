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
    @GetMapping("/get/{vide_name}")
    public Video getOne(@PathVariable String vide_name) {
        return videoService.getOne(vide_name);
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
    @PutMapping("/edit/{vide_name}")
    public Video editVideo(@PathVariable String vide_name, @RequestBody Video updates) throws Exception {
        return videoService.editVideo(vide_name, updates);
    }

    //DELETE
    @DeleteMapping("/delete/{vide_name}")
    public Boolean deleteVideo(@PathVariable String vide_name) throws Exception {
        return videoService.deleteVideo(vide_name);
    }
}

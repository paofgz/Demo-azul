package com.itesm.azul.services;

import com.itesm.azul.models.Video;
import com.itesm.azul.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class VideoService {
    @Autowired
    VideoRepository videoRepository;
    // SettingRepository settingRepo;

    //READ ONE
    public Video getOne(String name) {
        return videoRepository.findOne(name);
    }

    //READ LIST
    public List<Video> getAll() {
        return videoRepository.findAll();
    }

    //CREATE
    public Video addNewVideo (Video newVideo) throws Exception {
        if(newVideo.getAgent_name() == null || newVideo.getAgent_lastname() == null || newVideo.getAgent_id() == null) {
            // TODO: Add regex to check name and lastname only has letters, no numbers or special characters
            throw new Exception("All videos must have an agent name, lastname and id");
        } else if(newVideo.getUser_name() == null) {
            throw new Exception("All videos must have a user name.");
        } else if(newVideo.getCall_reason() == null) {
            // TODO: specify which are the allowed call reasons in a call center.
            throw new Exception("All videos must have a call reason.");
        } else if(newVideo.getTags() == null) {
            throw new Exception("All videos must have tags.");
            // TODO: verify all tags that will be allowed
        } else if(newVideo.getClient_id() == null) {
            throw new Exception("All videos must be assigned to a company.");
        } else if(newVideo.getDuration() == null) {
            // TODO: Check if this will be sent in the request or it will be obtained in backend logic
            throw new Exception("All videos must have a duration.");
        }
        /*Setting setting = settingRepo.findOne(newVideo.getClient_id());
        if (newVideo.getDuration() < setting.getMinimum_time() || newVideo.getDuration() > setting.getMaximum_time()){
            throw new Exception("The video is shorter or longer than the allowed length");
        }*/
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd-HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        newVideo.setCreated_at(now);
        newVideo.setVideo_name(newVideo.getAgent_id() + "-" + (dtf.format(now)));
        newVideo.setLocation_path("videos/"+newVideo.getClient_id()+"/"+newVideo.getVideo_name());
        // TODO: Check if validations for permissions are required
        return videoRepository.create(newVideo);
    }

    //UPDATE
    public Video editVideo(String name, Video updates) throws Exception {
        if(updates.getPermissions() == null && updates.getTags() == null) {
            throw new Exception("Nothing to update");
        }
        // TODO: Add validation for permissions and tags
        LocalDateTime now = LocalDateTime.now();
        updates.setUpdated_at(now);
        return videoRepository.update(name, updates);
    }

    //DELETE
    public Boolean deleteVideo(String name) throws Exception {
        if(name == null) {
            throw new Exception("Id is required.");
        }
        return videoRepository.delete(name);
    }
}
package com.itesm.azul.repositories;

import com.itesm.azul.models.Video;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class VideoRepository {

    //READ ONE
    public Video findOne(String name) {
        LocalDateTime now = LocalDateTime.now();
        Video v = new Video();
        v.setVideo_name(name);
        v.setAgent_name("Karen");
        v.setAgent_lastname("Rivera");
        v.setUser_name("JoseMtz");
        v.setCreated_at(now);
        v.setCall_reason("Product not delivered");
        v.setDuration(15.3F);
        v.setPermissions(new int[] {2,3});
        v.setTags(new String[] {"Unsuccessfull"});
        v.setLocation_path("videos/Nike/"+name);
        v.setClient_id("Nike");
        return v;
    }

    //READ LIST
    public List<Video> findAll() {
        List<Video> videos = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        Video v1 = new Video();
        v1.setVideo_name("A12-20211105-12:34:54");
        v1.setAgent_name("Karen");
        v1.setAgent_lastname("Rivera");
        v1.setUser_name("JoseMtz");
        v1.setCreated_at(now);
        v1.setUpdated_at(now);
        v1.setCall_reason("Product not delivered");
        v1.setDuration(15.3F);
        v1.setPermissions(new int[] {2,3});
        v1.setTags(new String[] {"Unsuccessfull"});
        v1.setLocation_path("videos/Adidas/A12-20211105-12:34:54");
        v1.setClient_id("Adidas");

        Video v2 = new Video();
        v2.setVideo_name("A16-2022/02/12-13:43:23");
        v2.setAgent_name("Diego");
        v2.setAgent_lastname("Angeles");
        v2.setUser_name("AlanGz");
        v2.setCreated_at(now);
        v2.setCall_reason("Damaged product");
        v2.setDuration(16.36F);
        v2.setPermissions(new int[] {2});
        v2.setTags(new String[] {"Annoying user"});
        v2.setLocation_path("videos/Dove/A16-20220212-13:43:23");
        v2.setClient_id("Dove");

        videos.add(v1);
        videos.add(v2);

        return videos;
    }

    //CREATE
    public Video create(Video newVideo) {
        Video v = new Video();
        v.setVideo_name(newVideo.getVideo_name());
        v.setAgent_name(newVideo.getAgent_name());
        v.setAgent_lastname(newVideo.getAgent_lastname());
        v.setUser_name(newVideo.getUser_name());
        v.setCreated_at(newVideo.getCreated_at());
        v.setUpdated_at(newVideo.getUpdated_at());
        v.setCall_reason(newVideo.getCall_reason());
        v.setDuration(newVideo.getDuration());
        v.setPermissions(newVideo.getPermissions());
        v.setTags(newVideo.getTags());
        v.setLocation_path(newVideo.getLocation_path());
        v.setClient_id(newVideo.getClient_id());
        return v;
    }

    //UPDATE
    public Video update(String name, Video updates) {
        LocalDateTime now = LocalDateTime.now();
        //Change so that the data comes from getOne or from the service for the other elements that remain the same
        //Depending on which update is done (edit tags or permissions, the other elements must be filled in or an edit must be made for each one)
        Video v = new Video();
        v.setVideo_name(name);
        v.setAgent_name("Diego");
        v.setAgent_lastname("Angeles");
        v.setUser_name("AlanGz");
        v.setCreated_at(now);
        v.setCall_reason("Damaged product");
        v.setDuration(16.36F);
        v.setTags(new String[] {"Success"});
        v.setPermissions(new int[] {});
        v.setClient_id("Adidas");
        v.setLocation_path("videos/"+v.getClient_id()+"/"+v.getVideo_name());
        v.setUpdated_at(updates.getUpdated_at());
        if (updates.getTags() != null){
            v.setTags(updates.getTags());
        }
        if (updates.getPermissions() != null) {
            v.setPermissions(updates.getPermissions());
        }
        return v;
    }

    //DELETE
    public Boolean delete(String name) {
        //Delete form database the selected video
        return true;
    }
}

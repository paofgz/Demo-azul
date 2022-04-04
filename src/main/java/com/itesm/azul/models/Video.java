package com.itesm.azul.models;

import java.time.LocalDateTime;

public class Video {
    private String video_name;
    private String agent_name;
    private String agent_lastname;
    private String user_name;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String call_reason;
    private Float duration;
    private int[] permissions;
    private String[] tags;
    private String location_path;
    private String client_id;
    private String agent_id;

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getAgent_lastname() {
        return agent_lastname;
    }

    public void setAgent_lastname(String agent_lastname) {
        this.agent_lastname = agent_lastname;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(LocalDateTime updated_at) {
        this.updated_at = updated_at;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public int[] getPermissions() {
        return permissions;
    }

    public void setPermissions(int[] permissions) {
        this.permissions = permissions;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getLocation_path() {
        return location_path;
    }

    public void setLocation_path(String location_path) {
        this.location_path = location_path;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getVideo_name() {
        return video_name;
    }

    public void setVideo_name(String video_name) {
        this.video_name = video_name;
    }

    public String getCall_reason() {
        return call_reason;
    }

    public void setCall_reason(String call_reason) {
        this.call_reason = call_reason;
    }

    public String getAgent_id() {
        return agent_id;
    }

    public void setAgent_id(String agent_id) {
        this.agent_id = agent_id;
    }
}


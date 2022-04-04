package com.itesm.azul.models;

public class Settings {
    private String client_id;
    private Float minimum_time;
    private Float maximum_time;
    private String video_quality;
    private Number maximum_size;

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public Float getMinimum_time() {

        return minimum_time;
    }

    public void setMinimum_time(Float minimum_time) {

        this.minimum_time = minimum_time;
    }

    public Float getMaximum_time() {

        return maximum_time;
    }

    public void setMaximum_time(Float maximum_time) {

        this.maximum_time = maximum_time;
    }

    public String getVideo_quality() {

        return video_quality;
    }

    public void setVideo_quality(String video_quality) {

        this.video_quality = video_quality;
    }

    public Number getMaximum_size() {

        return maximum_size;
    }

    public void setMaximum_size(Number maximum_size) {

        this.maximum_size = maximum_size;
    }
}

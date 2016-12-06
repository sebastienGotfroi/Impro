package com.example.impro_service.entity;

/**
 * Created by cecem on 05/12/2016.
 */

public class Improvisation {
    private Integer id;
    private String name;
    private String description;
    private String comment;
    private Integer durationInSec;
    private ImprovisationType improvisationType;
    private Theme theme;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getDurationInSec() {
        return durationInSec;
    }

    public void setDurationInSec(Integer durationInSec) {
        this.durationInSec = durationInSec;
    }

    public ImprovisationType getImprovisationType() {
        return improvisationType;
    }

    public void setImprovisationType(ImprovisationType improvisationType) {
        this.improvisationType = improvisationType;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}

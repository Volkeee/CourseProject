package com.courseproj.kep.entity;

import java.io.Serializable;

/**
 * Created by ВІТЯНЯ on 11.04.2016.
 */
public class BaseEntity implements Serializable {

    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

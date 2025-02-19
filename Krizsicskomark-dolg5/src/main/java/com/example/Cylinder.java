/*
* File: Cylinder.java
* Author: Krizsicskó Márk
* Copyright: 2025, Krizsicskó Márk
* Group: Szoft II/1/N
* Date: 2025-02-19
* Github: https://github.com/krizsicskomark/
* Licenc: GNU GPL
*/

package com.example;

public class Cylinder {
    Integer id;
    Double radius;
    Double height;
    Double surface;

    public Cylinder() {}

    public Cylinder(Integer id, Double radius, Double height, Double surface) {
        this.id = id;
        this.radius = radius;
        this.height = height;
        this.surface = surface;
    }

    public Cylinder(Double radius, Double height, Double surface) {
        this.radius = radius;
        this.height = height;
        this.surface = surface;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }
}

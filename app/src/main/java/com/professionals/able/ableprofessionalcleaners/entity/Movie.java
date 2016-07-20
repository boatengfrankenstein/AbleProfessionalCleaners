package com.professionals.able.ableprofessionalcleaners.entity;

import android.graphics.Bitmap;

public class Movie {
    public String name;
    public String image;
    public int imageBitmap;



    public Movie(String name, String image, int imageBitmap) {
        this.name = name;
        this.image = image;
        this.imageBitmap = imageBitmap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImageBitmap(int imageBitmap) {
        this.imageBitmap = imageBitmap;
    }

    public int getImageBitmap() {
        return imageBitmap;
    }

    public void setImage(String image) {
        this.image = image;
    }
}




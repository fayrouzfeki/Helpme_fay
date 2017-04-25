package com.example.latitude.helpme;

/**
 * Created by Mariem on 4/25/2017.
 */

public class adviceModle {

    public adviceModle(int img_res, String title){
        this.setImg_res(img_res);
        this.setTitle(title);
    }



    private int img_res;
    private String  title;

    public int getImg_res() {
        return img_res;
    }

    public void setImg_res(int img_res) {
        this.img_res = img_res;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}


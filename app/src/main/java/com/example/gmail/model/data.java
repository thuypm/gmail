package com.example.gmail.model;

public class data {
    private int mColor;
    private String time;
    private String sentName;
    private String content;
    private String viewContent;
    private  String image;
    public data (String sentName, String content, String time )
    {
        this.time = time;
        this.sentName = sentName;
        this.content = content;
        this.image = sentName.substring(0,1);
        if(content.length() > 15)
          this.viewContent = content.substring(0, 15) + "..." ;
        else
            this.viewContent = content;
    }

    public String getSentName()

    {
        return this.sentName;
    }
    public String getViewContent()

    {
        return this.viewContent;
    }
    public String getImage()

    {
        return this.image;
    }
    public String getTime()

    {
        return this.time;
    }
    public int getmColor()

    {
        return this.mColor;
    }
}

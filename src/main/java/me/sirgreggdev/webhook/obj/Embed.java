package me.sirgreggdev.webhook.obj;

public class Embed {
    private String title;
    private String type = "rich";
    private String description;
    private String url;
    private String timestamp;
    private int color;
    private Footer footer;
    private Image image;
    private Thumbnail thumbnail;
    private Video video;
    private Provider provider;
    private Author author;
    private Field[] fields;
}

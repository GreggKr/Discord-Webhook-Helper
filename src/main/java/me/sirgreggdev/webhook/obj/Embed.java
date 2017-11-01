package me.sirgreggdev.webhook.obj;

import org.json.JSONObject;

public class Embed {
    private String title;
    private static final String TYPE = "rich";
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

    public Embed setTitle(String title) {
        this.title = title;
        return this;
    }

    public Embed setDescription(String description) {
        this.description = description;
        return this;
    }

    public Embed setUrl(String url) {
        this.url = url;
        return this;
    }

    public Embed setColor(int color) {
        this.color = color;
        return this;
    }

    public Embed setFooter(Footer footer) {
        this.footer = footer;
        return this;
    }

    public JSONObject build() {
        if (description == null) return null;

        JSONObject object = new JSONObject();
        if (title != null) object.put("title", title);
        object.put("type", TYPE);
        object.put("description", description);
        if (url != null) object.put("url", url);


        return object;
    }
}

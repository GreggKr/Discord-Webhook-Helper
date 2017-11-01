package me.sirgreggdev.webhook.obj;

import org.json.JSONObject;

public class Video {
    private String url;
    private int height;
    private int width;

    public Video setUrl(String url) {
        this.url = url;
        return this;
    }

    public Video setHeight(int height) {
        this.height = height;
        return this;
    }

    public Video setWidth(int width) {
        this.width = width;
        return this;
    }

    public JSONObject build() {
        if (url == null) return null;

        JSONObject object = new JSONObject();
        object.put("url", url);
        if (height != 0) object.put("height", height);
        if (width != 0) object.put("width", width);

        return object;
    }
}

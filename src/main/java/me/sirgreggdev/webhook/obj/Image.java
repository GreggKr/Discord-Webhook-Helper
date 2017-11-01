package me.sirgreggdev.webhook.obj;

import org.json.JSONObject;

public class Image {
    private String url;
    private String proxyUrl;
    private int height;
    private int width;

    public Image setUrl(String url) {
        this.url = url;
        return this;
    }

    public Image setProxyUrl(String proxyUrl) {
        this.proxyUrl = proxyUrl;
        return this;
    }

    public Image setHeight(int height) {
        this.height = height;
        return this;
    }

    public Image setWidth(int width) {
        this.width = width;
        return this;
    }

    public JSONObject build() {
        if (url == null) return null;

        JSONObject object = new JSONObject();
        object.put("url", url);
        if (proxyUrl != null) object.put("proxy_url", proxyUrl);
        if (height != 0) object.put("height", height);
        if (width != 0) object.put("width", width);

        return object;
    }
}

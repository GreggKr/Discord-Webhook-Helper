package me.sirgreggdev.webhook.obj;

import org.json.JSONObject;

// You should never be using this class unless you know what you're doing.
public class Provider {
    private String name;
    private String url;

    public Provider setName(String name) {
        this.name = name;
        return this;
    }

    public Provider setUrl(String url) {
        this.url = url;
        return this;
    }

    public JSONObject build() {
        if (name == null) return null;
        JSONObject object = new JSONObject();
        object.put("name", name);
        if (url != null) object.put("url", url);

        return object;
    }
}

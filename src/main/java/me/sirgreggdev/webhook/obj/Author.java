package me.sirgreggdev.webhook.obj;

import org.json.JSONObject;

public class Author {
    private String name;
    private String url;
    private String iconUrl;
    private String proxyIconUrl;

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public Author setUrl(String url) {
        this.url = url;
        return this;
    }

    public Author setIconUrl(String url) {
        this.iconUrl = iconUrl;
        return this;
    }

    public Author setProxyIconUrl(String proxyIconUrl) {
        this.proxyIconUrl = proxyIconUrl;
        return this;
    }

    public JSONObject build() {
        if (name == null) return null;

        JSONObject object = new JSONObject();
        object.put("name", name);
        if (url != null) object.put("url", url);
        if (iconUrl != null) object.put("icon_url", iconUrl);
        if (proxyIconUrl != null) object.put("proxy_icon_url", proxyIconUrl);

        return object;
    }
}

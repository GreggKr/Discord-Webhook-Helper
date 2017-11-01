package me.sirgreggdev.webhook.obj;

import org.json.JSONObject;

public class Footer {
    private String text;
    private String iconUrl;
    private String proxyIconUrl;

    public Footer setText(String text) {
        this.text = text;
        return this;
    }

    public Footer setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    public Footer setProxyIconUrl(String proxyIconUrl) {
        this.proxyIconUrl = proxyIconUrl;
        return this;
    }

    public JSONObject build() {
        if (text == null) return null;

        JSONObject object = new JSONObject();
        object.put("text", text);
        if (iconUrl != null) object.put("icon_url", iconUrl);
        if (proxyIconUrl != null) object.put("proxy_icon_url", proxyIconUrl);

        return object;
    }
}

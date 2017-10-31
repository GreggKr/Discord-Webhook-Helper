package me.sirgreggdev.webhook.obj;

import org.json.JSONObject;

// TODO: Rename
public class WebhookData {
    private String content;
    private String username;
    private String avatarUrl;
    private boolean tts;
    private String file; // TODO
    private Embed[] embeds;

    public WebhookData setContent(String content) {
        this.content = content;
        return this;
    }

    public JSONObject build() {
        JSONObject object = new JSONObject();
        object.put("content", content);

        return object;
    }
}

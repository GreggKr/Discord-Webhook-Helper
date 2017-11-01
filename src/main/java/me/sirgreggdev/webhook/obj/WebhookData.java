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

    public WebhookData setUsername(String username) {
        this.username = username;
        return this;
    }

    public WebhookData setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public WebhookData setTts(boolean tts) {
        this.tts = tts;
        return this;
    }

    public WebhookData setEmbeds(Embed[] embeds) {
        this.embeds = embeds;
        return this;
    }

    public JSONObject build() {
        JSONObject object = new JSONObject();
        object.put("content", content);

        return object;
    }
}

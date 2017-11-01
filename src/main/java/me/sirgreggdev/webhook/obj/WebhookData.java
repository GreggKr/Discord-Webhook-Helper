package me.sirgreggdev.webhook.obj;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.Objects;

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
        if (content == null && file == null && embeds == null) return null; // It's required to have at least one of these

        JSONObject object = new JSONObject();
        if (content != null) object.put("content", content);
        if (username != null) object.put("username", username);
        if (avatarUrl != null) object.put("avatarUrl", avatarUrl);
        object.put("tts", tts);
        if (file != null) object.put("file", file);

        JSONArray embedArray = new JSONArray();
        if (embeds != null) {
            Arrays.stream(embeds).forEachOrdered(embed -> {
                JSONObject embedObj = new JSONObject();
                object.put("", "");

                embedArray.put(embedObj);
            });
        }

        return object;
    }
}

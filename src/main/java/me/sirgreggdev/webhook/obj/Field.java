package me.sirgreggdev.webhook.obj;

import org.json.JSONObject;

public class Field {
    private String name;
    private String value;
    private boolean inline;

    public Field setName(String name) {
        this.name = name;
        return this;
    }

    public Field setValue(String value) {
        this.value = value;
        return this;
    }

    public Field setInline(boolean inline) {
        this.inline = inline;
        return this;
    }

    public JSONObject build() {
        if (name == null || value == null) return null;

        return new JSONObject().put("name", name).put("value", value).put("inline", inline);
    }
}

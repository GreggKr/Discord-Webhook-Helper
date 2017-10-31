package me.sirgreggdev.webhook;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

public class Webhook {
    private String url;
    public Webhook(String url) {
        this.url = url;
    }

    public void sendMessage(JSONObject message) {
        try {
            HttpResponse<String> res = Unirest.post(url)
                    .header("Content-Type", "application/json")
                    .body(message).asString();

            System.out.println(res.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}

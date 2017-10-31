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

    public void sendMessage(String message) {
        try {
            HttpResponse<String> res = Unirest.post(url)
                    .header("Content-Type", "application/json")
                    .body(new JSONObject().put("content", message)).asString();

            System.out.println(res.getBody());
        } catch (UnirestException e) {
            e.printStackTrace();
        }
    }
}

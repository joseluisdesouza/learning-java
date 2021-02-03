package com.java.Spadroesdeprojetos.bridge;

import com.java.Spadroesdeprojetos.bridge.platforms.FacebookLive;
import com.java.Spadroesdeprojetos.bridge.platforms.IPlatform;
import com.java.Spadroesdeprojetos.bridge.platforms.TwitchTV;
import com.java.Spadroesdeprojetos.bridge.platforms.YouTube;
import com.java.Spadroesdeprojetos.bridge.transmissions.Live;

public class BridgeMain {
    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new TwitchTV());
        startLive(new FacebookLive());
    }

    public static void startLive(IPlatform platform) {
        System.out.println("... Aguarde");
        Live live = new Live();
        live.broadcasting();
        live.result();
    }
}

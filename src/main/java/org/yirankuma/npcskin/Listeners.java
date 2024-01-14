package org.yirankuma.npcskin;

import lombok.Getter;
import org.bukkit.event.Listener;

public class Listeners implements Listener {
    @Getter
    private static Listeners instance;

    public Listeners() {
        instance = this;
    }
}

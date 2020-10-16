package com.javazilla.bukkitfabric.impl.map;

import java.util.ArrayList;
import org.bukkit.map.MapCursor;

public class RenderData {

    public final byte[] buffer;
    public final ArrayList<MapCursor> cursors;

    public RenderData() {
        this.buffer = new byte[128 * 128];
        this.cursors = new ArrayList<MapCursor>();
    }

}

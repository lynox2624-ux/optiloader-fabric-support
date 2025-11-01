package com.optiloaderproof;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

/**
 * OptiLoaderBootstrap — Base loader bridge between OptiFine and Fabric mods.
 * Ye class basically mod ko initialize karne ke liye hoti hai.
 */

@Environment(EnvType.CLIENT)
public class OptiLoaderBootstrap {
    public static void init() {
        System.out.println("[OptiLoader-Proof] Initializing Fabric support in OptiFine environment...");
        // Yahan tu aage mod compatibility code add karega
    }

    public static void main(String[] args) {
        init();
    }
}

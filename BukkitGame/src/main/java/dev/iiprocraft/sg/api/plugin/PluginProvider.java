package dev.iiprocraft.sg.api.plugin;

public interface PluginProvider {
    default void onEnable(){}
    default void onDisable(){}
}

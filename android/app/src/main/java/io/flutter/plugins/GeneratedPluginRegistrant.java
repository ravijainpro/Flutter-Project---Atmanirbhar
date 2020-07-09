package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import it.nplace.downloadspathprovider.DownloadsPathProviderPlugin;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.scanbot.sdk.flutter.ScanbotSdkPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    DownloadsPathProviderPlugin.registerWith(registry.registrarFor("it.nplace.downloadspathprovider.DownloadsPathProviderPlugin"));
    ImagePickerPlugin.registerWith(registry.registrarFor("io.flutter.plugins.imagepicker.ImagePickerPlugin"));
    PathProviderPlugin.registerWith(registry.registrarFor("io.flutter.plugins.pathprovider.PathProviderPlugin"));
    ScanbotSdkPlugin.registerWith(registry.registrarFor("io.scanbot.sdk.flutter.ScanbotSdkPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}

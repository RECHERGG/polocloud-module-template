package dev.httpmarco.polocloud.modules.example;

import dev.httpmarco.polocloud.api.CloudAPI;
import dev.httpmarco.polocloud.api.modules.CloudModule;

public class ExampleModule implements CloudModule {

    private CloudAPI cloudAPI;

    @Override
    public void onEnable() {
        this.cloudAPI = CloudAPI.instance();

        this.cloudAPI.logger().info("Example Module enabled");
    }

    @Override
    public void onDisable() {
        this.cloudAPI.logger().info("Example Module disabled");
    }
}

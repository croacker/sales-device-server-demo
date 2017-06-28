package com.invariant.devdispatcher.devicedispatcher;

import com.invariant.devdispatcher.devicedispatcher.resource.DeviceEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Конфигурация REST-ресурсов
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(DeviceEndpoint.class);
    }

}

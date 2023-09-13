package com.testcontainers.dapr;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import java.util.Map;

public interface DaprInit {
    
    DaprContainer dapr = new DaprContainer("daprio/daprd:1.11.3", "write-app")
            .withNetwork(Network.SHARED)
            .withComponent( "pubsub", "pubsub.in-memory", Map.ofEntries())
            .withComponent("statestore", "statestore.in-memory", Map.ofEntries());

    @DynamicPropertySource
    static void daprProperties(DynamicPropertyRegistry registry) {
        System.setProperty("dapr.grpc.port", dapr.getMappedPort(50001).toString());
    }
    
}

package io.swagger.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(name="${thisIsTitleForSiddhuSwaggerExample.name:thisIsTitleForSiddhuSwaggerExample}", url="${thisIsTitleForSiddhuSwaggerExample.url:https://localhost:8080}", configuration = ClientConfiguration.class)
public interface BasicErrorControllerApiClient extends BasicErrorControllerApi {
}
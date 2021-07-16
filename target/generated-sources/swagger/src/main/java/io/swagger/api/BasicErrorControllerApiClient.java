package io.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(contextId="BasicErrorControllerApiClient", name="${thisIsTitleForSiddhuSwaggerExample.name:thisIsTitleForSiddhuSwaggerExample}", url="${thisIsTitleForSiddhuSwaggerExample.url://localhost:8080/}", configuration = ClientConfiguration.class)
public interface BasicErrorControllerApiClient extends BasicErrorControllerApi {
}

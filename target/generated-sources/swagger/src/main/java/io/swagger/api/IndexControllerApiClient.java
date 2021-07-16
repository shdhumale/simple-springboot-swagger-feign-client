package io.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;
import io.swagger.configuration.ClientConfiguration;

@FeignClient(contextId="IndexControllerApiClient", name="${thisIsTitleForSiddhuSwaggerExample.name:thisIsTitleForSiddhuSwaggerExample}", url="${thisIsTitleForSiddhuSwaggerExample.url://localhost:8080/}", configuration = ClientConfiguration.class)
public interface IndexControllerApiClient extends IndexControllerApi {
}

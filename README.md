# simple-springboot-swagger-feign-client
Spring boot Applicaiton to have Swagger Plugin for codegen for Feign Client

java -jar swagger-codegen-cli-3.0.27.jar generate -i C:/Swagger_API/Employee.yaml -l spring --library spring-cloud -o C:/Swagger_API/client-generated-sources/server/swagger


java -jar swagger-codegen-cli-3.0.27.jar generate \
     -i http://localhost:8080/v2/api-docs \
     -l spring \
     --library spring-cloud \
     -o c://generated-sources//swagger

or 


java -jar swagger-codegen-cli-2.3.1.jar generate \
  -i swagger.yaml \
  --api-package com.siddhu.api \
  --model-package com.siddhu.employee.model \
  --group-id com.siddhu \
  --artifact-id spring-swagger-codegen-employee \
  --artifact-version 0.0.1-SNAPSHOT \
  -l spring \
  --library spring-cloud 
  -o C:/Swagger_API/client-generated-sources/server/swagger

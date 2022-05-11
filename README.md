# Developer set-up instructions:

Tools used:
1. openjdk18
1. mvn
1. springboot
1. openapi-generator-maven-plugin
1. build-helper-maven-plugin
1. springdoc-openapi

To install the package into the local repository, for use as a dependency in other projects locally: `mvn clean install`

Plugin used to generate the artifacts from the OpenAPI specification file:
https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-maven-plugin
To generate sources from the specification file: `mvn clean generate-sources`

To run the application: `mvn spring-boot:run`

To view the OpenAPI specification in a browser when the application is running, paste this in a browser: `http://localhost:8080/v3/api-docs/`

To test the application from terminal, use this command:
```
curl -X 'GET' \
  'http://localhost:8080/rewards/1' \
  -H 'accept: application/json'
```

You can use this for testing if you use httpie:
```
http GET http://localhost:8080/rewards/1
```

Valid customerIds that would give you results: 1,2,3,4

Sample response from the application:
```
http GET http://localhost:8080/rewards/1
HTTP/1.1 200 
Connection: keep-alive
Content-Type: application/json
Date: Wed, 11 May 2022 18:55:48 GMT
Keep-Alive: timeout=60
Transfer-Encoding: chunked

{
    "customerId": "1",
    "rewards": [
        {
            "month": "APRIL",
            "purchaseAmount": 120.0,
            "rewardPoints": 90
        },
        {
            "month": "MARCH",
            "purchaseAmount": 130.0,
            "rewardPoints": 110
        },
        {
            "month": "FEBRUARY",
            "purchaseAmount": 140.0,
            "rewardPoints": 130
        }
    ],
    "totalPurchaseAmountForPastThreeMonths": 390.0,
    "totalRewardPointsForPastThreeMonths": 330
}
```
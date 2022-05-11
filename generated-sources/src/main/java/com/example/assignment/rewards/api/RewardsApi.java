/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.assignment.rewards.api;

import com.example.assignment.rewards.model.Rewards;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Tag(name = "rewards", description = "the rewards API")
public interface RewardsApi {

    default RewardsApiDelegate getDelegate() {
        return new RewardsApiDelegate() {};
    }

    /**
     * GET /rewards/{customerId} : Returns rewards by customer Id
     * Returns rewards by customer Id
     *
     * @param customerId customer id (required)
     * @return successful operation (status code 200)
     *         or  (status code 400)
     *         or  (status code 401)
     *         or  (status code 403)
     *         or  (status code 404)
     *         or  (status code 500)
     */
    @Operation(
        operationId = "getRewardsByCustomerId",
        summary = "Returns rewards by customer Id",
        tags = { "rewards" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation =  Rewards.class))),
            @ApiResponse(responseCode = "400", description = ""),
            @ApiResponse(responseCode = "401", description = ""),
            @ApiResponse(responseCode = "403", description = ""),
            @ApiResponse(responseCode = "404", description = ""),
            @ApiResponse(responseCode = "500", description = "")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/rewards/{customerId}",
        produces = { "application/json" }
    )
    default ResponseEntity<Rewards> getRewardsByCustomerId(
        @Parameter(name = "customerId", description = "customer id", required = true, schema = @Schema(description = "")) @PathVariable("customerId") String customerId
    ) {
        return getDelegate().getRewardsByCustomerId(customerId);
    }

}

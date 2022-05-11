package com.example.assignment.rewards.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Rewards
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class Rewards  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("rewardPoints")
  private String rewardPoints;

  @JsonProperty("customerId")
  private String customerId;

  @JsonProperty("purchaseAmount")
  private String purchaseAmount;

  public Rewards rewardPoints(String rewardPoints) {
    this.rewardPoints = rewardPoints;
    return this;
  }

  /**
   * Get rewardPoints
   * @return rewardPoints
  */
  
  @Schema(name = "rewardPoints", required = false)
  public String getRewardPoints() {
    return rewardPoints;
  }

  public void setRewardPoints(String rewardPoints) {
    this.rewardPoints = rewardPoints;
  }

  public Rewards customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  
  @Schema(name = "customerId", required = false)
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Rewards purchaseAmount(String purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
    return this;
  }

  /**
   * Get purchaseAmount
   * @return purchaseAmount
  */
  
  @Schema(name = "purchaseAmount", required = false)
  public String getPurchaseAmount() {
    return purchaseAmount;
  }

  public void setPurchaseAmount(String purchaseAmount) {
    this.purchaseAmount = purchaseAmount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rewards rewards = (Rewards) o;
    return Objects.equals(this.rewardPoints, rewards.rewardPoints) &&
        Objects.equals(this.customerId, rewards.customerId) &&
        Objects.equals(this.purchaseAmount, rewards.purchaseAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rewardPoints, customerId, purchaseAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rewards {\n");
    sb.append("    rewardPoints: ").append(toIndentedString(rewardPoints)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    purchaseAmount: ").append(toIndentedString(purchaseAmount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


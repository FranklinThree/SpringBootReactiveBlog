package com.github.franklinthree.model.local;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * 帐户状态
 *
 * @author FranklinThree
 * @date 2023/07/05
 * @className AccountStatus
 * @see @see Enum
 * @since 1.0.0
 */
@JsonTypeName("account_status")
public enum AccountStatus {
  
  REGULAR("regular"),
  
  FROZEN("frozen"),
  
  DISABLED("disabled"),

  PROTECTED("protected");

  private final String value;

  AccountStatus(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AccountStatus fromValue(String value) {
    for (AccountStatus b : AccountStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


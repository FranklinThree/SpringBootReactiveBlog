package com.github.franklinthree.model.local;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * 博客地位
 *
 * @author FranklinThree
 * @date 2023/07/05
 * @className BlogStatus
 * @see @see Enum
 * @since 1.0.0
 */

@JsonTypeName("blog_status")
public enum BlogStatus {
  
  FLOATED("floated"),
  
  SINKED("sinked"),
  
  REJECTED("rejected"),
  
  REGULAR("regular"),

  PROTECTED("protected");

  private final String value;

  BlogStatus(String value) {
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
  public static BlogStatus fromValue(String value) {
    for (BlogStatus b : BlogStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


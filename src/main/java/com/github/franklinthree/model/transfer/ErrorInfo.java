package com.github.franklinthree.model.transfer;

import lombok.*;

import javax.swing.table.TableRowSorter;


/**
 * 错误信息
 *
 * @author FranklinThree
 * @date 2023/07/05
 * @className ErrorInfo
 * @see
 * @since 1.0.0
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ErrorInfo extends Throwable {

  private String id;

  private Integer code;

  private String description;

  private String given;

  private String expected;

  public ErrorInfo id(String id) {
    this.id = id;
    return this;
  }

}


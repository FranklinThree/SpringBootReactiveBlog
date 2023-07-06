package com.github.franklinthree.model.local;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;


/**
 * 评论
 *
 * @author FranklinThree
 * @date 2023/07/05
 * @className Comment
 * @see
 * @since 1.0.0
 */
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@JsonTypeName("comment")
public class Comment {
  @TableId(type = IdType.ASSIGN_ID)
  private String id;

  private String content;

  private User creator;

  private String targetId;

}


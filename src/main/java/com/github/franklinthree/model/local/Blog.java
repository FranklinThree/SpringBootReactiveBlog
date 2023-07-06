package com.github.franklinthree.model.local;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.List;


/**
 * 博客
 *
 * @author FranklinThree
 * @date 2023/07/05
 * @className Blog
 * @see
 * @since 1.0.0
 */

@ToString
@Getter
@Setter
@JsonTypeName("blog")
@TableName("t_blog")
public class Blog {
  @TableId(type = IdType.ASSIGN_ID)
  private Integer id;

  private String title;

  private String description;

  private String content;

  private String creator_id;

  //@Valid
  //private List<String> tags;

  private Integer likes;

  private Long createTime;

  private Long updateTime;

  private Integer temperature;

  private BlogStatus status;

  public Blog(Integer id, String title, String description, String content, String creator_id,  Integer likes, Long createTime, Long updateTime, Integer temperature, BlogStatus status) {

    this.id = id;
    this.title = title;
    this.description = description;
    this.content = content;
    this.creator_id = creator_id;
    //this.tags = null;
    this.likes = likes;
    this.createTime = createTime;
    this.updateTime = updateTime;
    this.temperature = temperature;
    this.status = status;
  }


}

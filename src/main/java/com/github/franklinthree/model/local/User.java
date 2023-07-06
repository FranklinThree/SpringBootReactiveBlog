package com.github.franklinthree.model.local;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

import static com.github.franklinthree.model.local.AccountStatus.PROTECTED;


/**
 * 一般用户
 *
 * @author FranklinThree
 * @date 2023/07/05
 * @className User
 * @see
 * @since 1.0.0
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@JsonTypeName("user")
@TableName("t_user")
public class User implements Cloneable{
    @TableId(type = IdType.ASSIGN_ID)
    private String id;

    private String username;
    @TableField("real_name")
    private String realName;

    private String email;
    @TableField("date_of_birth")
    private String dateOfBirth;
    @TableField("email_verified")
    private Boolean emailVerified;
    @TableField("create_date")
    private Long createDate;

    private AccountStatus status;

    private String password;

    public User safely(int level){
        User clone = this.clone();
        switch (level){
            case 1:
                clone.setPassword(null);
            case 2:
                clone.setStatus(PROTECTED);
                clone.setCreateDate(null);
                clone.setRealName(null);
                clone.setDateOfBirth(null);
                //clone.setId(null);

            case 3:
                clone.setEmail(null);
                clone.setEmailVerified(null);



        }
        return clone;
    }

    @Override
    public User clone() {
        try {
            User clone = (User) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

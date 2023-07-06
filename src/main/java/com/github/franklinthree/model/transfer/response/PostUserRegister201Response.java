package com.github.franklinthree.model.transfer.response;

import com.github.franklinthree.model.local.User;
import lombok.*;

/**
 * 用户注册响应-201
 *
 * @author FranklinThree
 * @date 2023/07/05
 * @className PostUserRegister201Response
 * @see
 * @since 1.0.0
 */

//@AllArgsConstructor
//@NoArgsConstructor
@Setter
@Getter
@ToString
@NoArgsConstructor
public class PostUserRegister201Response{
    private User user;

    public PostUserRegister201Response(User user) {

        this.user = user.safely(2);

    }
}


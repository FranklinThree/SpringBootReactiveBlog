package com.github.franklinthree.model.transfer.request;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.github.franklinthree.model.local.User;
import lombok.*;

/**
 * 用户注册请求
 *
 * @author FranklinThree
 * @date 2023/07/05
 * @className PostUserRegisterRequest
 * @see
 * @since 1.0.0
 */
@NoArgsConstructor
@ToString
@Getter
@JsonTypeName("post_user_register_request")
public class PostUserRegisterRequest {
    private User user;


}

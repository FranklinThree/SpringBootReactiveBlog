package com.github.franklinthree.model.transfer.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class PostUserLoginRequest {
    String email;
    String username;
    String password;
}

package com.github.franklinthree.model.transfer.response;

import com.github.franklinthree.model.local.User;
import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@ToString
public class PostUserLogin202Response {
    private String accessToken;
    private User user;

    public PostUserLogin202Response(String accessToken, User user) {
        this.accessToken = accessToken;
        this.user = user.safely(0);
        //this.setPassword(user.getPassword());
    }
}

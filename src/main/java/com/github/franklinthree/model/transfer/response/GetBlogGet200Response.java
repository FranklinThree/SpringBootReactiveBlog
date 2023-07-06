package com.github.franklinthree.model.transfer.response;

import com.github.franklinthree.model.local.Blog;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class GetBlogGet200Response {
    private Blog blog;
}

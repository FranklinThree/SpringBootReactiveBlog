package com.github.franklinthree.model.transfer.response;

import com.github.franklinthree.model.local.Blog;
import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GetBlogList200Response {
    private List<Blog> blogs;

}

package com.github.franklinthree.model.transfer.request;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class GetBlogListRequest {
    String order;
    String pages;
    String perPages;
}

package com.github.franklinthree.controller.public1;

import com.github.franklinthree.model.local.Blog;
import com.github.franklinthree.model.transfer.request.GetBlogGetRequest;
import com.github.franklinthree.model.transfer.request.GetBlogListRequest;
import com.github.franklinthree.model.transfer.response.GetBlogGet200Response;
import com.github.franklinthree.model.transfer.response.GetBlogList200Response;
import com.github.franklinthree.service.impl.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicBlogController {
    @Autowired
    private BlogServiceImpl blogService;
    @GetMapping("/blog/list")
    public Object blogList(){
        List<Blog> blogList = blogService.getBlogList();
        return new GetBlogList200Response(blogList);
    }
    @GetMapping("/blog/get")
    public Object blogGet(@RequestParam String blogId){
        Blog blog = blogService.getBlog(blogId);

        return new GetBlogGet200Response(blog);
    }
}

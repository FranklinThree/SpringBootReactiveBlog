package com.github.franklinthree.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.franklinthree.mapper.BlogMapper;
import com.github.franklinthree.model.local.Blog;
import com.github.franklinthree.model.transfer.request.GetBlogGetRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("blogService")
public class BlogServiceImpl {
    @Autowired
    private BlogMapper blogMapper;
    public List<Blog> getBlogList() {
        return blogMapper.selectList(new QueryWrapper<Blog>());
    }
    public Blog getBlog(String id){
        return blogMapper.selectOne(new QueryWrapper<Blog>().eq("id",id));
    }

    public Blog getBlog(GetBlogGetRequest request){
        return blogMapper.selectOne(new QueryWrapper<Blog>().eq("id",request.getBlogId()));
    }
}

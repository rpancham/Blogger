package org.acme;

import java.util.ArrayList;
import java.util.List;

public class BlogService {
    List<Blog> blogs = new ArrayList<>();

    public BlogService() {
    }

    public List<Blog> getBlog() {
        Blog blog = new Blog();
        blog.author = "Rashmi";
        blog.name = "Covid";

        Blog blog2 = new Blog();
        blog2.author = "Ruchir";
        blog2.name ="Omricon";

        Blog blog3 = new Blog();
        blog3.author = "Shuba";
        blog3.name = "Delta";

        blogs.add(blog);
        blogs.add(blog2);
        blogs.add(blog3);


        return blogs;
    }

    public Blog getparBlog(String name, String author){
       Blog getparblog = new Blog();
        //blog.author = author;
        //blog.name = name ;
//        blogs.add(blog);
        return getparblog;
    }






    public Blog postBlog(String name, String author){
        Blog blog = new Blog();
        blog.author = author;
        blog.name = name ;
        blogs.add(blog);
        return blog;
}}
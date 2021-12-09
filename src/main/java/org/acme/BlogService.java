package org.acme;
import java.util.List;

public interface BlogService {
    List<Blog> getBlogs();
    Blog postBlog(String name, String author);
    Blog getBlog(String name, String author);
    Blog updateBlog(String name, String author);
    Blog deleteBlog(String name, String author);
}
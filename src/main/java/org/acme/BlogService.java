package org.acme;
import java.util.List;

public interface BlogService {
    List<Blog> getBlogs();

    Blog postBlog(Blog blog);
    Blog UpdateBlog(String id ,Blog blog);
    String deleteBlog(long id);
    Blog getBlog(Blog id);
}





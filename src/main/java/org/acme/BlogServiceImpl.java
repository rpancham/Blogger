package org.acme;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
    public class BlogServiceImpl implements BlogService {

    @Inject
    BloggingRepository bloggingRepository;


    public BlogServiceImpl() {

    }

    @Transactional
    public List<Blog> getBlogs() {
        return Blog.listAll();
    }


    @Transactional
    public Blog getBlog(Blog id) {
        Blog blog = new Blog();
        List<Blog> blogs = Blog.listAll();
        for (Blog blog1 : blogs) {
            if (blog1.id.equals(id)) {
                return blog;
            }
        }
        return null;
    }


    @Transactional
    public Blog postBlog(Blog blog) {

        return bloggingRepository.postBlog(blog);
    }

    @Transactional
    public Blog UpdateBlog(String id , Blog blog) {
        return bloggingRepository.updateBlog(id);
    }


    @Transactional
    public String deleteBlog(long id ) {
        return bloggingRepository.findanddelete(id);
    }


}








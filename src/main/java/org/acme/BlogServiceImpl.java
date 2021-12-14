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

//    @Transactional
//    public Blog postBlog(String name, String author) {
//        Blog blog = new Blog();
//        blog.author = author;
//        blog.name = name;
//        blog.persist();
//        return blog;
//
//
//    }

    @Transactional
    public Blog getBlog(int id) {
        Blog blog = new Blog();
        List<Blog> blogs = Blog.listAll();
        for (Blog blog1 : blogs) {
            if (blog1.id.equals(id)) {
                return blog;
            }
        }
        return null;
    }

//
//    @Transactional
//    public Blog updateBlog(String name, String author) {
//        Blog blog = new Blog();
//        List<Blog> blogs = Blog.listAll();
//        for (Blog blog1 : blogs) {
//            if (blog1.name.equals(name)) {
//                blog1.name = name;
//                blog1.author = author;
//                blog.persist();
//                return blog;
//
//
//            }
//        }
//        return null;
//    }
//
//    public Blog deleteBlog(String name, String author ) {
//        Blog blog = new Blog();
//        if (blog.isPersistent()) {
//            blog.name = name;
//            blog.author = author;
//            blog.delete();
//        }
//
//        return null;
//    }
    public List<Blog> blogByAuthorName(String name) {

        return bloggingRepository.getBlogsByAuthorName(name);
    }

    public Blog updateBlog(String name, String author) {

        return bloggingRepository.updateBlog(name,author);
    }


    public Blog postBlog(String name, String author) {

        return bloggingRepository.postBlog(name,author);
    }


    public Blog deleteBlog(String name, String author) {

        return bloggingRepository.deleteBlog(name,author);
    }



}














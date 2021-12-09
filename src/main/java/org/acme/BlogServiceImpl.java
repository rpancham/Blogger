package org.acme;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
    public class BlogServiceImpl implements BlogService {
        List<Blog> blogs = new ArrayList<>();

        public BlogServiceImpl() {

            Blog blog = new Blog();
            blog.author = "Ruchir";
            blog.name = "Omicron";
            Blog blog2 = new Blog();
            blog2.author = "Shuba";
            blog2.name = "Delta";

            Blog blog3 = new Blog();
            blog3.author = "Radha";
            blog3.name = "Covid";

            blogs.add(blog);
            blogs.add(blog2);
            blogs.add(blog3);


        }

        public List<Blog> getBlogs() {

            return blogs;
        }

        public Blog postBlog(String name, String author) {
            Blog blog = new Blog();
            blog.author = author;
            blog.name = name;
            blogs.add(blog);
            return blog;


        }

        public Blog getBlog(String name,String author) {
            for (Blog blog1 : blogs) {
                if (blog1.name.equals(name) && blog1.author.equals(author)) {
                    blog1.name = name;
                    blog1.author=author;
                    blogs.add(blog1);

                }
            }
            return null;
        }

        public Blog updateBlog(String name, String author) {
            for (Blog blog1 : blogs) {
                if (blog1.name.equals(name)) {
                    blog1.name = name;
                    blog1.author = author;


                }
            }
            return null;
        }

    public Blog deleteBlog(String name, String author) {
        for (Blog blog1 : blogs) {
            if (blog1.name.equals(name)) {
                blog1.name = name;
                blog1.author = author;
                blogs.remove(blog1);
            }
            }
            return null;
        }
    }




















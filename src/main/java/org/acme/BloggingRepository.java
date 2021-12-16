package org.acme;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import net.bytebuddy.build.AccessControllerPlugin;

    @ApplicationScoped
    public class BloggingRepository implements PanacheRepository<Blog> {

        public List<Blog> getBlog(int id) {
            List<Blog> blogs = listAll();
            List<Blog> response = new ArrayList<>();
            for (Blog blog : blogs) {
                if (blog.id.equals(id))
                {
                    response.add(blog);
                }
            }
            return  response;
        }


        public Blog postBlog(Blog blog) {
            blog.persist();
            return blog;


        }



        public Blog updateBlog(String name) {
            Blog blog = new Blog();
            List<Blog> blogs = Blog.listAll();
            for (Blog blog1 : blogs) {
                if (blog1.name.equals(name)) {
                    blog1.name =  name;
                    blog.persist();
                    return blog;


                }
            }
            return null;
        }



        String findanddelete(long id) {
            Blog blog = findById(id);
            if (blog.isPersistent()) {
                if (deleteById(id) == true) {
                    return "Item is deleted with id" + id;
                }
            }
            return "Item is not deleted with id";
        }















    }







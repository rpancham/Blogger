package org.acme;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/Blogs")
public class GreetingResource {


    @Inject
    BlogService blogService;

    @GET
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Blog> Blogwithqwery(@QueryParam("name") String name) {
        return blogService.getBlogs();
    }

    @GET
    @Path("/blogByAuthorName")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public List<Blog> blogByAuthorName(@QueryParam("name") String name) {
        return blogService.blogByAuthorName(name);
    }


    @POST
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog PostBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return blogService.postBlog(name, author);
    }

    @PUT
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog updateBlog(@QueryParam("name") String name, @QueryParam("author") String author){
        return blogService.updateBlog(name, author);
    }

    @GET
    @Path("/blog/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog getBlog(@PathParam("id") int id) {
        return blogService.getBlog(id);
    }



    @DELETE
   @Path("/blog")
   @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Blog deleteBlog(@QueryParam("name") String name, @QueryParam("author") String author){
       return blogService.deleteBlog(name, author);
    }
}






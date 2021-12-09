package org.acme;

import javax.inject.Inject;
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
    public List<Blog> Blogwithqwery(@QueryParam("name") String name) {
        return (List<Blog>) blogService.getBlogs();
    }

//    @GET
//    @Path("/blog")
//    @Produces(MediaType.APPLICATION_JSON)
//    public String readblog (@PathParam("Blog") String Blog){
//        return "read a blog by blogger";
//    }

    @POST
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog PostBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return blogService.postBlog(name, author);
    }

    @PUT
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog updateBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return blogService.updateBlog(name, author);
    }

    @GET
    @Path("/blog/{name}{author}")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog getBlog(@PathParam("name") String name, @PathParam("author") String author) {
        return blogService.getBlog(name, author);
    }

    @DELETE
    @Path("/blog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog deleteBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return blogService.deleteBlog(name, author);
    }
}
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String blog() {
//        return "Read all Blogs";
//    }
//
//
//    @GET
//    @Path("/getallblog")
//
//    public String getallblog () {
//        return "You are Viewing the list of all the blogs";
//    }
//
//
//    @POST
//    @Path("/postblog")
//    public String postblog() {
//        return "A new Blog is created with content Hello";
//    }
//
//    @GET
//    @Path("/getparblog")
//    public String getparblog () {
//        return "You are viewing a blog with the id 12";
//    }
//
//    @GET
//    @Path("/{name}/{id}")
//    public String getparblog (@PathParam("name") String name, @PathParam("id")String id) {
//        return "You are viewing a blog with the id " +name   +id;
//    }
//
//    @PUT
//    @Path("/putblog/{id}/{name}")
//    public String putblog (@PathParam("id") String name, @PathParam("name")String id) {
//        return "The blog has been edited with the "+id   +name ;
//        //return "A blog with" +id + "has been updated with content hello"  ;
//    }
//
//
//    @DELETE
//    @Path("/deleteblog")
//    public String deleteblog (@PathParam("id") String id){
//        return "You deleted the blog with the id" +12;
//    }
//
//
//
//
//






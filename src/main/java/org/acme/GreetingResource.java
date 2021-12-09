package org.acme;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/Blog")
public class GreetingResource {

    BlogService blogService = new BlogService();

    @GET
    public String Blog() {
        return "Read All Blogs";
    }

    @GET
    @Path("/listallblog")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Blog> Blogwithquery() {
        return blogService.getBlog();
    }


    @GET
    @Path("/readblog")
    @Produces(MediaType.APPLICATION_JSON)
    public String readblog (@PathParam("Blog") String Blog){
        return "read a blog by blogger";
    }


    @GET
    @Path("/getparblog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog Getparblog(@QueryParam("name") String name, @QueryParam("author")String author) {
        return blogService.getparBlog(name,author);
    }

    @POST
    @Path("/postblog")
    @Produces(MediaType.APPLICATION_JSON)
    public Blog PostBlog(@QueryParam("name") String name, @QueryParam("author") String author) {
        return blogService.postBlog(name , author);
    }


    @PUT
    @Path("/putblog/{name}/{author}")
    public String putblog (@PathParam("name") String name, @PathParam("author")String author) {
        return "The blog has been edited with the author "+ author  + "and name is" +name ;
    }
    @DELETE
    @Path("/deleteblog")
    @Produces(MediaType.APPLICATION_JSON)
    public String removequery(@QueryParam("author") String author, @QueryParam("name") String name) {
        return "A blog with " +name+ "and" +author+ "has been deleted";
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






package com.bank;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;



@Path("/hello")
public class GreetingResource {

    @GET
    @Path("/public")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Welcome to public page\nEvery one can  access";
    }

    @GET
    @Path("/admin")
    @SecurityRequirement(name="Keycloak")
    @Produces(MediaType.TEXT_PLAIN)
    public String admin() {
        return "Welcome to Admins page";
    }


    @GET
    @Path("/manager")
    @SecurityRequirement(name="Keycloak")
    @Produces(MediaType.TEXT_PLAIN)
    public String manager() {
        return "Welcome to manager page";
    }

    @GET
    @Path("/staff")
    @SecurityRequirement(name="Keycloak")
    @Produces(MediaType.TEXT_PLAIN)
    public String staff() {
        return "Welcome to staff page";
    }
}

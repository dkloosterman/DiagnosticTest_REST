/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiagnosticTest_pkg;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Owner
 */
@Path("DiagnosticTest")
public class DiagnosticTest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of DiagnosticTest
     */
    public DiagnosticTest() {
    }

    /**
     * Retrieves representation of an instance of
     * DiagnosticTest_pkg.DiagnosticTest
     *
     * @return an instance of java.lang.String
     */
    @GET
   @Produces("text/plain")

   public String getDiagTest() {
        double result = Math.random();
        String resultString = "Diagnostic Test Result is: " + Double.toString(result);
        return resultString;
    }

    /**
     * PUT method for updating or creating an instance of DiagnosticTest
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}

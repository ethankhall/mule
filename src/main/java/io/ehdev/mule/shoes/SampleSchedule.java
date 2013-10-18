package io.ehdev.mule.shoes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Controller
@Path("sample")
public class SampleSchedule {

    private static final Logger log = LoggerFactory.getLogger(SampleSchedule.class);

    @Scheduled(fixedDelay = 60000L)
    public void runThisRegularly(){
        executeIncludedLib();
    }

    @Path("runManually")
    @GET
    public Response runThisManually(){
        executeIncludedLib();
        return Response.status(200).entity("Running").build();
    }

    private void executeIncludedLib(){
        log.info("<-------> Starting job");
        log.info("<-------> Ending job");
    }

}

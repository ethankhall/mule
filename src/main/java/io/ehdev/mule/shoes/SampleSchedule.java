package io.ehdev.mule.shoes;

import io.ehdev.mule.JobRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("sample")
public class SampleSchedule {

    private static final Logger log = LoggerFactory.getLogger(SampleSchedule.class);
    private static final long SECONDS_IN_MIN = 60000L;

    @Scheduled(fixedDelay = 5 * SECONDS_IN_MIN)
    public void runThisRegularly(){
        log.info("Running scheduled job");
        executeIncludedLib();
    }

    @RequestMapping(value = "runManually", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    JobRequest runThisManually(){
        log.info("Got REST from URL");
        executeIncludedLib();
        return new JobRequest("running");
    }

    private void executeIncludedLib(){
        log.info("<-------> Starting job");
        log.info("<-------> Ending job");
    }

}

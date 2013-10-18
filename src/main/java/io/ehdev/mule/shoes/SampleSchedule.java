package io.ehdev.mule.shoes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("sample")
public class SampleSchedule {

    private static final Logger log = LoggerFactory.getLogger(SampleSchedule.class);
    private static final long SECONDS_IN_MIN = 1000L;

    @Scheduled(fixedDelay = 5 * SECONDS_IN_MIN)
    public void runThisRegularly(){
        log.info("Running scheduled job");
        executeIncludedLib();
    }

    @RequestMapping(value = "runManually", method = RequestMethod.GET)
    public @ResponseBody String runThisManually(){
        log.info("Got REST from URL");
        executeIncludedLib();
        return "running";
    }

    private void executeIncludedLib(){
        log.info("<-------> Starting job");
        log.info("<-------> Ending job");
    }

}

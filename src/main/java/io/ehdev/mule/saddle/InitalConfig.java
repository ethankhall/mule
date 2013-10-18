package io.ehdev.mule.saddle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan({ "io.ehdev.mule" })
@EnableAsync
@EnableScheduling
public class InitalConfig  {

    static final Logger logger = LoggerFactory.getLogger(InitalConfig.class);

}

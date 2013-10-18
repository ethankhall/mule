package io.ehdev.mule.saddle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "io.ehdev.mule" })
public class InitalConfig  {

    static final Logger logger = LoggerFactory.getLogger(InitalConfig.class);

}

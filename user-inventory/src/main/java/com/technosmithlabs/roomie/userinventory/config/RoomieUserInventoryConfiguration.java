package com.technosmithlabs.roomie.userinventory.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.technosmithlabs.roomie.userinventory"})
public class RoomieUserInventoryConfiguration {

    // need to add internal view resolver here so that there is a page put up showing the service is running.
    /*@Bean
    public ViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/templates/");
        bean.setSuffix(".html");
        return bean;
    }*/

}

package com.neatlife.mywar;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author suxiaolin
 * @date 2019-05-07 10:50
 */
public class MySpringBootServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MywarApplication.class);
    }
}

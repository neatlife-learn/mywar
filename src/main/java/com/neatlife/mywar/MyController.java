package com.neatlife.mywar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suxiaolin
 * @date 2019-05-07 10:51
 */
@RestController
@RequestMapping("test")
public class MyController {

    @RequestMapping("test1")
    public String test1() {
        return "test1";
    }

    @RequestMapping("test2")
    public String test2() {
        return "test2";
    }

}

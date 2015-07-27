package org.brinman2002.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("playdoc")
public class JavaBasedController {

    @RequestMapping(method = RequestMethod.GET)
    public String hi() {
        return " Hi from the java service";
    }
}

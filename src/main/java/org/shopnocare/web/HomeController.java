package org.shopnocare.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rayed
 * @date 4/1/17.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String returnHomePage() {
        return "home";
    }
}

package yzx.yzx.remote.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller//此注解的意思是@RestController = @Controller + @ResponseBody
public class UserController {
    /**
     * 测试接口
     */
    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        System.out.println("......");
        modelMap.addAttribute("name", "sky");
        return "index";
    }


}

package yzx.yzx.remote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller//此注解的意思是@RestController = @Controller + @ResponseBody
public class UserController {
    /**
     * 测试接口
     * */
    @ResponseBody
    @RequestMapping("/hello")
    public String Test(){
        return "hello word";
    }


}

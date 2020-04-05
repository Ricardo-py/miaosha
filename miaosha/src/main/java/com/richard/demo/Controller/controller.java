package com.richard.demo.Controller;

import com.richard.demo.result.CodeMsg;
import com.richard.demo.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/demo")
public class controller {

    @RequestMapping("/")
    public String home(){
        return "index1";
    }

    @ResponseBody
    @RequestMapping("/success")
    public Result<String> success(){
        return new Result<String>("成功了");
    }

    @ResponseBody
    @RequestMapping("/error")
    public Result<String> error(){
        return new Result<String>(CodeMsg.ERROR);
    }
}

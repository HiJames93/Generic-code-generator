package cn.james.makecoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @RequestMapping("")
    public String toShow(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("testSqlLinker.html")
    public Map<String, Object> testSqlLinker(@ResponseBody ){
        Map<String, Object> data=new HashMap<>();
        boolean flag=false;
        if (flag){
            data.put("msg", "success");
        }else {
            data.put("msg","failure");
        }
        return data;
    }
}

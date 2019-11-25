package cn.how2j.trend.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 模拟回测视图控制类
 * @author zhangh
 * @date 2019/11/14
 */
@Controller
@RefreshScope
public class ViewController {
    @Value("${version}")
    String version;
    @GetMapping("/")
    public String view(Model model) throws Exception {
        model.addAttribute("version",version);
        return "view";
    }
}

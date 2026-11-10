package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home/index")
    public String index(Model model) {
        model.addAttribute("appName", "Product Portal");
        model.addAttribute("subject", "SOF3022 - Spring Boot MVC");
        model.addAttribute("semester", "Summer 2026");
        model.addAttribute("message", "Chào mừng bạn đến với hệ thống quản lý sản phẩm");
        return "home/index";
    }

    @RequestMapping("/home/about1")
    public String about(Model model) {
        model.addAttribute("appName", "Product Portal");
        model.addAttribute("subject", "SOF3022 - Spring Boot MVC");
        model.addAttribute("semester", "Summer 2026");
        model.addAttribute("message", "Giới thiệu: Hệ thống Product Portal được phát triển phục vụ môn học SOF3022.");
        return "home/about1";
    }

    @RequestMapping("/home/help")
    public String help(Model model) {
        model.addAttribute("appName", "Product Portal");
        model.addAttribute("subject", "SOF3022 - Spring Boot MVC");
        model.addAttribute("semester", "Summer 2026");
        model.addAttribute("message",
                "Trợ giúp: Vui lòng liên hệ quản trị viên hoặc giảng viên phụ trách nếu cần hỗ trợ.");
        return "home/help";
    }
}

package question5;

/*import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectController5 {

    @GetMapping("/question5/test")
    public String redirectToTest2() {
        return "redirect:/question5/test2";
    }

    @GetMapping("/question5/test2")
    public String test2() {
        return "test2"; // returns test2.html (Thymeleaf) or test2.jsp
    }
}*/


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RedirectController5 {

    @GetMapping("/direct/test")
    public String redirectToTest2() {
        return "redirect:/example/test2";
    }

    @GetMapping("/example/test2")
    @ResponseBody
    public String test2() {
        return "✅ Redirected Successfully to /example/test2";
    }
}




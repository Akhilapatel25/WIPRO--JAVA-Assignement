package question6;


	
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class CSSJSController6 {

	    @GetMapping("/home")
	    public String homePage() {
	        return "home"; 
	    }
	}




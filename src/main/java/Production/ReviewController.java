package Production;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {
	
	@Resource
	ReviewRepository reviewRepo;
	
	@RequestMapping("/home")
	public String displayHome(Model model) {
		return "home";
	}
	
	@RequestMapping("/reviews")
	public String fetchReviews(Model model) {
		model.addAttribute("reviewsAsCollection", reviewRepo.findAll());
		return "reviews";
	}

}

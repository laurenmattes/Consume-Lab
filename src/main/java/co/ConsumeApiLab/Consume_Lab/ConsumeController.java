package co.ConsumeApiLab.Consume_Lab;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConsumeController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/complete")
	public ModelAndView complete() {
		List<Complete> complete = apiService.getCompleteList();
		return new ModelAndView("complete", "complete", complete);
	}

	@RequestMapping("/tiny")
	public ModelAndView tiny() {
		List<Tiny> tiny = apiService.getTinyList();

		return new ModelAndView("tiny", "tiny", tiny);

	}

	@RequestMapping("/")
	public ModelAndView index() {

		return new ModelAndView("index");
	}

}

package controllers;

import model.LoginForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//import javax.validation.Valid;
public class ErrorController {
    public static final String ERROR_BASE_MAPPING = "/error";
    public static final String ERROR_404_VIEW = "error";

    @GetMapping(ERROR_BASE_MAPPING + "/404")
    public String notFound(Model model) {
        model.addAttribute("title", "404 Error");
        return ERROR_404_VIEW;
    }
}

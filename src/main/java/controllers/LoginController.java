package controllers;

import model.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.LoginService;

//import javax.validation.Valid;

//import javax.validation.Valid;

public class LoginController {


    public static final String BINDING_RESULT = "org.springframework.validation.BindingResult.";
    public static final String ERROR_LOGIN_HTML = "/";

    private final LoginService loginService;

    @Autowired
    private LoginService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new LoginForm());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") @Valid LoginForm user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "register";
        }

        if (userService.findByUsername(user.getFirstName()) != null) {
            model.addAttribute("usernameExists", "Username already exists");
            return "register";
        }

        userService.saveUser(user);
        return "redirect:/login";
    }

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @PostMapping("/login")
    public String login(
            Model model,
            @Valid @ModelAttribute("loginForm") LoginForm loginForm,
            BindingResult result) {

        if (result.hasErrors() || result.hasFieldErrors()) {
            model.addAttribute("Title", "Insert global reference parameter");
            model.addAttribute("Error",true);
            model.addAttribute("isInsert", true);
            model.addAttribute(BINDING_RESULT + "globalReferenceForm", result);

            return ERROR_LOGIN_HTML;
        }

//        loginForm.setUsername(principal.getAttribute("preferred_username"));
//        model.addAttribute("title", "Global reference results");
//        model.addAttribute("successMessage", "globalReferenceForm");
//        model.addAttribute("actionDone", "inserted");

//        redirectAttributes.addFlashAttribute("globalReferenceForm", globalReferenceForm);
//        redirectAttributes.addFlashAttribute("actionDone", model.getAttribute("actionDone"));
        return "welcome";
    }
}

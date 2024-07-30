package service;

import model.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.password.PasswordEncoder;
import repository.UserRepository;

public class LoginService {
    public static final String SEARCH_GLOBAL_REFERENCE_MAPPING = "/global-references";
    public static final String SINGLE_GLOBAL_REFERENCE_MAPPING = "/global-reference";

//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public LoginForm findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//
//    public void saveUser(LoginForm user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);
//    }

//    private final WebClient webClient;

//    public GlobalReferenceService(WebClient webClient) {
//        this.webClient = webClient;
//    }
//
//    public MdrApiResponse updateGlobalReference(GlobalReferenceForm globalReferenceForm) {
//        globalReferenceForm.setNewId(globalReferenceForm.getId());
//        globalReferenceForm.setNewStartDate(globalReferenceForm.getStartDate().toLocalDate());
//        return webClient
//                .put()
//                .uri(
//                        uriBuilder ->
//                                uriBuilder
//                                        .path(
//                                                "global-reference/"
//                                                        + globalReferenceForm.getOldDate().toString()
//                                                        + "/"
//                                                        + globalReferenceForm.getOldId())
//                                        .build(
//                                                globalReferenceForm.getNewStartDate(),
//                                                globalReferenceForm.getNewId(),
//                                                globalReferenceForm.getValue(),
//                                                globalReferenceForm.getDescription()))
//                .header("isValidation", String.valueOf(globalReferenceForm.isValidation()))
//                .header("username", globalReferenceForm.getUsername())
//                .contentType(MediaType.APPLICATION_JSON)
//                .accept(MediaType.APPLICATION_JSON)
//                .body(BodyInserters.fromValue(globalReferenceForm))
//                .exchangeToMono(x -> x.toEntity(MdrApiResponse.class))
//                .block()
//                .getBody();
//    }
}

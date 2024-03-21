package spring.boot.springboothoc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import spring.boot.springboothoc.domain.Student;

@Controller
public class HelloController {
    @RequestMapping("/") // Map this method to the /hello URL
    public String home (ModelMap model) {
        model.addAttribute("message", "<h3>Hello Thymeleaf</h3>");
        return "index";
    }
    @RequestMapping("/hello") // Map this method to the /hello URL
    public String index(ModelMap model) {
        model.addAttribute("message", "<h3>Hello Thymeleaf</h3>");
        return "index";
    }

    @RequestMapping("/hello")
    public String adminUser(Model model) {
        model.addAttribute("form-student", new Student());
        return "index";
    }


//    @RequestMapping("/submit")
//    public String createUser(@ModelAttribute("form-student") Student user) {
//        userRepository.save(user);
//        return "redirect:/admin/user";
//    }


}






//package spring.boot.springboothoc.Controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import spring.boot.springboothoc.domain.SINHVIEN;
//import spring.boot.springboothoc.respository.save;
//
//@Controller
//public class HelloController {
//
//    private final save studentRepository;
//
//    @Autowired
//    public HelloController(save studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    @RequestMapping("/") // Map this method to the /hello URL
//    public String home(ModelMap model) {
//        model.addAttribute("message", "<h3>Hello Thymeleaf</h3>");
//        return "index";
//    }
//
//    @PostMapping("/submit") // Map this method to the /submit URL with POST method
//    public String submitForm(@RequestParam String email, @RequestParam String username, ModelMap model) {
//        // Create a new Student object with the provided email and username
//        SINHVIEN student = new SINHVIEN(email, username);
//
//        // Save the student object to the database using repository
//        studentRepository.savee(student);
//
//        // Add the submitted data to the model to display it on the view
//        model.addAttribute("email", email);
//        model.addAttribute("username", username);
//
//        // Return the name of the Thymeleaf template to display the result
//        return "submitted";
//    }
//}

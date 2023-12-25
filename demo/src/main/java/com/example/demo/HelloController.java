package com.example.demo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * a controller that, when sending a GET request to it, will
 return a string of the form: "Hello, {name}"
 */
@Controller
public class HelloController {
    /**
     * Get request
     * @param firstName name in "Hello, {name}"
     * @return "Hello, {name}"
     */
    @GetMapping("/hello")
    @ResponseBody
    public ResponseEntity<String> getName(@RequestParam("name")
                                          final String firstName) {
        String response = "Hello, " + firstName;
        return ResponseEntity.ok().body(response);
    }
}

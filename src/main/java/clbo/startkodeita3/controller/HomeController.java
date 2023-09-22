package clbo.startkodeita3.controller;


import clbo.startkodeita3.repository.MoviesRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController   // RestController restc = new RestController
public class HomeController {// HomeController cont = new HomeController()

    // Data
    MoviesRepository repo = new MoviesRepository();



    @GetMapping("/")
    public String index(){
        return "Hello world";
    }

    @GetMapping("/api/post/")
    public Movie aaa(){
        return repo.read(1);
    }

    @GetMapping("/api/watch")
    public String watch(@RequestParam String id){
        return "Im am now watching video number " + id;
    }
}

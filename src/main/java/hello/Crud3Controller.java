package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping(value = "other")
public class Crud3Controller {
	
    @CrossOrigin
    @PostMapping()
    public String create() {
		return "{create}";
    }    

    @CrossOrigin
    @GetMapping()
    public String read() {
		return "{read}";
    }    
        
    @CrossOrigin
    @PutMapping()
    public String update() {
		return "{update}";
    }    

    @CrossOrigin
    @DeleteMapping()
    public String delete() {
		return "{delete}";
    }	
	
}

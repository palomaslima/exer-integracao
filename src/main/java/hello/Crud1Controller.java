package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class Crud1Controller {
	 
    @CrossOrigin
    @PostMapping(value = "recurso")
    public String create() {
		return "{create}";
    }    

    @CrossOrigin
    @GetMapping(value = "recurso")
    public String read() {
		return "{read}";
    }    
        
    @CrossOrigin
    @PutMapping(value = "recurso")
    public String update() {
		return "{update}";
    }    

    @CrossOrigin
    @DeleteMapping(value = "recurso")
    public String delete() {
		return "{delete}";
    }     
	
}

package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping(value = "recurso")
public class Crud2Controller {
	
    @CrossOrigin
    @PostMapping(value = "create")
    public String create() {
		return "{create}";
    }    

    @CrossOrigin
    @GetMapping(value = "read")
    public String read() {
		return "{read}";
    }    
        
    @CrossOrigin
    @PutMapping(value = "update")
    public String update() {
		return "{update}";
    }    

    @CrossOrigin
    @DeleteMapping(value = "delete")
    public String delete() {
		return "{delete}";
    }	
	
}

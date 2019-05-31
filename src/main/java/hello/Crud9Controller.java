package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.HttpEntity;

public class Crud9Controller {

	/**
	 * relacionado a JSON
	 * 
	 * @param httpEntity
	 */
    @GetMapping(value = "foo")
    public void foo(HttpEntity<String> httpEntity) {
    	String json = httpEntity.getBody();
    	System.out.println("--- inicio ---");
    	System.out.print(json);
    	System.out.println("--- fim ---");
    }	
	
}

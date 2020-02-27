package DAv.Controllers;

import javax.sql.DataSource;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import DAv.Features.LoginAuth.Domain.DavRepository;


@RestController //tells spring to reference the restcontroller class

public class LoginController {
	@Autowired
	DavRepository davRepository;
	
    @GetMapping("/find")
    public String getStuff() {
		
		return davRepository.find(1).getPassWord();
    }
    
    @GetMapping("/create")
    public String getMoreStuff(@RequestParam String username,@RequestParam String password ) {
    	davRepository.createNewUser(username, password);
    	return "record created";
    }
    

}
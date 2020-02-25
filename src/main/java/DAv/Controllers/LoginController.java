package DAv.Controllers;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import DAv.Features.LoginAuth.Domain.DavRepository;


@RestController //tells spring to reference the restcontroller class

public class LoginController {
	@Autowired
	DavRepository davRepository;
	
    @GetMapping("/test")
    public String getStuff() {
		
		return davRepository.find(1).getPassWord();
    }

}
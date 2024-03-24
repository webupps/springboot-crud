package com.webupps.spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

//import com.bezkoder.spring.restapi.model.Tutorial;
import com.webupps.spring.app.model.Users;
import com.webupps.spring.app.repository.UsersRepository;
import com.webupps.spring.app.service.EmailValidatorService;

@RestController // shorthand for @Controller and @ResponseBody rolled together
@RequestMapping("/v1/users")
public class UsersResource {



	private static UsersRepository usersRepository;
	/*
	private UsersRepository usersRepository;

    public UsersResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    } */

	
	@PostMapping("/add")
    public ResponseEntity<Users> addUsers(@RequestBody Users users) {
		//return new ResponseEntity<Users>(users, new HttpHeaders(), HttpStatus.OK);
		/*
    	if(EmailValidatorService.isValidEmailAddress(users.getUsername())){
    		usersRepository.save(users);
    		return new ResponseEntity<Users>(users, new HttpHeaders(), HttpStatus.OK);
    	} else { 
    		return new ResponseEntity<Users>(users, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
    	}*/
		
		try {
			Users _users = usersRepository.save(users);
		      return new ResponseEntity<Users>(_users, HttpStatus.CREATED);
		    } catch (Exception e) {
		      return new ResponseEntity<Users>(users, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	@PutMapping("/update/{id}")
    public ResponseEntity<?> updateUser(@RequestBody Users obj, @PathVariable("id") final Long id){
	
    	Users user = usersRepository.findById(id).get();
               
    	     if(obj.getName() != null){
    	    	 user.setName(obj.getName());
    	     }
    	     if(obj.getUsername()  != null){
   	    	  	user.setUsername(obj.getUsername());
   	         }
    	     if(obj.getPassword()  != null){
      	    	user.setPassword(obj.getPassword());
      	     }
    	
    	      
    		  usersRepository.save(user); 
 
    	return ResponseEntity.ok("user updated");
    }
    
   
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable final Long id) {
        
    	if(usersRepository.findById(id).get() == null){
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	} else { 
    		usersRepository.deleteById(id);
    		return ResponseEntity.ok("user " + id + " deleted");
    	}
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Users> getUser(@PathVariable final Long id) {
        
    	if(usersRepository.findById(id).get() == null){
    		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    	} else { 
    		return new ResponseEntity<Users>(usersRepository.findById(id).get(), new HttpHeaders(), HttpStatus.OK);
    	}
    }

}


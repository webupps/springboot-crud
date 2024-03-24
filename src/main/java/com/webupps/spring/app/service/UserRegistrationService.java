package com.webupps.spring.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import com.webupps.spring.app.model.Users;
import com.webupps.spring.app.repository.UsersRepository;



@Service
public class UserRegistrationService {
    
    
	//@Autowired
    UsersRepository usersRepository;

	public static void main(String[] args) {
	}
	
	@Transactional
    public ResponseEntity<?> registerNewUserAccount(Users users) { 
	    if (emailExist(users.getUsername())) {  
	    	usersRepository.save(users);
    		return new ResponseEntity<Users>(users, new HttpHeaders(), HttpStatus.OK);
	    } else {
	    	return new ResponseEntity<Users>(users, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
	    }
	} 
    
    private boolean emailExist(String username) {
        return usersRepository.findByUsername(username) != null;
    } 
    
}

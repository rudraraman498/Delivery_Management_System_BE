package com.delivery_express_be.Delivery_Express.service;


import com.delivery_express_be.Delivery_Express.model.User;
import com.delivery_express_be.Delivery_Express.model.UserLoginRequest;
import com.delivery_express_be.Delivery_Express.model.UserRegisterRequest;
import com.delivery_express_be.Delivery_Express.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;


    public User registerUser(UserRegisterRequest request ){
        String hashedPassword = passwordEncoder.encode(request.getPassword());
        User user = userRepository.findByEmail(request.getEmail());

//        if(userRepository.existsByEmail(email)){
//            User user = new User();
//            return user;
//        }
//        else {
//            return userRepository.findByEmail(email);
//        }
        if(user!=null){
            return null;
        }
        else{
            try {
                System.out.println(request);
                userRepository.save(new User(request.getFirstname(),request.getLastname(),request.getEmail(),  hashedPassword,  null,  "Customer",  "Google", null, null));
                return userRepository.findByEmail(request.getEmail());
            }
            catch (Exception e){
                return null;
            }
        }
    }

    public User loginUser(UserLoginRequest request){
        User user = userRepository.findByEmail(request.getEmail());
        if(user!=null){
            boolean passwordmatches = passwordEncoder.matches(request.getPassword(),user.getPasswordhash());
            if(passwordmatches){
                return user;
            }
        }
        return user;
    }

}

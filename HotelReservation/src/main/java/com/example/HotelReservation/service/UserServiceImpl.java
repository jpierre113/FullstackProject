package com.example.HotelReservation.service;


import com.example.HotelReservation.config.JwtUtil;
import com.example.HotelReservation.model.User;
import com.example.HotelReservation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

//    @Autowired
//    RoomRepository roomRepository;

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    @Qualifier("encoder")
    PasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = getUser(username);

        if(user==null)
            throw new UsernameNotFoundException("User null");

        return new org.springframework.security.core.userdetails.User(user.getUsername(), bCryptPasswordEncoder.encode(user.getPassword()),
                true, true, true, true, new ArrayList<>());
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }


    @Override
    public Iterable<User> listUsers() {
        return userRepository.findAll();
    }

    /**
     *
     * @param newUser
     * @return new user with pw and token
     */
    @Override
    public String createUser(User newUser) {
//        UserRole userRole = userRoleService.getRole(newUser.getUserRole().getName());
//        newUser.setUserRole(userRole);
        newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
        if(userRepository.save(newUser) != null){
            UserDetails userDetails = loadUserByUsername(newUser.getUsername());
            return jwtUtil.generateToken(userDetails);
        }
        return null;
    }

    /**
     *
     * @param user
     * @return find user by username, find pw and return token
     */
    //
    @Override
    public String login(User user){
        User newUser = userRepository.findByUsername(user.getUsername());
        //userRepository.login(user.getUsername(), user.getPassword()) != null
        if(newUser != null && bCryptPasswordEncoder.matches(user.getPassword(), newUser.getPassword())){
            UserDetails userDetails = loadUserByUsername(newUser.getUsername());
            return jwtUtil.generateToken(userDetails);
        }
        return null;
    }

    /**
     *
     * @param userId
     * @return delete user by id#
     */
    @Override
    public HttpStatus deleteById(Long userId){
        userRepository.deleteById(userId);
        return HttpStatus.OK;
    }

}

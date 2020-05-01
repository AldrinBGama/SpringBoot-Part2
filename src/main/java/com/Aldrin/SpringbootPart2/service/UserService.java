package com.Aldrin.SpringbootPart2.service;

import com.Aldrin.SpringbootPart2.model.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Cacheable("Users")
    public User getUser(long id){
        try
        {
            System.out.println("Going to sleep for 4 Secs.. to simulate backend call.");
            Thread.sleep(1000*4);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return new User(1,"Aldrin" ,"Gama");
    }
}

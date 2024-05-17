package com.abhi.mybatis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.mybatis.model.AppUser;
import com.abhi.mybatis.repository.AppUserRepository;

@RestController
@RequestMapping("/my-batis")
public class AppUserController {
    @Autowired
    private AppUserRepository appUserRepository;

    // get all AppUsers
    @GetMapping("/AppUsers")
    public List<AppUser> getAllAppUsers()
    {
        return appUserRepository.findAllUsers();
    }

    // create AppUser rest API
    @PostMapping("/AppUsers")
    public Map<String, Boolean> createAppUser(@RequestBody AppUser appAppUser)  {

        Map<String, Boolean> response = new HashMap<>();

        Boolean bool = appUserRepository.insertUser(appAppUser) > 0 ?
                response.put("created", Boolean.TRUE) :
                response.put("created", Boolean.FALSE);

        return response;

    }

    // get AppUser by id rest api
    @GetMapping("/AppUsers/{id}")
    public AppUser findAppUserById(@PathVariable Integer id) throws Exception {

        AppUser appAppUser = appUserRepository.findUserById(id).
                orElseThrow(() -> new Exception
                ("AppUser not exist with id :" + id));
        return appAppUser;
    }

   // update AppUser rest api
   @PutMapping("/AppUsers/{id}")
   public Map<String, Boolean> updateAppUser(@PathVariable Integer id,
                                          @RequestBody AppUser AppUserDetails) throws Exception {

      AppUser appUser = appUserRepository.findUserById(id)
              .orElseThrow(() -> new Exception
               ("AppUser not exist with id :" + id));
       AppUserDetails.setId(id);
       Map<String, Boolean> response = new HashMap<>();

       Boolean bool = appUserRepository.updateUser(AppUserDetails) > 0 ?
               response.put("updated", Boolean.TRUE) :
               response.put("updated", Boolean.FALSE);

      return response;
    }

    // delete AppUser rest api
    @DeleteMapping("/AppUsers/{id}")
    public Map<String, Boolean> deleteAppUser
               (@PathVariable Integer id) throws Exception {

//        Optional<AppUser> appUser = appUserRepository.findUserById(id)
//                .orElseThrow(() -> new Exception
//                        ("AppUser not exist with id :" + id));

        Map<String, Boolean> response = new HashMap<>();

        Boolean bool = appUserRepository.deleteUserById(id) > 0 ?
                response.put("deleted", Boolean.TRUE) :
                response.put("deleted", Boolean.FALSE);
        return response;
    }
}

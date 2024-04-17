package ru.kata.spring.boot_security.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import ru.kata.spring.boot_security.demo.entities.User;
import ru.kata.spring.boot_security.demo.services.UserService;

@Component
public class PersonValidator {}

//public class PersonValidator implements Validator {
//    private final UserService userService;
//
//    @Autowired
//    public PersonValidator(UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return User.class.equals(clazz);
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        User user = (User) target;
//
//        try {
//            userService.loadUserByUsername(user.getUsername());
//        } catch (UsernameNotFoundException e) {
//            System.out.println("Пользователь с таким именем не найден");
//            return;
//        }
//
//        errors.rejectValue(
//                "username",
//                "",
//                "Человек с таким именем пользователя уже существует"
//        );
//    }
//}
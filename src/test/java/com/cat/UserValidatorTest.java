package com.cat;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserValidatorTest {
    @Test
    public void checkUserEmail() {
        User user = new User("trololo_20@gmail.com", "123___?/aaa");
        assertFalse(UserValidator.checkUserEmail(null));
        assertFalse(UserValidator.checkUserEmail("ttyui"));
        assertTrue(UserValidator.checkUserEmail(user.getEmail()));
    }

    @Test
    public void checkUserPassword() {
        User user = new User("trololo_20@gmail.com", "123___?/aaa");
        assertFalse(UserValidator.checkUserPassword(null));
        assertFalse(UserValidator.checkUserPassword("123"));
        assertFalse(UserValidator.checkUserPassword("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));
        assertTrue(UserValidator.checkUserPassword(user.getPassword()));
    }
}
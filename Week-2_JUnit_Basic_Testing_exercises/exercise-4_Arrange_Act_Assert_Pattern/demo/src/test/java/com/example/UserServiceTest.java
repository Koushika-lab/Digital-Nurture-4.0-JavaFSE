package com.example;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserServiceTest {

    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserService();
        userService.addUser("Alice");
    }

    @After
    public void tearDown() {
        userService.clearUsers();
    }

    @Test
    public void testAddUser() {
        userService.addUser("Bob");
        assertEquals(2, userService.getUserCount());
    }

    @Test
    public void testUserExists() {
        assertTrue(userService.userExists("Alice"));
        assertFalse(userService.userExists("Charlie"));
    }
}

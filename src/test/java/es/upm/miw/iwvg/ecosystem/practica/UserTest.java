package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        user = new User(18, "Fernando", "García");
    }

    @Test
    void testInfoUser() {
        assertEquals(18, user.getNumber());
        assertEquals("Fernando", user.getName());
        assertEquals("García", user.getFamilyName());
    }

    @Test
    void testFormatUser() {
        user = new User(18, "feRnando", "garcíA");
        assertEquals("Fernando", user.getName());
        assertEquals("García", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("Fernando" + " " + "García", user.fullName());
    }

    @Test
    void testInitals() {
        assertEquals("F.", user.initials());

    }
}

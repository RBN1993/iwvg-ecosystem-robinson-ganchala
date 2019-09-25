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
        assertEquals(18, user.getAge());
        assertEquals("FERNANDO", user.getName());
        assertEquals("GARCÍA", user.getFamilyName());
    }

    @Test
    void testFormatUser() {
        user = new User(18, "feRnando", "garcíA");
        assertEquals("FERNANDO", user.getName());
        assertEquals("GARCÍA", user.getFamilyName());
    }

    @Test
    void testFullName() {
        assertEquals("FERNANDO" + " " + "GARCÍA", user.fullName());
    }

    @Test
    void testFormalFullName() {
        assertEquals("GARCÍA" + ", " + "FERNANDO", user.formalFullName());
    }


    @Test
    void testInitals() {
        assertEquals("F.", user.initials());
    }
}

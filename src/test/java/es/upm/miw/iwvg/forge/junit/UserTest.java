package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {
    private User user;
    @BeforeEach
    void before(){
        user = new User(1,"Rosario","Orbezo");
    }

    @Test
    void testInitials(){
        assertEquals("R.",this.user.initials());
    }
    @Test
    void testName(){
        assertEquals("Rosario",this.user.getName());
    }
    @Test
    void testFamilyName(){
        assertEquals("Orbezo",this.user.getFamilyName());
        assertNotEquals("Pastrana",this.user.getFamilyName());
    }
    @Test
    void testFullName(){
        assertEquals("Rosario Orbezo",this.user.fullName());
        assertNotEquals("Rosarioorbezo",this.user.fullName());
    }
    @Test
    void testNumber(){
        assertEquals(1,this.user.getNumber());
        assertNotEquals(2,this.user.getNumber());
    }


}

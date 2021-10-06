package kata;

import org.junit.jupiter.api.Test;
import kata.problemdomain.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EventTest {
    @Test
    void testSomeKataMethod() {
        
        Event e = new Event("content", "user1");
        assertEquals("content", e.content);
        System.out.println("Ok");
    }
}

package one.digitalinnovation.teste;

import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {
    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] atual = "test".getBytes();
        assertArrayEquals(esperado,atual);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("text", "test");
    }

    @Test
    public void testAssertFalse(){
        assertFalse(true);
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(null);
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame(new Object(), new Object());
    }

    @Test
    public void testAssertNull(){
        assertNull(null);
    }

    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(768);
        assertSame(aNumber, aNumber);
    }
}

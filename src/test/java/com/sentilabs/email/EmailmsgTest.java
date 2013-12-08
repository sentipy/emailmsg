package com.sentilabs.email;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import static com.sentilabs.email.Emailmsg.*;

public class EmailmsgTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testSimple() throws Exception {
        EmailMsg.Builder builder = EmailMsg.newBuilder();
        builder.setFrom("test@test.com").setTo("test2@test2.com").setSubject("Test3").setText("<h1>H1</h1>");
        EmailMsg emailmsg = builder.build();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(emailmsg.toByteArray());
        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());

        EmailMsg check = EmailMsg.parseFrom(in);
        assertEquals("test@test.com", check.getFrom());
        assertEquals("test2@test2.com", check.getTo());
        assertEquals("Test3", check.getSubject());
        assertEquals("<h1>H1</h1>", check.getText());
        assertFalse("test3@test3.com".equals(check.getTo()));
    }
}

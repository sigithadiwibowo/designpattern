package com.sigit.pattern.behavioral.observer;


import com.sigit.pattern.behavioral.observer.java.util.observer.ChatNotification;
import com.sigit.pattern.behavioral.observer.java.util.observer.NotificationServer;
import com.sigit.pattern.behavioral.observer.java.util.observer.SMSNotification;
import org.testng.annotations.Test;

public class NotificationServerTest {

    @Test
    public void testBlastNotification() throws Exception {
        NotificationServer server = new NotificationServer(new ChatNotification() , new SMSNotification());
        server.notifyObservers("Welcome , you are the best ");
    }
}

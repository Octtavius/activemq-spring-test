package tut.wh;

import org.apache.activemq.command.ActiveMQObjectMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

@Component
public class MyListener {
    @JmsListener(destination = "${springjms.myQueue}")
    public void receive(ActiveMQObjectMessage message) throws JMSException {

        Book m = (Book) message.getObject();
        System.out.println("book received ---> " + m);
    }
}

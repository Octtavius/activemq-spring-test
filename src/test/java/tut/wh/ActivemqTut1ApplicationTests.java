package tut.wh;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActivemqTut1ApplicationTests {

	@Autowired
	MessageSender messageSender;

	@Test
	void testSendAndReceive() {
		MyMessage mess1 = new MyMessage("Message 1", "Somemessage");
		messageSender.send(mess1);
	}

}

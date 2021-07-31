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
		Book book = new Book("My Book", "Octavian Morcov");
		messageSender.send(book);
	}

}

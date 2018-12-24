package com.ajwensome.mq;

import com.ajwensome.mq.direct.DirectSender;
import com.ajwensome.mq.fanout.FanoutSender;
import com.ajwensome.mq.hello.HelloSender;
import com.ajwensome.mq.object.ObjectSender;
import com.ajwensome.mq.object.User;
import com.ajwensome.mq.topic.TopicSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MqApplicationTests {
	@Autowired
	HelloSender helloSender;
	@Autowired
	HelloSender helloSender2;
	@Autowired
	ObjectSender objectSender;
	@Autowired
	TopicSender topicSender;
	@Autowired
	FanoutSender fanoutSender;
	@Autowired
	DirectSender directSender;

	@Test
	public void contextLoads() {
//		helloSender.send();
		User user1 = new User("lisi","123");
		objectSender.sendUser(user1);
	}
	@Test
	public void manyReceiver(){
		for (int i=0;i<100;i++){
			helloSender.send2(i);
		}
	}
	@Test
	public void many2many(){
		for (int i=0;i<100;i++){
			helloSender.send2(i);
			helloSender2.send2(i);
		}
	}
	@Test
	public void TestTopic(){
//		topicSender.send1();
		topicSender.send2();
	}
	@Test
	public void TestFanout(){
		fanoutSender.send();
	}
	@Test
	public void TestDirect(){
		directSender.send();
	}

}


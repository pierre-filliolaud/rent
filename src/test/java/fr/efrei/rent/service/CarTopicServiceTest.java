package fr.efrei.rent.service;

import javax.jms.JMSException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CarTopicServiceTest {
	private CarTopicService topicService;
	
	@Before
	public void before() {
		topicService = new CarTopicServiceImpl(new TopicSessionStub(), new TopicPublisherStub());
	}
	
	@Test
	public void testSendMessage() {
		try {
			topicService.publishMessage("test");
		} catch (JMSException e) {
			Assert.fail("sendMessage not implemented");;
		}
	}

}

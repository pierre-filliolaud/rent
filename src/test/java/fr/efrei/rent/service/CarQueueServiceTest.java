package fr.efrei.rent.service;

import javax.jms.JMSException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class CarQueueServiceTest {
	private CarQueueService queueService;
	
	@Before
	public void before() {
		queueService = new CarQueueServiceImpl(new QueueSessionStub(), new QueueSenderStub());
	}
	
	@Test
	public void testSendMessage() {
		try {
			queueService.sendMessage("test");
		} catch (JMSException e) {
			Assert.fail("sendMessage not implemented");;
		}
	}

}

package fr.efrei.rent.service;

import javax.jms.JMSException;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;

import org.springframework.stereotype.Component;

@Component
public class CarTopicServiceImpl implements CarTopicService {
	private TopicConnectionFactory connectionFactory;
	private Topic topic;
	private TopicSession session;
	private TopicPublisher topicPublisher;
	
	public CarTopicServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	public CarTopicServiceImpl(TopicConnectionFactory connectionFactory, Topic topic) throws Exception{
		super();
		this.connectionFactory = connectionFactory;
		this.topic = topic;
	}
	
	public CarTopicServiceImpl(TopicSession session, TopicPublisher topicPublisher) {
		super();
		this.session = session;
		this.topicPublisher = topicPublisher;
	}
	
	public void init() throws JMSException {
		TopicConnection connection = this.connectionFactory.createTopicConnection();
		connection.start();
		session = connection.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		topicPublisher = session.createPublisher(topic);
	}

	@Override
	public void publishMessage(String message) throws JMSException {
		TextMessage textMessage = session.createTextMessage();
		textMessage.setText(message);
		topicPublisher.send(textMessage);
	}
}

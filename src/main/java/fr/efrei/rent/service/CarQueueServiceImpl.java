package fr.efrei.rent.service;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component
public class CarQueueServiceImpl implements CarQueueService {

	private QueueConnectionFactory connectionFactory;
	private Queue queue;
	private QueueSession session;
	private QueueSender queueSender;
	
	public CarQueueServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public CarQueueServiceImpl(QueueConnectionFactory connectionFactory, Queue queue) throws Exception{
		super();
		this.connectionFactory = connectionFactory;
		this.queue = queue;
	}
	
	public CarQueueServiceImpl(QueueSession session, QueueSender queueSender) {
		super();
		this.session = session;
		this.queueSender = queueSender;
	}
	
	public void setSession(QueueSession session) {
		this.session = session;
	}
	
	public void setQueueSender(QueueSender queueSender) {
		this.queueSender = queueSender;
	}
	
	public void init() throws JMSException {
		QueueConnection connection = connectionFactory.createQueueConnection();
		connection.start();
		this.session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
		this.queueSender = session.createSender(queue);
	}

	@Override
	public void sendMessage(String message) throws JMSException {
		TextMessage textMessage =  session.createTextMessage();
		textMessage.setText(message);
		queueSender.send(textMessage);
	}
}

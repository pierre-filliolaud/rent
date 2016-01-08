package fr.efrei.rent.service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.QueueSender;

public class QueueSenderStub implements QueueSender {

	@Override
	public void setDisableMessageID(boolean value) throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getDisableMessageID() throws JMSException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDisableMessageTimestamp(boolean value) throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getDisableMessageTimestamp() throws JMSException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setDeliveryMode(int deliveryMode) throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDeliveryMode() throws JMSException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPriority(int defaultPriority) throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPriority() throws JMSException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setTimeToLive(long timeToLive) throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getTimeToLive() throws JMSException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Destination getDestination() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(Destination destination, Message message)
			throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(Destination destination, Message message,
			int deliveryMode, int priority, long timeToLive)
			throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Queue getQueue() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void send(Message message) throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(Message message, int deliveryMode, int priority,
			long timeToLive) throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(Queue queue, Message message) throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(Queue queue, Message message, int deliveryMode,
			int priority, long timeToLive) throws JMSException {
		// TODO Auto-generated method stub
		
	}

}

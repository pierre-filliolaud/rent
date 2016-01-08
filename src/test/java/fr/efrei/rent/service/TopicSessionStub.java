package fr.efrei.rent.service;

import java.io.Serializable;
import java.util.Enumeration;

import javax.jms.BytesMessage;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueBrowser;
import javax.jms.StreamMessage;
import javax.jms.TemporaryQueue;
import javax.jms.TemporaryTopic;
import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.jms.TopicSubscriber;

public class TopicSessionStub implements TopicSession {

	@Override
	public BytesMessage createBytesMessage() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MapMessage createMapMessage() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message createMessage() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjectMessage createObjectMessage() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjectMessage createObjectMessage(Serializable object)
			throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StreamMessage createStreamMessage() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TextMessage createTextMessage() throws JMSException {
		// TODO Auto-generated method stub
		return new TextMessage() {
			
			@Override
			public void setStringProperty(String name, String value)
					throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setShortProperty(String name, short value) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setObjectProperty(String name, Object value)
					throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLongProperty(String name, long value) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSType(String type) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSTimestamp(long timestamp) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSReplyTo(Destination replyTo) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSRedelivered(boolean redelivered) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSPriority(int priority) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSMessageID(String id) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSExpiration(long expiration) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSDestination(Destination destination) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSDeliveryMode(int deliveryMode) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSCorrelationIDAsBytes(byte[] correlationID)
					throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJMSCorrelationID(String correlationID) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setIntProperty(String name, int value) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFloatProperty(String name, float value) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDoubleProperty(String name, double value)
					throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setByteProperty(String name, byte value) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBooleanProperty(String name, boolean value)
					throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean propertyExists(String name) throws JMSException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getStringProperty(String name) throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public short getShortProperty(String name) throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Enumeration getPropertyNames() throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getObjectProperty(String name) throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getLongProperty(String name) throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getJMSType() throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getJMSTimestamp() throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Destination getJMSReplyTo() throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getJMSRedelivered() throws JMSException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getJMSPriority() throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getJMSMessageID() throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getJMSExpiration() throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Destination getJMSDestination() throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getJMSDeliveryMode() throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public byte[] getJMSCorrelationIDAsBytes() throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getJMSCorrelationID() throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getIntProperty(String name) throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public float getFloatProperty(String name) throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double getDoubleProperty(String name) throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public byte getByteProperty(String name) throws JMSException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getBooleanProperty(String name) throws JMSException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void clearProperties() throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clearBody() throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void acknowledge() throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setText(String string) throws JMSException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String getText() throws JMSException {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

	@Override
	public TextMessage createTextMessage(String text) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getTransacted() throws JMSException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getAcknowledgeMode() throws JMSException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void commit() throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rollback() throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recover() throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MessageListener getMessageListener() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMessageListener(MessageListener listener)
			throws JMSException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MessageProducer createProducer(Destination destination)
			throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageConsumer createConsumer(Destination destination)
			throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageConsumer createConsumer(Destination destination,
			String messageSelector) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MessageConsumer createConsumer(Destination destination,
			String messageSelector, boolean NoLocal) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Queue createQueue(String queueName) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueueBrowser createBrowser(Queue queue) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public QueueBrowser createBrowser(Queue queue, String messageSelector)
			throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TemporaryQueue createTemporaryQueue() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Topic createTopic(String topicName) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopicSubscriber createSubscriber(Topic topic) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopicSubscriber createSubscriber(Topic topic,
			String messageSelector, boolean noLocal) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopicSubscriber createDurableSubscriber(Topic topic, String name)
			throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopicSubscriber createDurableSubscriber(Topic topic, String name,
			String messageSelector, boolean noLocal) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopicPublisher createPublisher(Topic topic) throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TemporaryTopic createTemporaryTopic() throws JMSException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void unsubscribe(String name) throws JMSException {
		// TODO Auto-generated method stub
		
	}

}

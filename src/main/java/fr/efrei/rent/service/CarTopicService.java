package fr.efrei.rent.service;

import javax.jms.JMSException;

public interface CarTopicService {

	void publishMessage(String message) throws JMSException;

}

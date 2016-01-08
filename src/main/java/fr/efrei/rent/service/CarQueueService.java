package fr.efrei.rent.service;

import javax.jms.JMSException;


public interface CarQueueService {

	void sendMessage(String message) throws JMSException;

}

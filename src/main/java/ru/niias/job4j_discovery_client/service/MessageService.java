package ru.niias.job4j_discovery_client.service;

import org.springframework.stereotype.Service;
import ru.niias.job4j_discovery_client.model.Message;

import java.util.List;

@Service
public interface MessageService {
    boolean send(String serviceId, Message message);
    List<Message> getReceivedMessages();
    void saveReceivedMessage(Message message);
}

package ru.niias.job4j_discovery_client.repository;

import org.springframework.stereotype.Repository;
import ru.niias.job4j_discovery_client.model.Message;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryMessageRepository implements MessageRepository {

    private final List<Message> messages = new ArrayList<>();
    private int id = 1;

    @Override
    public Message save(Message message) {
        message.setId(id++);
        messages.add(message);
        return message;
    }

    @Override
    public List<Message> findAll() {
        return messages;
    }
}

package ru.niias.job4j_discovery_client.repository;

import org.springframework.stereotype.Repository;
import ru.niias.job4j_discovery_client.model.Message;

import java.util.List;

@Repository
public interface MessageRepository {
    Message save(Message message);
    List<Message> findAll();
}

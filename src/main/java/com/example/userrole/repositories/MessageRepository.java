package com.example.userrole.repositories;

import com.example.userrole.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ramesh Fadatare
 *
 */
public interface MessageRepository extends JpaRepository<Message, Integer>{

}

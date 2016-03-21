package com.manishchhabra.blog.daoJPA;

import com.manishchhabra.blog.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ilebedyuk
 */
//@Component("userRepository")
public interface UserRepository extends JpaRepository<Person, Integer> {
    Person findByName(String name);
}

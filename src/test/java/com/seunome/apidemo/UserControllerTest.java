package com.seunome.apidemo;

import com.seunome.apidemo.model.User;
import com.seunome.apidemo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserControllerTest {

    @Autowired
    private UserRepository repository;

    @Test
    void testCreateUser() {
        User user = new User(null, "João", "joao@email.com");
        User saved = repository.save(user);
        assertThat(saved.getId()).isNotNull();
    }
}

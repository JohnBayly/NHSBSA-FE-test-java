package repository;

import model.LoginForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<LoginForm, Long> {
    LoginForm findByUsername(String username);
}

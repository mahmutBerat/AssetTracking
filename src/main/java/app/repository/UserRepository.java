package app.repository;

import app.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Mahmut on 10/7/2017.
 */
@Transactional
public interface UserRepository extends CrudRepository<User, Long> {
}

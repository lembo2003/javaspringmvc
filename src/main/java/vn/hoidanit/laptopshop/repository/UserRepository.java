package vn.hoidanit.laptopshop.repository;

import org.springframework.stereotype.Repository;
import vn.hoidanit.laptopshop.domain.User;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User save(User hoidanit);
}

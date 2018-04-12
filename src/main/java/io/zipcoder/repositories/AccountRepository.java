package io.zipcoder.repositories;

import io.zipcoder.domain.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    Iterable<Account> findById(Long aLong);

    Iterable<Account> findAll();

}

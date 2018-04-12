package io.zipcoder.repositories;

import io.zipcoder.domain.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {

    Iterable<Account> findAll();

    void removeAccountById();

    void updateAccount(Account account);

    Account findOne();
}

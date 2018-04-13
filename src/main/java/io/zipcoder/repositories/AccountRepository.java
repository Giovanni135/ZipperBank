package io.zipcoder.repositories;

import io.zipcoder.domain.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {

    Iterable<Account> findById(long id);

    Iterable<Account> findAll();

    void removeAccountById(Long id);

    void updateAccount(Account account);

    void addAccountToDB(Account account);

}

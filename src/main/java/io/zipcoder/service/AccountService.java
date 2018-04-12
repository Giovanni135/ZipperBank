package io.zipcoder.service;

import io.zipcoder.domain.Account;
import java.net.URI;
import io.zipcoder.repositories.AccountRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.inject.Inject;
import javax.validation.Valid;


@Service
public class AccountService {

    @Inject
    private AccountRepository accountRepository;


    public ResponseEntity<Iterable<Account>> getAccounts() {
        Iterable<Account> allAccounts = accountRepository.findAll();
        return new ResponseEntity<>(allAccounts, HttpStatus.OK);
    }


    public ResponseEntity<?> getAccountById(@PathVariable long id) {
        Account a = accountRepository.findOne(id);
        return new ResponseEntity<>(a, HttpStatus.OK);


    public ResponseEntity<?> createAccount(@Valid @RequestBody Account account){
        account = accountRepository.save(account);
            HttpHeaders httpHeaders = new HttpHeaders();
            Uri newAccountUri = ServletUriComponentsBuilder
                    .fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(account.getId())
                    .toUri();
            httpHeaders.setLocation(newAccountUri);
            return new ResponseEntity<>(httpHeaders, HttpStatus.OK);
    }

    public void updateAccount(Account account){

        this.accountRepository.updateAccount(account);
    }


    public ResponseEntity<?> deleteAccount(@PathVariable long id){
        accountRepository.removeAccountById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    }
}

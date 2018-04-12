package io.zipcoder.service;

import io.zipcoder.domain.Account;

import io.zipcoder.repositories.AccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import javax.inject.Inject;



@Service
public class AccountService {

    @Inject
    private AccountRepository accountRepository;


    public ResponseEntity<Iterable<Account>> getAccounts() {
        Iterable<Account> allAccounts = accountRepository.findAll();
        return new ResponseEntity<>(allAccounts, HttpStatus.OK);
    }


    public ResponseEntity<?> getAccountById() {
        Account a = accountRepository.findOne();
        return new ResponseEntity<>(a, HttpStatus.OK);
    }

    public ResponseEntity<?> createAccount() {
        account = accountRepository.save(account);
        return new ResponseEntity<>(account, HttpStatus.CREATED);
    }

    public ResponseEntity<?> updateAccount(Account account){
        accountRepository.updateAccount(account);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    public ResponseEntity<?> deleteAccount(){
        accountRepository.removeAccountById();
        return new ResponseEntity<>(HttpStatus.OK);
        }

    }


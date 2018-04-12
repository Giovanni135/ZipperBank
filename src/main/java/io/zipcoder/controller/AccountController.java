package io.zipcoder.controller;

import io.zipcoder.domain.Account;
import io.zipcoder.service.AccountService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@RestController
public class AccountController {

    @Inject
    private AccountService accountService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllAccounts(){
        return accountService.getAccounts();
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getAccountById(@PathVariable("id") long id){
        return accountService.getAccountById(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> updateAccountById(@RequestBody Account account){
        return accountService.updateAccount(account);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteAccountById(@PathVariable("id") long id){
        return accountService.deleteAccount(id);
    }
}

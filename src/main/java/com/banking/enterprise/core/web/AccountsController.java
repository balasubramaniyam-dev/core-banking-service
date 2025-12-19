package com.banking.enterprise.core.web;

import com.corebanking.api.AccountsApi;
import com.corebanking.model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

@RestController
public class AccountsController implements AccountsApi {

    @Override
    public Mono<ResponseEntity<Account>> getAccount(String accountId, ServerWebExchange exchange) {
        Account account = new Account().id("WPC-5835489").balance(new BigDecimal(57985));
        return Mono.just(ResponseEntity.ok(account));
    }
}

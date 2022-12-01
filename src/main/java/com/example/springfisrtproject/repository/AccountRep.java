package com.example.springfisrtproject.repository;

import com.example.springfisrtproject.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.Optional;

public interface AccountRep extends JpaRepository<Account, Long> {

    Optional<Account> findByLogin(String login);
    @Transactional
    @Modifying
    @Query("update Account a set a.attempts = ?1 where a.id = ?2")
    int updateAttemptsById(Integer attempts, Long id);

    @Transactional
    @Modifying
    @Query("update Account a set a.timestamp = ?1 where a.id = ?2")
    int updateTimestampById(Timestamp timestamp, @NonNull Long id);


}

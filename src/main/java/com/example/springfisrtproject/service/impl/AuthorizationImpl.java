package com.example.springfisrtproject.service.impl;

import com.example.springfisrtproject.model.Account;
import com.example.springfisrtproject.repository.AccountRep;
import com.example.springfisrtproject.service.Authorization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class AuthorizationImpl implements Authorization {
    @Autowired
    private AccountRep rep;
    @Override
    public String signIn(String login, String password) {
        int countAttempts=3;
        Long limitTimeMinute=1L;

        Account account=rep.findByLogin(login).orElse(null);
        if(account==null)
            return "Такого пользевателя нету в базе";


        Long thisTime=System.currentTimeMillis();
        Long accountTime=account.getTimestamp().getTime();

        if(password.equals(account.getPassword()))
            return "Вы вошли систему!!!";
        if(accountTime>thisTime){
            Long ss=((accountTime-thisTime)/1000)%60;
            Long mm=(((accountTime-thisTime)/1000)/60)%60;
            Long hh=((((accountTime-thisTime)/1000)/60)/60)%24;
            rep.updateAttemptsById(0,account.getId());
            return String.format("Повторите попытку через %d:%d:%d",hh,mm,ss);
        }
        if (countAttempts>=account.getAttempts()) {
            rep.updateAttemptsById(account.getAttempts() + 1, account.getId());
            return String.format("Не правильный пороль\n У вас %d попыток ввести поролль", countAttempts - account.getAttempts());
        }
        else {
            rep.updateTimestampById(new Timestamp(limitTimeMinute*1000*60+thisTime),account.getId());
            return String.format("У вас нету попыток, повторите попытку через %d минут",limitTimeMinute);
        }


    }
}

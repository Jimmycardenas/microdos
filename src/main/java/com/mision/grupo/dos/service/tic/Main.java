package com.mision.grupo.dos.service.tic;
import org.springframework.data.annotation.Id;
import java.util.Date;
public class Main {
    @Id
    private String username;
    private Integer balance;
    private Date lastChange;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Date getLastChange() {
        return lastChange;
    }

    public void setLastChange(Date lastChange) {
        this.lastChange = lastChange;

    }
}

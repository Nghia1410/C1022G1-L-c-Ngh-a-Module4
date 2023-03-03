package com.repository;

import com.model.Mail;

import java.util.List;

public interface IMailRepository {
    List<Mail> findAll();
    void  update(Mail mail);
    Mail findById(int id);
}

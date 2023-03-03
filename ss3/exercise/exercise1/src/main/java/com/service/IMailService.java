package com.service;

import com.model.Mail;

import java.util.List;

public interface IMailService {
    List<Mail> findAll();
    void  update(Mail mail);
    Mail findById(int id);
}

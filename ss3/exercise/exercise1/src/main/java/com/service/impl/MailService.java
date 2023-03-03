package com.service.impl;

import com.model.Mail;
import com.repository.IMailRepository;
import com.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MailService implements IMailService {
    @Autowired
    private IMailRepository mailRepository;

    @Override
    public List<Mail> findAll() {
        return this.mailRepository.findAll();
    }

    @Override
    public void update(Mail mail) {

    }

    @Override
    public Mail findById(int id) {
        return null;
    }
}

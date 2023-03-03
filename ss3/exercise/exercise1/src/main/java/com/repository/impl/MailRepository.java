package com.repository.impl;

import com.model.Mail;
import com.repository.IMailRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository implements IMailRepository {

    @Override
    public List<Mail> findAll() {
        List<Mail> mailList = new ArrayList<>();
        mailList.add(new Mail("Mail1","English",5,true,"nghia"));
        mailList.add(new Mail("Mail1","Vietnamese",5,true,"nghia"));
        mailList.add(new Mail("Mail1","Japanese",5,true,"nghia"));
        mailList.add(new Mail("Mail1","Chinese",5,true,"nghia"));
        return null;
    }

    @Override
    public void update(Mail mail) {

    }

    @Override
    public Mail findById(int id) {
        return null;
    }
}

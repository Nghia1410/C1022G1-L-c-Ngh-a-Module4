package com.repository.impl;

import com.model.Mail;
import com.repository.IMailRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepository implements IMailRepository {
    List<Mail> mailList = new ArrayList<>();

    @Override
    public List<Mail> findAll() {
        List<Mail> mailList = new ArrayList<>();
        mailList.add(new Mail(1, "Nghia", "English", 12, true, "nghia"));
        mailList.add(new Mail(2, "Tai", "Vietnamese", 23, true, "tai"));
        mailList.add(new Mail(3, "Dinh", "Japanese", 2, true, "dinh"));
        mailList.add(new Mail(4, "Huy", "Chinese", 4, true, "huy"));
        return null;
    }

    @Override
    public void update(Mail mail) {
        for (int i = 0; i < mailList.size(); i++) {
            if (mailList.get(i).getId() == mail.getId()) {
                mailList.set(i, mail);
            }
        }
    }

    @Override
    public Mail findById(int id) {
        for (int i = 0; i < mailList.size(); i++) {
            if (mailList.get(i).getId() == id) {
                return mailList.get(i);
            }
        }
        return null;
    }

    @Override
    public void confirm(Mail mail) {
        mail.setId(mailList.size() + 1);
        mailList.add(mail);
    }
}

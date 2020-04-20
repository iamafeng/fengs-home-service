package com.afeng.backend.service;

import com.afeng.model.common.Page;
import com.afeng.model.mail.Mail;

import java.util.Map;

public interface MailService {

    void saveMail(Mail mail);

    void updateMail(Mail mail);

    void sendMail(Mail mail);

    Mail findById(Long id);

    Page<Mail> findMails(Map<String, Object> params);
}

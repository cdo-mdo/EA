package org.edu.miu.cs.cs544.labw3d6.assignment_1.controller;

import org.edu.miu.cs.cs544.labw3d6.assignment_1.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.ResourceBundle;

@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private ResourceBundleMessageSource messageSource;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/greeting")
    public String welcomeMessage(@RequestHeader (name = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("message.welcome", null, locale);
    }

    @GetMapping("/message/{message}")
    public String getMessage(@PathVariable String message) {
        messageService.processMessage(message);
        return messageSource.getMessage("message.welcome", null, Locale.FRANCE);
//        return message;
    }
}

package iodigital.io_travelcoach.controller;


import iodigital.io_travelcoach.service.notifications.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService emailService;

    @PostMapping("/send")
    public String sendNotification(
            @RequestParam String recipient,
            @RequestParam String subject,
            @RequestParam String message) {
        emailService.sendEmail(recipient, subject, message);
        return "Notification sent successfully!";
    }

}

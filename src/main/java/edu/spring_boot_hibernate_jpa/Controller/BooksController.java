package edu.spring_boot_hibernate_jpa.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class BooksController {

    Logger logger = LoggerFactory.getLogger(BooksController.class);

    @GetMapping("/books")
    public String getAllBooks() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
        return "This is test message";
    }

}

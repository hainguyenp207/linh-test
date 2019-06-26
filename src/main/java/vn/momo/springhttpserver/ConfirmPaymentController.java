package vn.momo.springhttpserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConfirmPaymentController {
    final Logger LOGGER = LoggerFactory.getLogger(ConfirmPaymentController.class);

    @PostMapping(params = "/api/confirm")
    public ResponseEntity<String> hello(String data) {
        LOGGER.info("Some one send to here {}", data);
        return ResponseEntity.ok(data);
    }
}

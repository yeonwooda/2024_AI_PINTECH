package org.koreait.global.order.controllers;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.koreait.member.controllers.RequestOrder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/list")
    public String list(@ModelAttribute @Valid RequestOrder form, Error errors) {
        log.info(form.toString());
        return "order/list";
    }

}

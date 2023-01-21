package corchan.controllers;

import corchan.DAO.ThreadDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ThreadController {
    private final ThreadDAO threadDAO;

    @Autowired
    public ThreadController(ThreadDAO threadDAO){
        this.threadDAO =threadDAO;
    }

    @GetMapping("")
    public String start() {
        return "start";
    }

    @GetMapping()
    public String b(Model model) {
        model.addAttribute("threads", threadDAO.showThreads());
        return "b";
    }

    @GetMapping("/newthread")
    public String newthread() {
        return "newthread";
    }

}

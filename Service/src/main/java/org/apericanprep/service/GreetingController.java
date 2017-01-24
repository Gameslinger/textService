package org.apericanprep.service;

import org.apericanprep.apis.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @RequestMapping("/form")
    public String submitMessage(Model model){
        model.addAttribute("message",new Message());
        return "form";
    }
    
    @PostMapping("/result")
    public String messageSubmit(@ModelAttribute Message msg){
        return "result";
        
    }
    
    @RequestMapping("/message")
    public String message(Model model){
        MocRecipientService rec = new MocRecipientService();
        model.addAttribute("recList",rec.findAll());
        return "messagePage";
    }
     
    @PostMapping("/messageSend")
    public String messageSend(@ModelAttribute Message msg){
        return "result";
        
    }
    
}
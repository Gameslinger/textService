package org.apericanprep.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstName {
@RequestMapping("/fn")
    public String firstName(Model model) {
        MocRecipientService rec = new MocRecipientService();
        model.addAttribute("recList",rec.findAll());
        return "firstNames";
    }
    
}
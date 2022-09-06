package com.asd.demo.vip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class VipUserController {
    @Autowired private VipUserService service;

    @GetMapping("/vipMain")
    public String showVipUserList(Model model){
        List<VipUser> listVipUsers = service.listAll();
        model.addAttribute("listVipUsers", listVipUsers);
        return "vipMain";
    }

    // 添加新user
    @GetMapping("/vipUsers/new")
    public String showNewForm(Model model){
        model.addAttribute("vipUser", new VipUser());
        return "vipUser_form";
    }

    @PostMapping("/vipUsers/save")
    public String saveString(VipUser vipUser){
        service.save(vipUser);
        return "redirect:/vipMain";
    }
}

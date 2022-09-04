package com.asd.demo.vip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipUserService {
    @Autowired private VipUserRepository repo;
    public List<VipUser> listAll(){
        return (List<VipUser>) repo.findAll();
    }

    public void save(VipUser vipUser) {
        repo.save(vipUser);
    }
}

package com.asd.demo;

import com.asd.demo.vip.VipUser;
import com.asd.demo.vip.VipUserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;
/*
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
*/

public class UserRepositoryTests {
    /*
    @Autowired private VipUserRepository repo;

    @Test
    public void testAddNew(){
        VipUser vipUser = new VipUser();
        vipUser.setEmail("Brown2@.com");
        vipUser.setVipName("VIP004");

        VipUser savevipUser =  repo.save(vipUser);
        Assertions.assertThat(savevipUser).isNotNull();
        Assertions.assertThat(savevipUser.getVipID()).isGreaterThan(0);

    }
    @Test
    public void testListAll(){
        Iterable<VipUser> vipUsers = repo.findAll();
        Assertions.assertThat(vipUsers).hasSizeGreaterThan(0);

        for (VipUser vipUser : vipUsers) {
            System.out.println(vipUser);
        }

    }

    @Test
    public void testUpdate(){
        Integer vipUserID=1;
        Optional<VipUser> OptionaVipUser = repo.findById(vipUserID);
        VipUser vipUser = OptionaVipUser.get();
        vipUser.setVipName("Act2001");
        repo.save(vipUser);

        VipUser updateVipUser = repo.findById(vipUserID).get();
        Assertions.assertThat(updateVipUser.getVipName()).isEqualTo("Act200");
    }

    @Test
    public void testGet(){
        Integer vipUserID=2;
        Optional<VipUser> OptionaVipUser = repo.findById(vipUserID);
        Assertions.assertThat(OptionaVipUser).isPresent();
        System.out.println(OptionaVipUser.get());

    }
    @Test
    public void testDelete(){
        Integer vipUserID=3;
        repo.deleteById(3);
        Optional<VipUser> OptionaVipUser = repo.findById(vipUserID);
        Assertions.assertThat(OptionaVipUser).isNotPresent(); // isPresent 是否存在

    }
    */

}

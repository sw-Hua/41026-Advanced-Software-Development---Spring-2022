/*
AUTHOR:xuhao_guo
 */
package com.asd.backened.controller;

import com.asd.backened.common.R;
import com.asd.backened.entity.Employee;
import com.asd.backened.service.EmployeeService;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@Component
@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * employeeLogin
     * @param request
     * @param employee
     * @return
     */
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee){

        //1、The password submitted by the page is encrypted by md 5
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        //2、Query the database according to the username username submitted on the page
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Employee::getUsername,employee.getUsername());
        Employee emp = employeeService.getOne(queryWrapper);

        //3、If no query is found, the login failure result will be returned.
        if(emp == null){
            return R.error("loginFailed");
        }

        //4、Password comparison, if inconsistent, return the login failure result
        if(!emp.getPassword().equals(password)){
            return R.error("loginFailed");
        }

        //5、Check the employee status, if it is disabled, return the employee disabled result
        if(emp.getStatus() == 0){
            return R.error("accountIsDisabled");
        }

        //6、If the login is successful, the employee id will be stored in the session and the login success result will be returned.
        request.getSession().setAttribute("employee",emp.getId());
        return R.success(emp);
    }

    /**
     * employeeQuits
     * @param request
     * @return
     */
    @PostMapping("/logout")
    public R<String> logout(HttpServletRequest request){
        //Clear the id of the currently logged in employee saved in the Session
        request.getSession().removeAttribute("employee");
        return R.success("exitSuccessfully");
    }
}

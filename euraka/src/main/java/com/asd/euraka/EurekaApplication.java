/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: EurekaApplication
 * Author:   benjamen
 * Date:     2022/8/29 14:15
 * Description: euraka
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.asd.euraka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈euraka〉
 *
 * @author benjamen
 * @create 2022/8/29
 * @since 1.0.0
 */
@SpringBootApplication
@EnableEurekaServer // 声明当前的工程是eureka的注册中心
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
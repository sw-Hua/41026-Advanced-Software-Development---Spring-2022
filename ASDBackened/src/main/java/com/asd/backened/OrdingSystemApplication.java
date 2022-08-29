/**
 * Copyright (C), 2015-2022, XXX有限公司
 * FileName: OrdingSystemApplication
 * Author:   benjamen
 * Date:     2022/8/29 14:25
 * Description: backened function
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.asd.backened;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈backened function〉
 *
 * @author benjamen
 * @create 2022/8/29
 * @since 1.0.0
 */
@EnableEurekaClient
@SpringBootApplication
public class OrdingSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrdingSystemApplication.class, args);
    }
}

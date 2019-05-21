package cn.bdqn.hotevnt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author SayBoy_D
 */
@SpringBootApplication
@MapperScan("cn.bdqn.hotevnt.mapper")
public class HotevntApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotevntApplication.class, args);
    }

}

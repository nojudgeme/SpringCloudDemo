package com.springcloud.eureka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

}

class Algorithm{
    /**
     * String pattern = "^[0-9]|[a-z]|[A-Z]";
     * Pattern compile = Pattern.compile(pattern);
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();
        for (int i = 0; i < length/2; i++) {
            char aChar = chars[i];
            char aChar1 = chars[length - 1 - i];
            if(aChar!=aChar1){
                return false;
            }

        }
        return false;
    }
}

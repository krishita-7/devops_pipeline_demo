package de.vorb.wildfly_springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.*; 
@RestController
public class SampleResource {

    @RequestMapping("/")
    


// Driver code 
    public static void main(String arg[]) {

// Change here to change output

        int n = 5;

        for (int i = 1; i <= 10; ++i) 
            System.out.println(n + "*"+ i +"="+ n * i);

    }

}


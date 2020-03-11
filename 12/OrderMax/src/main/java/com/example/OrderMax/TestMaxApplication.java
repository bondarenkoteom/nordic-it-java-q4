package com.example.OrderMax;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestMaxApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TestMaxApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }

    public Integer countMaxOrder(Integer array[]) {
        var max = 0;
        var sum = 0;
        var element = 1;
        if (array == null) {
            max = 0;
        } else {

            for (var i = 0; i < array.length; i++) {
                if (array[i] == element) {
                    sum++;
                } else {
                    if (sum > max) {
                        max = sum;
                    }
                    sum = 0;
                }
                if (i == array.length - 1 && sum > max) {
                    max = sum;
                }

            }
        }
        return max;

    }

}

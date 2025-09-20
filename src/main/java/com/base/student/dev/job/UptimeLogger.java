package com.base.student.dev.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Component
public class UptimeLogger {
    private final Instant startTime = Instant.now();

    // Cronjob chạy mỗi 4 giây
    // Cronjob chạy mỗi 4 giây
    @Scheduled(cron = "*/4 * * * * *")
    public void logUptime() {
        Duration uptime = Duration.between(startTime, Instant.now());
        long seconds = uptime.getSeconds();
        long minutes = uptime.toMinutes();

        // Màu ANSI
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";

        System.out.printf("--------- Hòa Mõm ĂN LỒN Chó ----------");

        // Nếu dưới 15 phút thì log xanh, >= 15 phút thì log đỏ
        String color = (minutes >= 10) ? RED : GREEN;

        System.out.printf("%sỨng dụng đã chạy được: %d phút %d giây%s%n",
                color, minutes, seconds % 60, RESET);
    }
}

package com.ruifucredit.cloud.watcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class WatcherStarter {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(WatcherStarter.class, args);
	}

}

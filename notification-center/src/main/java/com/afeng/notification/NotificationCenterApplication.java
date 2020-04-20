package com.afeng.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 通知中心
 * 
 * @author
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NotificationCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationCenterApplication.class, args);
	}

}
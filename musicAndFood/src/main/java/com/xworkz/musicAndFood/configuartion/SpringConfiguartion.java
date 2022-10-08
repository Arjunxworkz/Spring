package com.xworkz.musicAndFood.configuartion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.xworkz")
public class SpringConfiguartion {
	public SpringConfiguartion() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
}

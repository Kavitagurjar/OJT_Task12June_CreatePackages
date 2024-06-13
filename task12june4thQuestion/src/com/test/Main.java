package com.test;
import com.electronics.*;

public class Main {
	public static void main(String args[]) {
		SmartPhone s1 = new SmartPhone();
		s1.connectToWiFi();
		s1.powerOn();
	}

}

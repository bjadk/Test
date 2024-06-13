package com.sun;

public class SmartDeviceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartLight smartLight = new SmartLight();
		smartLight.deviceName = "スマートライト";
		SmartThermostat smartThermostat = new SmartThermostat();
		smartThermostat.deviceName = "スマートサーモスタット";
		smartLight.display();
		smartLight.trunOn();
		smartThermostat.display();
		smartThermostat.trunOff();
	}

}

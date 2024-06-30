package com.sun;

public class PatientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatientManager manager = new PatientManager();
        manager.addPatient("田中太郎", "2023/07/15");
        manager.addPatient("佐藤花子", "2023/07/14");
        manager.searchPatient("田中太郎");
        manager.sortPatientsByDate();
        manager.printPatients();
  
        
        

	}

}

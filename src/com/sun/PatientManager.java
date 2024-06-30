package com.sun;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PatientManager {
	private List<Patient> patients = new ArrayList<>();

	public void addPatient(String name, String appointmentDate) {
		patients.add(new Patient(name, appointmentDate));

	}

	public void searchPatient(String name) {
		for (Patient patient : patients) {
			if (patient.name.equals(name)) {
				System.out.println(patient);
				return;

			}
		}
		System.out.println(name + "の患者情報は見つかりませんでした。");
	}

	public void sortPatientsByDate() {
		patients.sort(Comparator.comparing(patient -> patient.appointmentDate));
	}

	public void printPatients() {
		for (Patient patient : patients) {
			System.out.println(patient);
		}

	}

}

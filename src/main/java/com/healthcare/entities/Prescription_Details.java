package com.healthcare.entities;

import javax.persistence.*;

@Entity
@Table(name = "prescription_details")
public class Prescription_Details {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
   // @Column(name = "patient_id")
    private Integer prescription_id;
   // @Column(name = "doctor_id")
    private String diet;
    private String dietIntakeTime;
    private String exercise;
    private String exerciseTimings;
    private String medicine;
    private String medicineTakenTime;
    
    
    public Prescription_Details() {
    }



    public Prescription_Details(Integer id, Integer prescription_id, String diet, String dietIntakeTime,
			String exercise, String exerciseTimings, String medicine, String medicineTakenTime) {
		
		this.id = id;
		this.prescription_id = prescription_id;
		this.diet = diet;
		this.dietIntakeTime = dietIntakeTime;
		this.exercise = exercise;
		this.exerciseTimings = exerciseTimings;
		this.medicine = medicine;
		this.medicineTakenTime = medicineTakenTime;
	}



	public Integer getPrescription_id() {
		return prescription_id;
	}

	public void setPrescription_id(Integer prescription_id) {
		this.prescription_id = prescription_id;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getDietIntakeTime() {
		return dietIntakeTime;
	}

	public void setDietIntakeTime(String dietIntakeTime) {
		this.dietIntakeTime = dietIntakeTime;
	}

	public String getExercise() {
		return exercise;
	}

	public void setExercise(String exercise) {
		this.exercise = exercise;
	}

	public String getExerciseTimings() {
		return exerciseTimings;
	}

	public void setExerciseTimings(String exerciseTimings) {
		this.exerciseTimings = exerciseTimings;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getMedicineTakenTime() {
		return medicineTakenTime;
	}

	public void setMedicineTakenTime(String medicineTakenTime) {
		this.medicineTakenTime = medicineTakenTime;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

   

    
}

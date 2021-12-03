package com.healthcare.entities;
import java.time.LocalTime;

import javax.persistence.*;

@Entity
@Table(name = "prescription_details")
public class PrescriptionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
   // @Column(name = "patient_id")
    private Integer prescriptionId;
   // @Column(name = "doctor_id")
    private String actionItem;
    private String timing1;
    private String timing2;
    private String timing3;
    private String description;
    
    
    public PrescriptionDetails() {
    }
    /*public PrescriptionDetails(Integer id, Integer prescription_id, String diet, String dietIntakeTime,
			String exercise, String exerciseTimings, String medicine, String medicineTakenTime) {
		
		this.id = id;
		this.prescription_id = prescription_id;
		
	}*/


	public Integer getId() {
		return id;
	}


	public PrescriptionDetails(Integer id, Integer prescriptionId, String actionItem, String timing1, String timing2,
			String timing3, String description) {
		super();
		this.id = id;
		this.prescriptionId = prescriptionId;
		this.actionItem = actionItem;
		this.timing1 = timing1;
		this.timing2 = timing2;
		this.timing3 = timing3;
		this.description = description;
	}
	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getPrescriptionId() {
		return prescriptionId;
	}


	public void setPrescriptionId(Integer prescriptionId) {
		this.prescriptionId = prescriptionId;
	}


	public String getActionItem() {
		return actionItem;
	}


	public void setActionItem(String actionItem) {
		this.actionItem = actionItem;
	}


	public String getTiming1() {
		return timing1;
	}


	public void setTiming1(String timing1) {
		this.timing1 = timing1;
	}


	public String getTiming2() {
		return timing2;
	}


	public void setTiming2(String timing2) {
		this.timing2 = timing2;
	}


	public String getTiming3() {
		return timing3;
	}


	public void setTiming3(String timing3) {
		this.timing3 = timing3;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}



	
	

	
   

    
}

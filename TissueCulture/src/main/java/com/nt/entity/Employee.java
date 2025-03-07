package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "EMP_ID", initialValue = 101,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer empId;
	@Column(length=20)
	private String empName;
	private Double empSal;
	@Column(length=20)
	private String empDep;
	private Long empNumber;
}

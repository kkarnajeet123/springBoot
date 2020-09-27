package com.vastika.userinfo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Address_Table")
@Data
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_Id")
	private int addressId;
	@Column(name = "city_name")
	private String cityName;
	@Column(name = "country_name")
	private String countryName;

}

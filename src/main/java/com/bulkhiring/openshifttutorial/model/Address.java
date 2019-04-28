package com.bulkhiring.openshifttutorial.model;

import java.io.Serializable;

public class Address implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -5729755404470014776L;

	private String addressLineOne;

	private String addressLineTwo;

	private String city;

	private String state;

	private String zipcode;

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}

package org.icefaces.training.applicant.view.model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class CountryList {

	private String[] countries = {"Canada", "United States"};

	public String[] getCountries() {
		return countries;
	}

	public void setCountries(String[] countryList) {
		this.countries = countryList;
	}
}

package com.raquel.json;
public class User_ {
	Long id;
	String firstName;
	String lastName;
	String categoria;
	double sueldoBase;
	

	public User_(Long id, String firstName, String lastName, String categoria, double sueldoBase) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.categoria = categoria;
		this.sueldoBase = sueldoBase;
		
		
	}
	
	public double recalcularSueldo() {
		if (this.categoria.equals("cat1")) {
			return this.sueldoBase;
		} else if (this.categoria.equals("cat2")) {
		    return this.sueldoBase + this.sueldoBase*1.3;
		} else if (this.categoria.equals("cat3")) {
			return this.sueldoBase + this.sueldoBase*1.35 + this.sueldoBase*0.32;
		}
		return 0;
	}
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "User_ [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", categoria=" + categoria
				+ ", sueldoBase=" + sueldoBase + "]";
	}

}


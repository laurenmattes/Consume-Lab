package co.ConsumeApiLab.Consume_Lab;

public class Tiny {

	private String name;
	private String innovation;
	private Integer year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInnovation() {
		return innovation;
	}

	public void setInnovation(String innovation) {
		this.innovation = innovation;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Tiny [name=" + name + ", innovation=" + innovation + ", year=" + year + "]";
	}

}

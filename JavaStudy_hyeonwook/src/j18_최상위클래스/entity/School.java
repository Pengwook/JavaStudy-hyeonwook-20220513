package j18_최상위클래스.entity;

import java.util.Objects;

public class School {
	private String schoolName;
	private int schoolAnniversary;
	private String schoolLocation;
	private String schoolType;
	
	public School() {
		
	}

	public School(String schoolName, int schoolAnniversary, String schoolLocation, String schoolType) {
		super();
		this.schoolName = schoolName;
		this.schoolAnniversary = schoolAnniversary;
		this.schoolLocation = schoolLocation;
		this.schoolType = schoolType;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public int getSchoolAnniversary() {
		return schoolAnniversary;
	}

	public void setSchoolAnniversary(int schoolAnniversary) {
		this.schoolAnniversary = schoolAnniversary;
	}

	public String getSchoolLocation() {
		return schoolLocation;
	}

	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolAnniversary, schoolLocation, schoolName, schoolType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		return schoolAnniversary == other.schoolAnniversary && Objects.equals(schoolLocation, other.schoolLocation)
				&& Objects.equals(schoolName, other.schoolName) && Objects.equals(schoolType, other.schoolType);
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", schoolAnniversary=" + schoolAnniversary + ", schoolLocation="
				+ schoolLocation + ", schoolType=" + schoolType + "]";
	}
	
}

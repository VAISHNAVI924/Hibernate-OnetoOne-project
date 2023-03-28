package oneToOnebi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Gst {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String gstnumber;
	private String type;
	
	@OneToOne
	@JoinColumn
	private Company company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGstnumber() {
		return gstnumber;
	}

	public void setGstnumber(String gstnumber) {
		this.gstnumber = gstnumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Gst [id=" + id + ", gstnumber=" + gstnumber + ", type=" + type + ", company=" + company + "]";
	}
	

}

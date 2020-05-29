
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

//This class will be managed by the controller (backing bean)
@ManagedBean

//Objects that are created by this class are going to be RequestScoped
//The instances of this bean are going to be stored in the RequestScope
@RequestScoped
public class UserBean {
	
	
	private String username;

	public UserBean() {
		
		username = "";

	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	

}

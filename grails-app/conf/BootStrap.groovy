import com.Address
import com.User

class BootStrap {

    def init = { servletContext ->
		User userInstance = new User([email: "john@example.com", address: new Address([city: "XYZ",
				phone: "9876543210"])])
		userInstance.save(flush: true)
		println "Saved: " + userInstance.id

		println User.withCriteria {
			projections {
				property("address")
			}
		}
    }
    def destroy = {
    }
}

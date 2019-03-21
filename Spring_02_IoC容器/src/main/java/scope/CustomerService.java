package scope;

/**
 * 演示singleton和prototype的区别
 */
public class CustomerService {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

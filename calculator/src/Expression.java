public class Expression {

    private String rigister;
    private String operation;
    private String value;

    public Expression(String rigister, String operation, String value) {
        this.rigister = rigister;
        this.operation = operation;
        this.value = value;
    }

    public String getRigister() {
        return rigister;
    }

    public void setRigister(String rigister) {
        this.rigister = rigister;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return rigister + " " + operation + " " +value ;
    }
}

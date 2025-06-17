package Testsimulation_Sim1;

/**
 * Exception thrown when a mobile is unbalanced.
 */
public class UnbalancedException extends Exception {

    //TODO: define missing parts of this class.
    public UnbalancedException(int leftTorque, int rightTorque) {
        super("Unbalanced mobile: left torque = " + leftTorque + ", right torque = " + rightTorque);
    }
}

package pragmatic.homework2.classes;

import pragmatic.homework2.interfaces.Developer;
import pragmatic.homework2.interfaces.SystemAdmin;

public class DevOps implements Developer, SystemAdmin {
    @Override
    public void buildSoftware() {
        System.out.println("DevOps: buildSoftware()");
    }

    @Override
    public void makeCodeReview() {
        System.out.println("DevOps:makeCodeReview()");
    }

    @Override
    public void configureMachine() {
        System.out.println("DevOps: configureMachine");
    }

    @Override
    public void supportSoftware() {
        System.out.println("DevOps: supportSoftware()");
    }
}

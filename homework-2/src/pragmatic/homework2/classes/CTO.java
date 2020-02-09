package pragmatic.homework2.classes;

import pragmatic.homework2.interfaces.Developer;
import pragmatic.homework2.interfaces.Manager;
import pragmatic.homework2.interfaces.QA;
import pragmatic.homework2.interfaces.SystemAdmin;

public class CTO extends AutomationQA implements Developer, SystemAdmin, Manager  {
    @Override
    public void buildSoftware() {
        System.out.println("CTO: buildSoftware()");
    }

    @Override
    public void makeCodeReview() {
        System.out.println("CTO: makeCodeReview()");
    }

    @Override
    public void managePeople() {
        System.out.println("CTO: managePeople()");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("CTO: drinkCoffee()");
    }

    @Override
    public void verifySoftwareQuality() {
        System.out.println("CTO: verifySoftwareQuality()");
    }

    @Override
    public void configureMachine() {
        System.out.println("CTO: configureMachine()");
    }

    @Override
    public void supportSoftware() {
        System.out.println("CTO: supportSoftware()");
    }

    @Override
    public void writeAutomationTests() {
        System.out.println("CTO: writeAutomationTests()");
    }
}

package pragmatic.homework2;

import pragmatic.homework2.classes.AutomationQA;
import pragmatic.homework2.classes.CTO;
import pragmatic.homework2.classes.DevOps;
import pragmatic.homework2.classes.SoftwareDeveloper;

public class ITDemo {
    public static void main(String[] args) {

        AutomationQA automationQA = new AutomationQA();
        automationQA.verifySoftwareQuality();
        automationQA.writeAutomationTests();

        DevOps devOps = new DevOps();
        devOps.buildSoftware();
        devOps.configureMachine();
        devOps.makeCodeReview();
        devOps.supportSoftware();

        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper();
        softwareDeveloper.buildSoftware();
        softwareDeveloper.makeCodeReview();

        CTO cto = new CTO();
        cto.buildSoftware();
        cto.drinkCoffee();
        cto.configureMachine();
        cto.verifySoftwareQuality();
        cto.supportSoftware();
        cto.managePeople();
        cto.writeAutomationTests();
        cto.makeCodeReview();

    }
}

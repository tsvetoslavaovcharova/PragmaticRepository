package pragmatic.homework2.classes;

import pragmatic.homework2.interfaces.QA;

public class AutomationQA implements QA {
    @Override
    public void verifySoftwareQuality() {
        System.out.println("AutomationQA: verifySoftwareQuality()");
    }

    public void writeAutomationTests(){
        System.out.println("AutomationQA: writeAutomationTests()");
    }
}

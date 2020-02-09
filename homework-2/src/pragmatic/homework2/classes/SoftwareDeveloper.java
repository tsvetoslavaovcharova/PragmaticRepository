package pragmatic.homework2.classes;

import pragmatic.homework2.interfaces.Developer;

public class SoftwareDeveloper implements Developer {
    @Override
    public void buildSoftware() {
        System.out.println("SoftwareDeveloper: buildSoftware()");
    }

    @Override
    public void makeCodeReview() {
        System.out.println("SoftwareDeveloper: makeCodeReview()");
    }
}

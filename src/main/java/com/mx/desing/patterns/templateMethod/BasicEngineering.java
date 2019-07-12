package com.mx.desing.patterns.templateMethod;

public abstract class BasicEngineering { 

    public void Papers() { // Papers() in the template method
        Math(); //Common Papers:
        SoftSkills();

        SpecialPaper(); //Specialized Paper:
    }

    /* Non-Abstract method Math(), SoftSkills() are //already implemented by Template class */
    private void Math() {
        System.out.println("Mathematics");
    }

    private void SoftSkills() {
        System.out.println("SoftSkills");
    }

    /* Abstract method SpecialPaper() must be implemented in derived classes */
    public abstract void SpecialPaper();
}

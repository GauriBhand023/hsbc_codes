package com.exceptions;

public class LearningModule {
    private ValidAge ageValidator;

    public LearningModule() {
        this.ageValidator = new ValidAge();
    }

    public String getLearningCode(String name, int age) throws WrongInput {
        try {
            String ageCode = ageValidator.getAge(age);
            return name + "-" + ageCode;
        } catch (InvalidAge e) {
            throw new WrongInput("Invalid age provided", e);
        }
    }
}

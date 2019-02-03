package com.example.ketocalculator.model;

public class Calculation {
    private Gender gender = Gender.MALE;

    private int weight;

    private int height;

    private int age;

    private int bodyFatPercentage;

    private EndGoal endGoal = EndGoal.LOSE;

    private int calorieDifference;

    private int carbs = 20;

    private double protein = 0.6;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBodyFatPercentage() {
        return bodyFatPercentage;
    }

    public void setBodyFatPercentage(int bodyFatPercentage) {
        this.bodyFatPercentage = bodyFatPercentage;
    }

    public EndGoal getEndGoal() {
        return endGoal;
    }

    public void setEndGoal(EndGoal endGoal) {
        this.endGoal = endGoal;
    }

    public int getCalorieDifference() {
        return calorieDifference;
    }

    public void setCalorieDifference(int calorieDifference) {
        this.calorieDifference = calorieDifference;
    }

    public int getCarbs() {
        return carbs;
    }

    public void setCarbs(int carbs) {
        this.carbs = carbs;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
}

package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
  private int age; 
 private boolean isFemale;
 private int counter;



public Cat(String name, String furColor, int age, boolean isFemale) {
  this.name = name;
  this.furColor = furColor;
  this.age = age;
  this.isFemale = isFemale;
}

public String getStringAttributes(String op) {
  switch (op) {
    case "#name":
      return name;
    case "#color":
      return furColor;
    default:
      return "ERROR!";
  }
}

public String getAge() {

  if (!isFemale) {
    return String.valueOf(age);
  } else {
    return checkCompliance();
     }
  
  }

private String checkCompliance(){

   counter++;

  switch (counter) {
    case 1:
      return "This is an inappropriate question!"; // 1st time
    case 2:
    return "I've told you once!";// 2nd time
    case 3:
    return "Talk to the hand"; // 3rd time
    default:
      return "1#!?&&%"; // 4th ++
  }
}
}
  

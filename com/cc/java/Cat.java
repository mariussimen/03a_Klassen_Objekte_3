package com.cc.java;

public class Cat {

  private String name;
  private String furColor;
 private int counter;
 private int age;




public Cat(String name, String furColor, int counter) {
  this.name = name;
  this.furColor = furColor;
  this.counter = counter;
  this.age = age;
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
return checkCompliance();
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
  

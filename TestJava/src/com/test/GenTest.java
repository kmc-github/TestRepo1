package com.test;

import java.util.ArrayList;
import java.util.List;

public class GenTest {
  public void main(String[] args)
  {
	  
	  
	  
  }
  
  public void test()
  {
	  List<Animal> animal=new ArrayList<Animal>();
	  List<Dog> dg=new ArrayList<Dog>();
	  add(animal);
  }
  
  public void add(List<Animal> amStore)
  {
	  
	  amStore.add(new Dog());
	  amStore.add(new Cat());
  }
  
}

package com.example;

public class DiscountVisitor implements Visitor{

  
  @Override
  public void visit(AdultTicket adultTicket){
    adultTicket.setPrice(5);
  }

  @Override
  public void visit(GroupTicket groupTicket) {
    groupTicket.getElements().forEach(t -> t.accept(this));
    System.out.println("Discount applied for each ticket");
  }
}

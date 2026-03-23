package com.example;

public interface Visitor {
  void visit(AdultTicket adultTicket);
  void visit(GroupTicket groupTicket);
}

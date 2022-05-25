package com.day5;
import java.util.Scanner;
public class Ticket {
    private int ticketid;
    private int price;
    private static int availableTickets;

    public int getTicketid() {
        return ticketid;
    }

    public void setTicketid(int ticketid) {
        this.ticketid = ticketid;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        Ticket.availableTickets = availableTickets;
    }
    public int calculateTicketCost(int nooftickets){

       int total= nooftickets*getPrice();
       return total;

    }
    public static void main(String[] args) {

    Ticket d1=new Ticket();
    System.out.println("Enter no. bookings");
    int count =0;
    Scanner s= new Scanner(System.in);
    count =s.nextInt();
        System.out.println("Enter available tickets");
        d1.availableTickets=s.nextInt();
    while(count!=0){
        System.out.println("Enter Ticket id:");
        d1.ticketid=s.nextInt();
        System.out.println("Enter the price:");
        d1.price=s.nextInt();
        System.out.println("Enter no. of Tickets:");
        int nooftickets=s.nextInt();
        if(availableTickets-nooftickets>=0){
         availableTickets= getAvailableTickets()-nooftickets;
            System.out.println("Available Tickets:"+availableTickets);
         int total= d1.calculateTicketCost(nooftickets);
         System.out.println("Total Amount:"+total);

        }
        else{
            System.out.println(-1);
            break;
        }
        count--;
    }
    }
}

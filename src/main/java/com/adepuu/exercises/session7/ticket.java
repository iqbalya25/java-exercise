package com.adepuu.exercises.session7;

public class ticket {
        private String name;
        private double price;
        private int ticketbuy;
        private int amountticket = 10;
        private int result;

        public ticket(String name, double price,int ticketbuy2){
            this.name = name;
            this.price = price;
            this.ticketbuy = ticketbuy2;
            this.result = result;
            this.amountticket = amountticket;

        }
        public void processPayment(){
            System.out.println("processing payment buying ticket "+ ticketbuy);
            result = amountticket - ticketbuy;
            if (ticketbuy <= amountticket){
                System.out.println("Payment Success");
            }
            else {
                System.out.println("Payment failed, ticket sold out!");
            }

        }

        public int getResult(){
            return (result);
        }
        public int getamountticket(){
            return (amountticket);
        }

}

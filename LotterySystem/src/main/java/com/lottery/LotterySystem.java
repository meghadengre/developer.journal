package main.java.com.lottery;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class LotterySystem{

    private int maxTicket;
    private Queue<LotteryTicket> ticketSold;

    private AtomicInteger ticketId;


    public LotterySystem(int maxTicket){
        this.maxTicket= maxTicket;
        ticketSold = new ConcurrentLinkedDeque<>();
        ticketId = new AtomicInteger(1);
    }

    public void sellTicket(String userName){
        if(ticketSold.size() < this.maxTicket){
            int ticketIdTemp = ticketId.getAndIncrement();
            LotteryTicket ticket = new LotteryTicket(ticketIdTemp, userName);
            ticketSold.add(ticket);
            System.out.println("Ticket sold: "+ticketIdTemp+": "+userName);
        }else{
            System.out.println("Ticket Failed: "+userName);
        }

    }

}

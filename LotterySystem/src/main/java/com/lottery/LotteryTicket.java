package main.java.com.lottery;

public class LotteryTicket {

    private int ticketNumber;
    private String userName;

    public LotteryTicket(int ticketNumber, String userName) {
        this.ticketNumber = ticketNumber;
        this.userName = userName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

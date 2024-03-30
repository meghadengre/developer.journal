package main.java.com.lottery;

public class LotteryMain {
    public static void main(String args[]){
        int maxTicket = 100;

        LotterySystem lottery = new LotterySystem(maxTicket);

        for(int i=0;i<100000;i++){
            new Thread(() -> {
                lottery.sellTicket("user"+Thread.currentThread().getId());
            }).start();
        }
    }
}

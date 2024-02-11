package ch1;

// 관람객이 소지품을 보관할 수 있는 가방으로, 초대장, 티켓, 현금을 가지고 있다.
public class Bag {

    private Long amount;

    private Invitation invitation;

    private Ticket ticket;

    public boolean hasInvitation() {
        return invitation != null;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }

    /**
     * 이벤트에 당첨된 관람객의 가방 안에는 현금과 초대장이 들어있다.
     * 이벤트에 당첨되지 않은 관람객의 가방 안에는 초대장이 들어있지 않다.
     */

    // 현금과 초대장을 함께 보관하는경우
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    // 초대장 없이 현금만 보관하는 경우
    public Bag(Long amount) {
        this.amount = amount;
    }

}

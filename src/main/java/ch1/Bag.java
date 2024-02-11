package ch1;

// 관람객이 소지품을 보관할 수 있는 가방으로, 초대장, 티켓, 현금을 가지고 있다.
public class Bag {

    private Long amount;

    private Invitation invitation;

    private Ticket ticket;

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    private boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

}

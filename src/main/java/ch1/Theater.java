package ch1;

// 소극장
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 관람객을 맞이한다
     * 초대장이 있는경우 티켓을 끊어주고,
     * 초대장이 없는경우 티켓 판매원이 티켓을 끊어준다.
     * - 관람객에 가방에서 돈을 빼서 티켓의 가격을 지불한다
     * - 티켓 판매원은 매표소에서 관람객으로 부터 돈을 받는다
     * - 고객은 매표원에게 받은 티켓을 가방에 넣는다.
     */
    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }

    }

}

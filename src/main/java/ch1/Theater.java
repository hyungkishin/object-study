package ch1;

// 소극장
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 초대장이 있는 관람객인 경우
     * - 판매원에게서 받은 티켓을 관람객의 가방 안에 넣어준다.
     * 초대장이 없는 관람객인 경우
     * - 관람객의 가방에서 티켓 금액만큼을 차감한 후 메표소에 금액을 증가시킨다.
     * - 관람객의 가방 안에 티켓을 넣어준다.
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

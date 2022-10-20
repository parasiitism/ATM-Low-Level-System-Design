package ATMStates;
import DESIGN_ATM_CODE.ATM;
import DESIGN_ATM_CODE.Card;

public class IdleState extends ATMState {
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}


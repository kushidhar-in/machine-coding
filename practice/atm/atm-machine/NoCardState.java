public class NoCardState implements State{
    AtmMachine atmMachine;

    public NoCardState(AtmMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(int cardNumber){
        System.out.println("user enters card");
        // for now no auth, so assume he enters valid card
        StateData stateData = atmMachine.getStateData();
        stateData.cardNumber = cardNumber;
        atmMachine.setStateData(stateData);
        atmMachine.setState(atmMachine.getHasCardState());
    }
    public void enterPin(int cardPIN){
        System.out.println("no card bhai!!");
    }
    public void dispenseCash(int amount){
        System.out.println("no card bhai!!");
    }
    public void cancel(){
        atmMachine.setStateData(null);
        System.out.println("void operation!! already in initial state:)");
    }
}
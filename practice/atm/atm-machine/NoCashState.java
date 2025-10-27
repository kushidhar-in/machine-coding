public class NoCashState implements State{
    AtmMachine atmMachine;

    public NoCashState(AtmMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(int cardNumber){
        System.out.println("dabbulu levu mowa!");
    }

    @Override
    public void enterPin(int cardPIN){
        System.out.println("dabbulu levu mowa!");
    }

    @Override
    public void dispenseCash(int amount){
        System.out.println("dabbulu levu mowa!");
    }

    @Override
    public void cancel(){
        atmMachine.setStateData(null);
        atmMachine.setState(atmMachine.getNoCardState());
        System.out.println("omkay i am leaving byee :)");
    }
}
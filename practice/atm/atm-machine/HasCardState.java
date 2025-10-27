public class HasCardState implements State{
    AtmMachine atmMachine;

    public HasCardState(AtmMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(int cardNumber){
        System.out.println("card already undi mowa!");
    }

    @Override
    public void enterPin(int cardPIN){
        if(cardPIN % 2 == 0){
            System.out.println("assuming u are good i am authorizing uuuu!!");
            atmMachine.setState(atmMachine.getHasPinState());
        }else{
            System.out.println("invalid pin enter again :(");
        }
    }

    @Override
    public void dispenseCash(int amount){
        System.out.println("pin enter cheyy raa howlaaa");
    }

    @Override
    public void cancel(){
        atmMachine.setStateData(null);
        atmMachine.setState(atmMachine.getNoCardState());
        System.out.println("omkay i am leaving byee :)");
    }
}
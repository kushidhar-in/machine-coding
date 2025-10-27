public class HasPinState implements State{
    AtmMachine atmMachine;

    public HasPinState(AtmMachine atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard(int cardNumber){
        System.out.println("card already undi mowa!");
    }

    @Override
    public void enterPin(int cardPIN){
        System.out.println("enni sarlu enter chestav raa pin ni!!");
    }

    @Override
    public void dispenseCash(int amount){
        if(amount > 1000){
            System.out.println("nee daggara antha cash levu dengey");
        }else if(amount > atmMachine.getAmount()){
            System.out.println("naa daggara antha levu dengei");
        }else{
            int currAmonut = atmMachine.getAmount();
            currAmonut -= amount;
            atmMachine.setAmount(currAmonut);
            System.out.println("tesko pandaga chesko");
            if(currAmonut > 0) {
                atmMachine.setState(atmMachine.getNoCardState());
            }
            else{
                atmMachine.setState(atmMachine.getNoCashState());
            }
            System.out.println("card tisi dengey inka!");
        }
    }

    @Override
    public void cancel(){
        atmMachine.setStateData(null);
        atmMachine.setState(atmMachine.getNoCardState());
        System.out.println("omkay i am leaving byee :)");
    }
}
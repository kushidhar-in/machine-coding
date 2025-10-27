public class AtmMachine {
    State noCardState;
    State hasCardState;
    State hasPinState;
    State noCashState;
    StateData stateData;
    State state = noCashState;
    int amount;

    public AtmMachine(int amount){

        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        hasPinState = new HasPinState(this);
        noCashState = new NoCashState(this);

        this.amount = amount;
        if(this.amount > 0){
            state = noCardState;
        }else if(amount == 0){
            state = noCashState;
        }else{
            System.out.println("inform police!");
            // throw exceptions
        }
    }



    public void insertCard(int cardNumber){
        state.insertCard(cardNumber);
    }


    public void enterPin(int cardPIN){
        state.enterPin(cardPIN);
    }

    public void dispenseCash(int amount){
        state.dispenseCash(amount);
    }

    public void cancel(){
        state.cancel();
    }

    public State getNoCardState() {
        return noCardState;
    }

    public void setNoCardState(State noCardState) {
        this.noCardState = noCardState;
    }

    public State getHasCardState() {
        return hasCardState;
    }

    public void setHasCardState(State hasCardState) {
        this.hasCardState = hasCardState;
    }

    public State getHasPinState() {
        return hasPinState;
    }

    public void setHasPinState(State hasPinState) {
        this.hasPinState = hasPinState;
    }

    public State getNoCashState() {
        return noCashState;
    }

    public void setNoCashState(State noCashState) {
        this.noCashState = noCashState;
    }

    public StateData getStateData() {
        if(this.stateData == null){
            this.stateData = new StateData();
        }
        return this.stateData;
    }

    public void setStateData(StateData stateData) {
        this.stateData = stateData;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
public interface State {
    void insertCard(int cardNumber);
    void enterPin(int cardPIN);
    void dispenseCash(int amount);
    void cancel();
}
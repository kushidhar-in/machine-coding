public class AtmMachineTest {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine(750);
        atmMachine.insertCard(1234);
        atmMachine.enterPin(123456);
        atmMachine.cancel();
        atmMachine.dispenseCash(700);
        atmMachine.insertCard(1234);
        atmMachine.enterPin(12345);
        atmMachine.dispenseCash(700);
    }
}
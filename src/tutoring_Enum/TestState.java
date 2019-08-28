package tutoring_Enum;

public class TestState {
    public static void main(String[] args) {
        State myState= State.ARIZONA ;

       // System.out.println(State.NEW_YORK.getStateName() + " " + State.NEW_YORK.getStateAbbreviation()+ " "+ State.NEW_YORK.getStateCapital() );
        switch (myState){
            case NEW_YORK:
                System.out.println(myState.getStateName());
                System.out.println(myState.getStateAbbreviation());
                System.out.println(myState.getStateCapital());
                break;
            case NEW_JERSEY:
                System.out.println("State name is New Jersey");
                System.out.println("Capital of New Jersey is " + myState.getStateCapital());
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }



    }
}

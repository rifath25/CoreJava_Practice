package tutoring_Enum;

public enum State {
/*
An enum is a special "class" that represents a group of constants (unchangeable variables,
like final variables).To create an enum, use the enum keyword (instead of class or interface),
and separate the constants with a comma. Note that they should be in uppercase letters
 */
    NEW_YORK("NEW YORK", "NY" , "ALBANY"),
    WASHINGTON("WASHINGTON", "WA" , "OLYMPIA"),
    NEW_JERSEY("NEW JERSEY","NJ","TRENTON"),
    ARIZONA("ARIZONA","AZ","PHOENIX");

    private String stateName;
    private String stateAbbreviation;
    private String stateCapital;

    State(String stateName, String stateAbbreviation, String stateCapital) {
        this.stateName = stateName;
        this.stateAbbreviation = stateAbbreviation;
        this.stateCapital = stateCapital;
    }

    public String getStateName() {
        return stateName;
    }

    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public String getStateCapital() {
        return stateCapital;
    }
}

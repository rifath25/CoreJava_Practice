package tutoring_RemoveJunk;

public class ReplaceString {
    public static void main(String[] args) {
        String string="@!$%#*&(%#@&%^(* Remove Junk From This String@$%#@!&*()_*%#$@$@$@";
        String replace= string.replaceAll("[^a-z A-Z 0-9]","");
        System.out.println(replace);

    }
}

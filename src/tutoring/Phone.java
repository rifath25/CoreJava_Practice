package tutoring;

public class Phone {
      /*
      Make a phone class that can have speaker with bose model, display with touch screen,
      a shape of a rectangle, and also have a artificial intelligence feature that speak
      and also can do basic math such as addition, subtraction multiplication, and division.
       Also the when u turn the phone on, it should say a greeting with the name of
       the phone owner. Make sure all the values are initialized in Main
       class so that it can be edited if needed anytime there.

       */

      String speaker;
      String display;
      String shape;
      boolean isCanSpeak;


      public void feature1 (String speaker){
          this.speaker= speaker;
          System.out.println("speaker model is: " +speaker);
      }
      public void feature2 (String display){
          this.display= display;
          System.out.println("display feature: " + display );
      }

      public boolean feature3 (boolean isTrue){          //very important method
          if (isTrue==true){
              System.out.println("This Iphone is a rectangle shape ");
              return isTrue;
          }else {
              System.out.println("This Iphone is not a rectangle shape");
              return isTrue;
          }
      }

      public boolean  feature4 (boolean isCanSpeak){
          return isCanSpeak;
      }

      public void feature5 (String turnOn, String name){
          if (turnOn == "yes"){
              System.out.println(name + "Welcome to iphone");
          }else{
              System.out.println("");
          }

      }

      public void features6 (int num1, int num2, String activity){
          if (activity.equalsIgnoreCase("add") ){
              System.out.println(num1 + num2);
          }else if (activity.equalsIgnoreCase("subtract") ){
              System.out.println(num1 - num2);
          }else if (activity.equalsIgnoreCase("multiply") ){
              System.out.println(num1 * num2);
          }else if (activity.equalsIgnoreCase("division") ){
              System.out.println(num1 / num2);
          }else {
              System.out.println("this phone doesn't have cal feature");
          }
      }

      /*
          You have list of items that are oatmeal, chocolates, chips, paper towel, and broom that you need to buy.
         Your budget is $20. The price for items:oatmeal = $7.76,chocolate = $3.10,chips = $1.50,
         paper towel = $3.80, broom = $15.85 So buy the items that fits under your budget
      */

}

package tutoring_Encapsulation;

public class Vehicle {
    /*
    make a list of vehicle brands, models, years and colors that can only be added & edited
    anytime if needed on vehicle database. Make sure those data are private on concrete class
    but also can access from main class.
     */
      private String  brandName;
      private String  modelName;
      private int year;
      private String color;

      public Vehicle (){}
      public Vehicle (String brandName, String modelName, int year, String color){
          this.brandName= brandName;
          this.modelName=modelName;
          this.year=year;
          this.color=color;
      }

      public String getBrandName(){
          return brandName;
      }

      public void setBrandName(String brandName){
          this.brandName=brandName;
      }

      public String getModelName(){
          return modelName;
      }

      public void setModelName(String modelName){
          this.modelName= modelName;

      }

      public int getYear (){
          return year;
      }

      public void setYear(int year){
          this.year=year;
      }

      public String getColor(){
          return color;
      }

      public void setColor(String color){
          this.color=color;
      }
}

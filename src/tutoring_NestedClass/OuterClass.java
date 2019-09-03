package tutoring_NestedClass;

public class OuterClass {
    /*
    The Java programming language allows you to define a class within
    another class. Such a class is called a nested class and is illustrated
    here.Non-static nested classes (inner classes) have access to other members
    of the enclosing class, even if they are declared private.
     */


    InnerClassA innerClassA = new InnerClassA();
    InnerClassB innerClassB = new InnerClassB();
    InnerClassB.InnerClassC innerClassC= new InnerClassB.InnerClassC();


    public void outerClassMethodA() {
        System.out.println("Outer Method A");
        innerClassA.innerClassMethodA();
        innerClassB.innerClassMethodB();

    }

    private class InnerClassA {
        private String id;

        private void innerClassMethodA() {
            System.out.println("Inner Method A");
        }

    }

    public static class InnerClassB {
        private String dob;

        public void innerClassMethodB() {
            System.out.println("Inner Method B");
        }

        public static class InnerClassC {
            private String name;

            public void innerClassMethodC() {
                System.out.println("Inner Method C");
            }

        }

    }
}





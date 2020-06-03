public class Chapter1 {
    public static void main (String[] args){
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
        exercise12();
        exercise13();
    }
    public static void exercise1(){
        System.out.println("//////////////////////");
        System.out.println("|| Victory is mine! ||");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println();
    }
    public static void exercise2(){
        System.out.println("   \\/");
        System.out.println("  \\\\//");
        System.out.println(" \\\\\\///");
        System.out.println(" ///\\\\\\");
        System.out.println("  //\\\\");
        System.out.println("   /\\");
        System.out.println();
    }
    public static void exercise3 (){
        System.out.println("A well formed Java program has");
        System.out.println("a main method with { and }");
        System.out.println("braces");
        System.out.println();
        System.out.println("A System.out.println statement");
        System.out.println("has ( and ) and usually a");
        System.out.println("String that starts and ends");
        System.out.println("with a \" character.");
        System.out.println("(But we type \\\"instead!)");
        System.out.println();
    }
    public static void exercise4(){
        System.out.println("What is the difference between");
        System.out.println("a ' and a \"? Or between a \" and a \\\"?");
        System.out.println();
        System.out.println("One is what we see when we're typing our program.");
        System.out.println("The other is what appears on the \"console.\"");
        System.out.println();

    }
    public static void exercise5(){
        System.out.println("A \"quoted\" String is");
        System.out.println("'much' better if you learn");
        System.out.println("the rules of \"escape sequences.\"");
        System.out.println("Also, \"\" represents an empty String.");
        System.out.println("Don't forget: use \\\" instead of \" !");
        System.out.println("'' is not the same as \"");
        System.out.println();
    }
    public static void exercise6(){
        System.out.println("There's one thing every coder must understand:");
        System.out.println("The System.out.println command.");
        System.out.println();
    }
    public static void forwardslash(){
        System.out.println("//////////////////////");
    }
    public static void backslash(){
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }
    public static void textmethod(){
        System.out.println("|| Victory is mine! ||");
    }
    public static void exercise7(){
        forwardslash();
        textmethod();
        backslash();
        textmethod();
        backslash();
        textmethod();
        backslash();
        textmethod();
        backslash();
        textmethod();
        forwardslash();
    }
    public static void upperhex(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void lowerhex(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    public static void decorativeline(){
        System.out.println("-\"-'-\"-'-\"-");
    }
    public static void exercise8(){
        upperhex();
        decorativeline();
        lowerhex();
    }
    public static void exercise9(){
        upperhex();
        lowerhex();
        decorativeline();
        upperhex();
        lowerhex();
        decorativeline();
        lowerhex();
        upperhex();
        decorativeline();
        lowerhex();
    }
    public static void nosecone(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void rocketbody(){
        System.out.println("+------+ +------+");
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
        System.out.println("+------+ +------+");
    }
    public static void rocketlogo(){
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
    }
    public static void exercise10(){
        nosecone();
        rocketbody();
        rocketlogo();
        rocketbody();
        nosecone();
    }
    public static void starrow5(){
        System.out.println("*****");
        System.out.println("*****");
    }
    public static void starx(){
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    public static void starcolumn(){
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
    public static void exercise11(){
        starrow5();
        starx();
        System.out.println();
        System.out.println();
        starrow5();
        starx();
        starrow5();
        System.out.println();
        System.out.println();
        starcolumn();
        starrow5();
        starx();
    }
    public static void plusline(){
        System.out.println("  +------+");
    }
    public static void stopline(){
        System.out.println("|   STOP  |");
    }
    public static void exercise12(){
        upperhex();
        lowerhex();
        upperhex();
        lowerhex();
        plusline();
        upperhex();
        stopline();
        lowerhex();
        plusline();
    }
    public static void jackboy10(){
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        System.out.println("All work and no play makes Jack a dull boy.");
        counter+=10;
    }
    public static int counter;
    public static void jackboy100(){
        jackboy10();
        jackboy10();
        jackboy10();
        jackboy10();
        jackboy10();
        jackboy10();
        jackboy10();
        jackboy10();
        jackboy10();
        jackboy10();

    }
    public static void exercise13(){
        jackboy100();
        jackboy100();
        jackboy100();
        jackboy100();
        jackboy100();
        jackboy100();
        jackboy100();
        jackboy100();
        jackboy100();
        jackboy100();
        System.out.println(counter);
    }


}

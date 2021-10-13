
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        final Cachorro pitbull = new Cachorro();
        //pitbull.zoologia = "Bipede";
        
        final Cachorro viraLatas = new Cachorro();
        
        System.out.println(pitbull.zoologia);
        System.out.println(viraLatas.zoologia);
        System.out.println(Cachorro.late());
        
    }
}

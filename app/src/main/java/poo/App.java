package poo;


public class App {    

    public static void main(String[] args) {
       
        //instacia 1
        Buzz b1= new Buzz();   
        b1.capacete("sim");   
        b1.laser("nao");     
        b1.braço("sim");
        b1.asas("sim");
        b1.frase("sim");
        System.out.println("Buzz lightyear 1:\n"+b1.toString()+"\n");

        //instacia 2        
        Buzz b2= new Buzz();   
        b2.capacete("nao");   
        b2.laser("nao");     
        b2.braço("sim");
        b2.asas("nao");
        b2.frase("sim");
        System.out.println("Buzz lightyear 2:\n"+b2.toString()+"\n");

        //instacia 3        
        Buzz b3= new Buzz();   
        b3.capacete("sim");   
        b3.laser("nao");     
        b3.braço("nao");
        b3.asas("sim");
        b3.frase("sim");
        System.out.println("Buzz lightyear 3:\n"+b3.toString()+"\n");


    }
}

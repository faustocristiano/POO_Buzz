package poo;

import java.util.Random;

public class Buzz {

        //atributos
        private String capacete,frase,laser,braço,asas;
        
        //metodos
        public void capacete(String c){
            if(c=="sim"){
                capacete= "Capacete aberto";
            }else
                capacete= "Capacete fechado";
        }

        public void frase(String c){
            if(c=="sim"){
                Random r = new Random();
                int i = r.nextInt(6);
                String[] frases= new String[6];
                frases[0]="Minha imaginação me leva ao infinito e ao além!";
                frases[1]="O nome disso é Buzz Lightyear, Deus é outra coisa!";
                frases[2]="Isto não é voar. Isto é cair, com estilo!";
                frases[3]="Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!";
                frases[4]="Embora você tenha tentado acabar comigo, na vingança não é um ideal que promovemos no meu planeta!";
                frases[5]="Eu sou seu Buzz Lightyear. Vamo voar!";
                frase=frases[i];                
            }else
                frase= "Sem frase aleatória";
        }        

        public void laser(String c){
            if(c=="sim"){
                laser= "Laser aceso";
            }else
                laser= "Laser apagado";
        }

        public void braço(String c){
            if(c=="sim"){
                braço= "Braços abertos";
            }else
                braço= "Braços fechados";
        }

        public void asas(String c){
            if(c=="sim"){
                asas= "Asas abertas";
            }else
                asas= "Asas fechadas";
        }

        public String toString(){
            return capacete+"\n"+ laser+ "\n"+ braço+"\n" + asas +"\n"+frase;
    
        }
   
}

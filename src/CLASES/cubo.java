package CLASES;

public class cubo {
    int a;
    int b; 
    int c;
    public cubo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
   public cubo(){
       
   }

    public int volumen(){
        int v;
        v=this.a*this.b*this.c;
        return v;
    }
}

package CLASES;


public class cuadrilatero {
    int a;
    int b;
    public cuadrilatero(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int perimetro(){
        int p;
        p=this.a +this.a+this.b+this.b;
        return p;
    }
    public int area(){
        int ar;
        ar=this.a*this.b;
        return ar;
    }
}

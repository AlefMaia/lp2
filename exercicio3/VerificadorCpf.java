import java.util.Scanner;
public class VerificadorCpf {
    int v[] = new int[12], p[] = new int[12], r[] = new int[12], r1=0, x, y, resto;
    public void VerificadorX(){
        for(int i=2;i<=10;i++){
            p[i] = i;
        }
        for(int i=2;i<=10;i++){
            r[i] = p[i] * v[i];
            r1 += r[i];
        }
        resto = r1 % 11;
        if(resto < 2){
            x = 0;
        }
        else{
           x = 11 - resto;
        }
    }
    public void VerificadorY(){
        r1=0;
        v[1] = x;
        for(int i=1;i<=10;i++){
            p[i] = (i+1);
        }
        for(int i=1;i<=10;i++){
            r[i] = p[i] * v[i];
            r1 += r[i];
        }
        resto = r1 % 11;
        if(resto < 2){
            y = 0;
        }
        else{
           y = 11 - resto;
        }
        
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        VerificadorCpf Cpf = new VerificadorCpf();
        System.out.println("Qual os 9 primeiro digitos do cpf? ");
        
        for(int i=10;i>=2;i--){
            Cpf.v[i] = input.nextInt();
        }
  
        Cpf.VerificadorX();
        Cpf.VerificadorY();
        
        Cpf.v[1] = Cpf.x;
        Cpf.v[0] = Cpf.y;
        
        System.out.print("O seu CPF é: ");
        
        for(int i=10;i>=0;i--){
            if((i == 7)||(i == 4)){
                System.out.print(".");
            }
            if(i == 1){
                System.out.print("-");
            }
            System.out.print(Cpf.v[i]);
        }
        System.out.println("");
    }
}

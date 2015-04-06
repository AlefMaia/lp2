import java.util.Scanner;
public class NumeroMuitoGrande{
    int v1[] = new int[30], v2[] = new int[30], r[] = new int[31], r1[] = new int[32], x, y;
    public void soma(){
        for(int i=29;i>=0;i--){
            if(v2[i] == -1){
                r[i] = v1[i];
            }
            else{
                r[i] = v1[i] + v2[i];
                if(r[i] > 9){
                    r[i] -= 10;
                    r[i+1] += 1; 
                }
            }
        }
        System.out.print("A soma é: ");
        boolean flag=false;
        for(int i=30;i>=0;i--){
            if(r[i] > 0){
                flag = true;
            }
            if(flag) System.out.print(r[i]);
        }
        System.out.println("");
    }
    
    public void multiplicacao(){
        for(int i=0;i<=29;i++){
            for(int j=0;j<=29;j++){
                if((v2[i] < 0) || (v1[j] < 0)){
                    break;
                }
                else if(v2[i] == 0){
                    r1[i+j] = 0;
                    break;
                }
                else{
                    r1[i+j] += v1[j] * v2[i];
                    if(r1[i+j] > 9){
                        r1[i+j+1] += (r1[i+j]/10);
                        r1[i+j] = (r1[i+j]%10);
                    }
                }
            }
        }
        System.out.print("A multiplicação é: ");
        boolean flag=false;
        for(int i=29;i>=0;i--){
            if(r1[i] > 0){
                flag = true;
            }
            if(flag) System.out.print(r1[i]);
        }
        System.out.println("");
    }
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        NumeroMuitoGrande numero1 = new NumeroMuitoGrande();
        
        for(int i=29;i>=0;i--){
            numero1.v1[i] = -1;
            numero1.v2[i] = -1;
            numero1.r[i] = 0;
            numero1.r1[i] = 0;
        }
        
        System.out.print("Quantos algarismos tem o seu primeiro numero: ");
        numero1.x = input.nextInt();
        System.out.println("Digite o primeiro grande numero: ");
        for(int i=(numero1.x-1);i>=0;i--){
            numero1.v1[i] = input.nextInt();
        }
        
        System.out.print("Quantos algarismos tem o seu segundo numero: ");
        numero1.y = input.nextInt();
        System.out.println("Digite o segundo grande numero: ");
        for(int i=(numero1.y-1);i>=0;i--){
            numero1.v2[i] = input.nextInt();
        }
        numero1.soma();
        numero1.multiplicacao();
    }   
} 

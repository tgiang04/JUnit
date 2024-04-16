public class Caculator {
    public int Cong(int a, int b){
        return a + b;
    }

    public int Tru(int a, int b){
        return a - b;
    }
    
    public int Nhan(int a, int b){
        return a * b;
    }
    
    public int Chia(int a, int b){
        if( b == 0 ){ 
        throw new IllegalArgumentException("Khong the chia cho 0");
    }

    return a / b;
    }
}
package JavaMobile.funcoes.dale;

public class Main {
    void hello() {
        System.out.println("hello!");
    }
    int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {

      int soma = new Main().sum(2,8);
        System.out.println(soma);
    }
}



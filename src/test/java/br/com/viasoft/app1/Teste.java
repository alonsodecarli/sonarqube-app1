package br.com.viasoft.app1;

public class Teste {


    public void metodo() {
        // gere um erro critico no sonar
        System.out.println("Teste");
        // Uso inseguro de senha (Security Hotspot)
        String senha2 = "123456";

        System.out.println(senha2);

        throw new RuntimeException("Erro crítico intencional para SonarQube");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

}

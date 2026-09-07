package atividades;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Aluno: Seu Nome Completo");
        System.out.println("Curso: Programacao Java");
        System.out.println("Atividade de Git e GitHub");
        
        
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.somar(10, 5));
    }
    
}

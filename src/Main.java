import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioAnual,salarioMensal,servicos,capital,medico,educacional,gastosDedutiveis,maximoDedutivel,impostoSalario,
                impostoServicos,impostoCapital,impostoTotal,abatimento,impostoDevido;


        System.out.print("Renda anual com salário: ");
        salarioAnual=sc.nextDouble();
        System.out.print("Renda anual com prestacao de servico: ");
        servicos=sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        capital=sc.nextDouble();
        System.out.print("Gastos médicos: ");
        medico= sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        educacional= sc.nextDouble();

        salarioMensal=salarioAnual/(12);

        if(salarioMensal<3000.0){
            impostoSalario=0.0*salarioAnual;
        } else if (salarioMensal<5000) {
            impostoSalario=0.10*salarioAnual;
        }
        else {
            impostoSalario=0.20*salarioAnual;
        }

        impostoServicos=servicos*0.15;
        impostoCapital=capital*0.20;
        impostoTotal=impostoCapital+impostoServicos+impostoSalario;
        gastosDedutiveis=medico+educacional;
        maximoDedutivel=(impostoSalario+impostoCapital+impostoServicos)*0.30;

        System.out.println("CONSOLIDADO DE RENDA: ");
        System.out.printf("Imposto sobre salário: %.2f%n",impostoSalario);
        System.out.printf("Imposto sobre servicos: %.2f%n",impostoServicos);
        System.out.printf("Imposto sobre ganho de capital: %.2f%n",impostoCapital);

        System.out.println("DEDUCOES: ");
        System.out.printf("Máximo dedutível: %.2f%n",maximoDedutivel);
        System.out.printf("Gastos dedutíveis: %.2f%n",gastosDedutiveis);

        if(maximoDedutivel>(medico+educacional)){
            abatimento=(medico+educacional);
        }
        else {
            abatimento=maximoDedutivel;
        }

        impostoDevido=(impostoTotal)-abatimento;

        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f%n",impostoTotal);
        System.out.printf("Abatimento: %.2f%n",abatimento);
        System.out.printf("Imposto devido: %.2f%n",impostoDevido);




        sc.close();
    }
}
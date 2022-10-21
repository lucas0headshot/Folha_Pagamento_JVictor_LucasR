//João Victor Inácio Mesquita - Não fez a primeira avaliação
//Lucas Teixeira Ronchi
//3-52
//Folha da pagamento

public class folha {
 public static void main(String[] args) {
  empresa Empresa_1 = new empresa(); //Empresa
   Empresa_1.Nome = "Librelato";
   Empresa_1.CNPJ = "123.456.789/0001-23";
   Empresa_1.Endereco = "Universitário";

  funcionario Funcionario_1 = new funcionario(); //Funcionário
   Funcionario_1.Nome = "Luis";
   Funcionario_1.Sobrenome = "Carlos Inácio Putinho";
   Funcionario_1.Departamento = 001;

   String t = "----------"; //Variáveis
   float Salario = 5.45f;
   float HExtra_1 = 552.42f;
   float HExtra_2 = 315.88f;
   float DSR = 126.66f;
   float AdNoturno = 16.66f;
   float INSS = 375.88f;
   float IRRF = 778.13f;
   float CSindical = 178.19f;
   float AssMedica = 38.15f;
   float VAlimentacao = 45.90f;

  System.out.println("001 - " + Empresa_1.Nome + "Recibo de Pagamento de Salário"); //Impressão da FP
  System.out.println(Empresa_1.Endereco + "( Recibo do Empregador março/2010");
  System.out.println("São Paulo, SC   CNPJ: " + Empresa_1.CNPJ + "GERENTE INDUSTRIAL");
  System.out.println(t);
  System.out.println("Matrícula  Nome do Funcionário  CBO  Depto.");
  System.out.println(Funcionario_1.Matricula + " " + Funcionario_1.Nome + " " + Funcionario_1.CBO + " " + Funcionario_1.Departamento);
  System.out.println("Código  |  Descrição      |  Referência  |  Vencimentos  |  Descontos");
  System.out.println(" 2  |  SALÁRIO            |  30  |  " + Salario);
  System.out.println(" 9  |  H.EXTRA 50%            |  014:20  |  " + HExtra_1);
  System.out.println(" 10  |  H.EXTRA 100%            |  006:30  |  " + HExtra_2);
  System.out.println(" 13  |  DSR S/HORAS EXTRAS            |    |  " + DSR);
  System.out.println(" 2  |  SALÁRIO            |  003:00  |  " + AdNoturno); 
 }
}
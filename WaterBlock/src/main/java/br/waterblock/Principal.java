/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.waterblock;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Fabiano Stingelin Cardoso
 */
public class Principal {
    Vector<SensorWatercooler> waterblock = new Vector<>();
    Vector<SensorCooler> dissipador = new Vector<>();

    public Vector<SensorWatercooler> getWaterblock() {
        return waterblock;
    }

    public void setWaterblock(Vector<SensorWatercooler> waterblock) {
        this.waterblock = waterblock;
    }

    public Vector<SensorCooler> getDissipador() {
        return dissipador;
    }

    public void setDissipador(Vector<SensorCooler> dissipador) {
        this.dissipador = dissipador;
    }
    
   
    public static void main (String arg []) throws IOException{
        
        Principal p = new Principal();
        p.execultar();
    }
    
    private void execultar() throws IOException {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("******************************");
            System.out.println("1 - Resfriamento com arrefecimento a ar");
            System.out.println("2 - Resfriamento com arrefecimento com fluído líquido");
            System.out.println("3 - Sair");
            System.out.println("******************************");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    coolerMenu();
                    break;
                case 2:
                    watercoolerMenu();
                    break;
                default:
                    if (opcao == 3) {
                        System.exit(0);
                    }
            }
            System.out.println("Opção Invalida");
        }
    }

      public void watercoolerMenu() throws IOException {   
        
        Principal p = new Principal();
          
        int opcao = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        
        while (true){
            
            System.out.println("1 - Cadastrar Características Geométricos.");
            System.out.println("2 - Cadastrar Características do Fluído Líquido.");
            System.out.println("3 - Selecionar Base de Dados");
            System.out.println("4 - Verificar a Transferencia de Calor.");
            System.out.println("0 - Sair do Sistema.");
            opcao = sc.nextInt();
            switch (opcao) {
			case 1:
				p.cadastrarCaracteristicasGeometricas();
				break;

			case 2:
				p.cadastrarCaracteristicasFluidoLiquido();
				break;
                        case 3:
				p.selecionarBaseDados1();
				break;
                        case 4:
				p.verificarConveccaoFluido();
				break;
                       
			default:
				if (opcao == 0) {
					System.exit(0);
				}
				System.out.println("Opção inválida.");
			}
                }
       }
    
      public void coolerMenu() throws IOException {   
        
        Principal p = new Principal();
          
        int opcao = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
               
        while (true){
            System.out.println("1 - Cadastrar área de superfície de contato"
                    + "do dissipador com o processador .");
            System.out.println("2 - Selecionar Base de Dados");
            System.out.println("3 - Verificar a Transferencia de Calor.");
            System.out.println("0 - Sair do Sistema.");
            opcao = sc.nextInt();
            switch (opcao) {
                        case 1:
				p.cadastrarSuperficie();
				break;
                        case 2:
				p.selecionarBaseDados2();
				break;
                        case 3:
				p.verificarConveccaoAr();
				break;
                       
			default:
				if (opcao == 0) {
					System.exit(0);
				}
				System.out.println("Opção inválida.");
			}
                }
        }

public void cadastrarSuperficie(){
    Geometria g = new Geometria();
    Scanner sc = new Scanner(System.in);
   
        System.out.println("Entre com a área de superfície de contato"
                + "com o componente eletrônico: ");
        float areaSuperficieContato = sc.nextFloat();
        g.setAreaSuperficieContato(areaSuperficieContato);
      
        System.out.println("*************************");
        }

public void cadastrarCaracteristicasGeometricas(){
    Geometria g = new Geometria();
    Scanner sc = new Scanner(System.in);
   
        System.out.println("*************************");
        System.out.println("\n Dados do geométricos do Waterblock");
        System.out.println("Entre com a Condutividade térmica do material, por"
                + "exmplo, cobre, alumínio...: ");
        float condutividadeMaterial = sc.nextFloat();
        g.setCondutividadeMaterial(condutividadeMaterial);
        
        System.out.println("Entre com a quantidade de microcanais existente no"
                + "Waterblok: ");
        int qtdaMicrocanais = sc.nextInt();
        g.setQtdaMicrocanais(qtdaMicrocanais);
        
        System.out.println("Entre com a altura do microcanal: ");
        float alturaMicrocanal = sc.nextFloat();
        g.setAlturaMicrocanal(alturaMicrocanal);
        
        System.out.println("Entre com a largura do microcanal: ");
        float larguraMicrocanal = sc.nextFloat();
        g.setLarguraMicrocanal(larguraMicrocanal);
        
        System.out.println("Entre com a quantidade de aletas: ");
        int qtdaAletas = sc.nextInt();
        g.setQtdaAletas(qtdaAletas);
        
        System.out.println("Entre com a área de superfície de contato"
                + "com o componente eletrônico: ");
        float areaSuperficieContato = sc.nextFloat();
        g.setAreaSuperficieContato(areaSuperficieContato);
        
        System.out.println("Entre com o perímetro total do microcanal: ");
        float perimetroMicrocanal = sc.nextFloat();
        g.setPerimetroMicrocanal(perimetroMicrocanal);
        
        System.out.println("*************************");
    }
    

public void cadastrarCaracteristicasFluidoLiquido(){
   Fluido f = new Fluido();
    Scanner sc = new Scanner(System.in);
   
        System.out.println("*************************");
        System.out.println("\n Dados do Fluído Líquido");
        System.out.println("Entre com a Condutividade do Fluído: ");
        float condutividadeFluido = sc.nextFloat();
        f.setCondutividadeFluido(condutividadeFluido);
        
        System.out.println("Entre com a massa específica: ");
        float massaEspecifica = sc.nextFloat();
        f.setMassaEspecifica(massaEspecifica);
        
        System.out.println("Entre com a viscosidade dinâmica: ");
        float viscosidadeDinamica = sc.nextFloat();
        f.setViscosidadeDinamica(viscosidadeDinamica);
        
        System.out.println("Entre com a capacidade calorífica específica"
                + "do fluído: ");
        float capacidadeCalorifica = sc.nextFloat();
        f.setCapacidadeCalorifica(capacidadeCalorifica);
        
        System.out.println("*************************");
    }

private void selecionarBaseDados1() throws FileNotFoundException, IOException{
    SensorWatercooler w = new SensorWatercooler();

    float tIn = 0;
    float tOut = 0;
    float vazao = 0;
    float qReal1 = 0;
    float tCpu = 0;
    float tempo = 0;
    
    String VIRGULA = ",";
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("sensores_temp.csv")));
        String linha = null;
        while ((linha = reader.readLine()) != null) {
            String[] dadosSensores = linha.split(VIRGULA);
            System.out.println(Arrays.toString(dadosSensores));
            System.out.println("Temperatura de Entrada do Fluído: " + dadosSensores[0]);
            tIn += Float.parseFloat(dadosSensores[0]);
            w.settIn(tIn);
            System.out.println("Temperatura de Saída do Fluído: " + dadosSensores[1]);
            tOut += Float.parseFloat(dadosSensores[1]);
            w.settOut(tOut);
            System.out.println("Velocidade de vazão do Fluído: " + dadosSensores[2]);
            vazao += Float.parseFloat(dadosSensores[2]);
            w.setVazao(vazao);
            System.out.println("Qreal WATERCOOLER: " + dadosSensores[3]);
            qReal1 += Float.parseFloat(dadosSensores[3]);
            w.setqReal1(qReal1);
            System.out.println("Temperatura interna do processador: " + dadosSensores[4]);
            tCpu += Float.parseFloat(dadosSensores[4]);
            w.settCpu(tCpu);
            System.out.println("Tempo: " + dadosSensores[7]);
            tempo += Float.parseFloat(dadosSensores[7]);
            w.setTempo(tempo);
            this.waterblock.add(w);
            System.out.println("--------------------------");
        }
        reader.close();
  }

public void selecionarBaseDados2() throws FileNotFoundException, IOException{
    Principal p = new Principal();
    SensorWatercooler w = new SensorWatercooler();
    SensorCooler c = new SensorCooler();
    
    float qReal2 = 0;
    float  tAmb = 0;
    float tCpu = 0;
    
    
    String VIRGULA = ",";
    
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("sensores_temp.csv")));
        String linha = null;
        while ((linha = reader.readLine()) != null) {
            String[] dadosSensores = linha.split(VIRGULA);
            System.out.println(Arrays.toString(dadosSensores));
            System.out.println("Temperatura interna do processador: " + dadosSensores[4]);
            tCpu += Float.parseFloat(dadosSensores[4]);
            w.settCpu(tCpu);
            System.out.println("Temperatura ambiente: " + dadosSensores[5]);
            tAmb += Float.parseFloat(dadosSensores[5]);
            c.settAmb(tAmb);
            System.out.println("Qreal COOLER: " + dadosSensores[6]);
            qReal2 += Float.parseFloat(dadosSensores[6]);
            c.setqReal2(qReal2);

            this.dissipador.add(c);
            System.out.println("--------------------------");
        }
        reader.close();
  }

public void verificarConveccaoAr(){
   
    Geometria g = new Geometria();
    SensorCooler c = new SensorCooler();
    SensorWatercooler w = new SensorWatercooler();

    float areaContato = g.getAreaSuperficieContato();
    float qReal2 = c.getqReal2();
    float tCpu = w.gettCpu();
    float tAmb = c.gettAmb();
    float tempo = w.getTempo();
    float u1 = 0;
    float qDissipado1 = 0;
        
    
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (int i = 0; i < this.waterblock.size(); i++) {
        SensorWatercooler sw = (SensorWatercooler) this.waterblock.get(i);
            
        u1 = qReal2/areaContato*(tCpu-tAmb);
        qDissipado1 = u1*areaContato*(tCpu-tAmb);
               
            System.out.println("*************************");
            System.out.println("\n Convecção Térmica por Fluído. "+dateFormat);
            System.out.println("\n Tempo decorrido da coleta de dados: "+tempo);
            System.out.println("\n Coeficiente Global de Transferência de Calor: "+u1);
            System.out.println("\n Taxa de Calor dissipado: "+qDissipado1);
            System.out.println("*************************");
        }
    }

private void verificarConveccaoFluido(){
    Fluido f = new Fluido();
    Geometria g = new Geometria();
    SensorCooler c = new SensorCooler();
    SensorWatercooler w = new SensorWatercooler();

    float qtdaAletas = g.getQtdaAletas();
    float alturaMicrocanal = g.getAlturaMicrocanal();
    float larguraMicrocanal = g.getLarguraMicrocanal();
    float qtdaMicrocanais = g.getQtdaMicrocanais();
    
    
    float areaContato = g.getAreaSuperficieContato();
    float tCpu = w.gettCpu();
    float tIn = w.gettIn();
    float tOut = w.gettOut();
    float vazao = w.getVazao();
    float capacidadeCalorifica = f.getCapacidadeCalorifica();
    float viscosidadeDinamica = f.getViscosidadeDinamica();
    float condutividadeFluido = f.getCondutividadeFluido();
    float massaEspecifica = f.getMassaEspecifica();
    float qReal1 = w.getqReal1();
    float tempo = w.getTempo();
   
    float u2 = 0;
    float qDissipado = 0;
   
    float alturaTotal = alturaMicrocanal*qtdaMicrocanais;
    float larguraTotal = larguraMicrocanal*qtdaMicrocanais;
    float perimetroMicrocanal = (alturaTotal + larguraTotal)*2;
    float areaTransversal = alturaTotal * larguraTotal;
    float variacaoTemperatura = tOut - tIn;
    float diametroHidraulico = 4*(areaTransversal / perimetroMicrocanal);
    float caudalVolumetrico = vazao / areaTransversal;
    float caudalMassico = caudalVolumetrico * capacidadeCalorifica;
    float prandtl = (viscosidadeDinamica * capacidadeCalorifica) / condutividadeFluido;
    float reynolds = (massaEspecifica * caudalVolumetrico * diametroHidraulico) / prandtl;
    float nusselt = (float) (0.012 * (1 + pow(reynolds, 0.87-280)*pow(diametroHidraulico,2/3)*pow(viscosidadeDinamica,0.4)));   
    float dtml = (float) ((tCpu-tIn)-(tCpu-tOut)/(log(tCpu-tIn/tCpu-tOut)));
    
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
            System.out.println("*************************");
            System.out.println("\n Simulação");
            System.out.println("\n Área das aletas internas do waterblock [mm]: "+qtdaAletas*(alturaMicrocanal*2)*2);
            System.out.println("\n Perímetro do micro canal [mm]: "+perimetroMicrocanal);
            System.out.println("\n Largura TOTAL do micro canal [mm]: "+larguraTotal);
            System.out.println("\n Altura TOTAL do micro canal [mm]: "+alturaTotal);
            System.out.println("\n Area da superfície aquecida + Área das aletas [mm²]: "+alturaTotal);
            System.out.println("\n Área da secção transversal [mm]: "+areaTransversal);
            System.out.println("\n Variação da temperatura [ºC]: "+variacaoTemperatura);
            System.out.println("\n Diâmetro Hidráulico [mm]: "+diametroHidraulico);
            System.out.println("\n Caudal Volumétrico [ml/min]: "+caudalVolumetrico);
            System.out.println("\n Caudal mássico [kg/s]: "+caudalMassico);
            System.out.println("\n Número de Prandtl: "+prandtl);
            System.out.println("*************************");
        
        for (int i = 0; i < this.waterblock.size(); i++) {
        SensorWatercooler sw = (SensorWatercooler) this.waterblock.get(i);
            
        u2 = qReal1/areaContato*dtml;
        qDissipado = u2*areaContato*dtml;
        
            
            System.out.println("*************************");
            System.out.println("\n Convecção Térmica por Fluído. "+dateFormat);
            System.out.println("\n Tempo decorrido da coleta de dados: "+tempo);
            System.out.println("\n Reynolds[ml/min]: "+reynolds);
            System.out.println("\n Nusselt: "+nusselt);
            System.out.println("\n DTML - Temperatura Média Logarítmica [ºC]: "+dtml);
            System.out.println("\n Coeficiente Global de Transferência de Calor: "+u2);
            System.out.println("\n Taxa de Calor dissipado: "+qDissipado);
            System.out.println("*************************");
        }      
    }
}


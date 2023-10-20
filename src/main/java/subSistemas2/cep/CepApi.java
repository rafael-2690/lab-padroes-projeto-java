package subSistemas2.cep;

public class CepApi {
    private static CepApi instacia = new CepApi();

    private CepApi(){
        super();
    }
    public static CepApi getInstance(){
        return instacia;
    }

    public String recuperarCidade(String cep){
        return "Angra dos Reis";
    }
    public String recuperarEstado(String cep){
        return "RJ";
    }
}

package teste;


public class ParametrosInvalidosException {   
	NumeroEmFluxo numeroEmFluxo = new NumeroEmFluxo;
	
    public void digita() throws Exception {
		numeroEmFluxo.conta();
       
        if (numeroEmFluxo.getNum1() < numeroEmFluxo.getNum2()) {
			int result = numeroEmFluxo.getNum2() - numeroEmFluxo.getNum1();
            for (int i = 0; i < result; i++) {
                System.out.println(i + 1);
            }
        }else
            throw new Exception("O primeiro númeor não pode ser menor que o segundo");
    }

}

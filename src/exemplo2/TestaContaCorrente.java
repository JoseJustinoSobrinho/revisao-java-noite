package exemplo2;

public class TestaContaCorrente {

	public static void main(String[] args) {

		Cliente natan = new Cliente("Natan", "123.456.789-00", 21);
		ContaCorrente contaNatan = new ContaCorrente();
		contaNatan.setCliente(natan);
		contaNatan.setAgencia("1234-5");
		contaNatan.setNumero("123-3");
		contaNatan.setLimite(1000f);
		contaNatan.setSaldo(2000f);

		Cliente jackson = new Cliente("Jackson", "999.777.666-00", 45);
		ContaCorrente contaJackson = new ContaCorrente();
		contaJackson.setCliente(jackson);
		contaJackson.setAgencia("999-5");
		contaJackson.setNumero("9898-3");
		contaJackson.setLimite(1000f);
		contaJackson.setSaldo(3000f);
		
//		contaNatan.deposita(600f);
//		contaJackson.saca(500f);
		
	    contaJackson.transfere(3200f, contaNatan);	
//		contaNatan.transfere(200f, contaJackson);
	
	    System.out.println(contaNatan);
	    System.out.println(contaJackson);
	    
	}

}

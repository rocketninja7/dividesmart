class SplitWise {
	public static final void main(String args[]) {
		People[] people = {
			new People("Ouyang"),
			new People("Ruiyang"),
			new People("Levin"),
			new People("Andrew"),
			new People("Linh"),
		}
		List<Transaction> transactions = new ArrayList<>();
		InputStreamReader reader = new InputStreamReader(new File("SplitWise.txt"));    
        BufferedReader scanner = new BufferedReader(reader);
        while(scanner.hasNext()){
        	String[] input = scanner.readLine().split(" ");
        	People[] payers = people[input.length-3];
        	for(int i=3;i<input.length;i++){
        		payers[i-3] = people[Integer.parseInt(input[i])];
        	}
        	Transaction transaction = new Transaction(input[0], Double.parseDouble(input[1]), people[Integer.parseInt(input[2])], payers);
    		transactions.add(transaction);
    	}
    	while(true){
    		System.out.println("Current status:");
    		for(People p: people){
    			p.printOwed();
    		}
    		InputStreamReader reader = new InputStreamReader(System.in);    
        	BufferedReader scanner = new BufferedReader(reader);
        	
		}
	}

	public void add_transaction(Double amount, int payers){
		System.out.println("Payer names:")
		InputStreamReader reader = new InputStreamReader(System.in);    
        BufferedReader scanner = new BufferedReader(reader);
		String[] input;
		input = scanner.readLine().split(" ");
		System.out.println()

	}
}
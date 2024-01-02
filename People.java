class People {
	private String name;
	private Map<People, Map<String, Double>> amountIOwe;

	public People(String name){
		this.name = name;
	}

	public addAmountOwed(People p, String currency, double amount) {
		if(amountIOwe.get(p) == null){
			amountIOwe.put(p, new HashMap<>());
		}
		if(amountIOwe.get(p).get(currency) == null){
			amountIOwe.get(p).put(currency, 0);
		}
		int currentOwed = amountIOwe.get(p).get(currency);
		amountIOwe.get(p).put(currency, currentOwed + amount);
	}

	public printOwed(){
		for(People p: amountIOwe.getKeys()){
			System.out.print(f"{name} owes {p.getName()} ");
			for(String currency: amountIOwe.get(p).getKeys()){
				System.out.print(f"{currency} {amountIOwe.get(p).get(currency)} ")
			}
			System.out.println();
		}
	}

	public getName(){
		return name;
	}
}
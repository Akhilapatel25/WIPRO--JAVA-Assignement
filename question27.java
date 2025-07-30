package javaassignment;


	enum Currency {
	    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
	}

	public class question27{
	    public static void main(String[] args) {
	        for (Currency c : Currency.values()) {
	            System.out.print(c + ": ");
	            switch (c) {
	                case ONE:
	                    System.out.println("₹1 note");
	                    break;
	                case TWO:
	                    System.out.println("₹2 note");
	                    break;
	                case FIVE:
	                    System.out.println("₹5 note");
	                    break;
	                case TEN:
	                    System.out.println("₹10 note");
	                    break;
	                case TWENTY:
	                    System.out.println("₹20 note");
	                    break;
	                case FIFTY:
	                    System.out.println("₹50 note");
	                    break;
	            	        }
	    }
	}


}

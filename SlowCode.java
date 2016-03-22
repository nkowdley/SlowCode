public class SlowCode {
    
    public static void main(String[] args) {
	
        if (args.length != 1) {
			System.out.println("Just one argument, buddy!");
			System.exit(1);
	}

	int val = Integer.parseInt(args[0]) - 1;

	Other o = new Other(val);

	Prefacer.preface(3000);
	
	System.out.println(Prefacer.nirp.substring(0,1000));
	
	System.out.println("Statistics of value " + val + ":");
	System.out.println("Chirpy Number? " + Chirp.isChirpy(val));
	System.out.println("Nirpy Number? " + Chirp.isNirpy(val));
	System.out.println("Schnirpiness Level " + Chirp.schnirpyLevel(val));
	System.out.println("Threat Level: " + o.threatLevel(val));
	System.out.println("DEFCON: " + o.defcon(val));
    }
}

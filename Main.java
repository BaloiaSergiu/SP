
public class Main {
	public static void main (String []args){
		/*Book noapteBuna = new Book("Noapte buna, copii!");
		Author gheo = new Author ("Radu Pavel Gheo");
		noapteBuna.addAuthor(gheo);
		noapteBuna.add(new Paragraph("Multumesc, ... "));
		Element cap1 = new Section("Capitolul 1");
		cap1.add(new Paragraph("Aici..."));
		Element cap11 = new Section("Subcapitol 1.1");
		cap11.add(new Section("Sub subcapitol 1.1.1"));
		cap11.add(new Paragraph("Primul sub subcapitol"));
		cap11.add(new Section("Sub subcaptiol 1.1.2"));
		cap11.add(new Paragraph("Al doilea sub subcapitol"));
		Element cap12 = new Section("Subcapitol 1.2");
		cap1.add(cap11);
		cap1.add(cap12);
		noapteBuna.add(cap1);
		
		noapteBuna.print();*/
		
		
		long startTime = System.currentTimeMillis();
		Section cap1 = new Section("PlayBoy");
		cap1.add(new Image("Alexis Texas"));
		Section cap2 = new Section("Auto Show");
		cap2.add(new Image("My dream BMW"));
		cap2.add(new Image("My car is a bemveu"));
		cap1.print();
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}
}

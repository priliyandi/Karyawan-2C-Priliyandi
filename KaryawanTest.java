public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	Pm p = new Pm();
	p.setNama("Priliyandi");
	p.setAlamat("Majasih");
	p.setGaji(60);
	System.out.println(" ");

	System.out.println("Jabatan Programer");
	Program pr = new Program();
	pr.setNama("Joni");
	p.setAlamat("Sliyeg");
	p.setGaji(85);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Adit");
	d.setAlamat("Jatibarang");
	d.setGaji(50);
	}
}
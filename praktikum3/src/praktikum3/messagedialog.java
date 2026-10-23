package praktikum3;

import javax.swing.JOptionPane;

public class messagedialog {
	public static void main(String[] args) {
		JOptionPane jop= new JOptionPane();
		
//		jop.showMessageDialog(null,"ahahha","Pesan Penting",jop.WARNING_MESSAGE);
		
//		string nama=jop.showInputDialog(null,"Masukan nama anda");
//		jop.showMessageDialog(null, nama);
		
//		int confirm=jop.showConfirmDialog(null, "apakah ini kelas pbo","konfirmasi",jop.YES_NO_OPTION);
//		
//		if(confirm==1) {
//			jop.showMessageDialog(null, "anda pilih no ");
//		}else {
//			jop.showMessageDialog(null, "anda pilih yes ");
//		}
		
		String input = JOptionPane.showInputDialog(null,"masukan umur anda");
		
		int umur =Integer.parseInt(input);
		
		if (umur >= 17) {
			JOptionPane.showMessageDialog(null,"Selamat Datang");
		}else {
			JOptionPane.showMessageDialog(null, "Maaf,umur anda belum cukup");
		}
		
	}
}

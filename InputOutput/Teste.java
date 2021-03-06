import java.io.*;

public class Teste {

	public static void main(String[] args) {

		File in, in2, out;
		FileReader fr = null;
		FileReader fr2 = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedReader br2 = null;
		BufferedWriter bw = null;

		try {
			in = new File("Entrada.txt");
			fr = new FileReader(in);
			br = new BufferedReader(new FileReader("Entrada.txt"));

			in2 = new File("Entrada2.txt");
			fr2 = new FileReader(in2);
			br2 = new BufferedReader(new FileReader("Entrada2.txt"));

			out = new File("saida.txt");
			fw = new FileWriter(out);
			bw = new BufferedWriter(new FileWriter("Saida.txt"));

			String line = br.readLine();
			String line2 = br2.readLine();

			while (line != null || line2 != null) {
				if(line != null && line2 != null) {
					if (line.compareTo(line2) > 0) {
						bw.write(line2);
						bw.newLine();
						line2 = br2.readLine();
					} else {
						bw.write(line);
						bw.newLine();
						line = br.readLine();
					}
						
				} else if (line !=null) {
					bw.write(line);
					bw.newLine();
					line = br.readLine();
				}else {
					bw.write(line2);
					bw.newLine();
					line2 = br2.readLine();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				fw.flush();
				bw.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}
	}
}

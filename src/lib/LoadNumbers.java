package lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Vector;

import objects.Draw;

public class LoadNumbers {
	/**
	 * Tag	Monat	Jahr	ZahlA1	ZahlA2	ZahlA3	ZahlA4	ZahlA5	ZahlB1	ZahlB2
	 */
	public Vector<Draw> loadNumbers(){
		Vector<Draw> items = new Vector<Draw>();
			InputStream in = getClass().getResourceAsStream("/data/numbers.txt");
				try(BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
				    for(String line; (line = br.readLine()) != null; ) {
				        String[] litems = line.split("\t");
				        items.add(
				        		new Draw(
				        				Integer.valueOf(litems[0]),
				        				Integer.valueOf(litems[1]),
				        				Integer.valueOf(litems[2]),
				        				Integer.valueOf(litems[3]),
				        				Integer.valueOf(litems[4]),
				        				Integer.valueOf(litems[5]),
				        				Integer.valueOf(litems[6]),
				        				Integer.valueOf(litems[7]),
				        				Integer.valueOf(litems[8]),
				        				Integer.valueOf(litems[9])
				        				));
				    }
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return items;
	}
	
	
}
